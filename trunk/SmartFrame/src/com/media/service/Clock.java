package com.media.service;

import java.util.Collection;
import java.util.Date;

import javax.servlet.ServletContext;

import org.directwebremoting.ServerContext;
import org.directwebremoting.ServerContextFactory;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;
import org.directwebremoting.util.Logger;
import com.media.util.LogUtil;
/**
 * @author Joe Walker [joe at getahead dot ltd dot uk]
 */
public class Clock implements Runnable {
  /**
       *
       */
  public Clock() {
    ServletContext servletContext = WebContextFactory.get().getServletContext();
    sctx = ServerContextFactory.get(servletContext);
  }

  /**
       *
       */
  public synchronized void toggle() {
    active = !active;
    LogUtil.debug("Sent message active:" + active);
    if (active) {
      LogUtil.debug("Sent message active 1");
      new Thread(this).start();
      LogUtil.debug("Sent message active 2");
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Runnable#run()
   */
  public void run() {
    try {
      LogUtil.debug("CLOCK: Starting server-side thread");

      while (active) {
        Collection sessions = sctx
            .getScriptSessionsByPage("/SmartFrame/test.htm");
        Util pages = new Util(sessions);
        pages.setValue("clockDisplay", new Date().toString());
        LogUtil.debug("Sent message" + new Date().toString());
        Thread.sleep(1000);
      }

      Collection sessions = sctx
          .getScriptSessionsByPage("/SmartFrame/test.htm");
      Util pages = new Util(sessions);
      pages.setValue("clockDisplay", "");

      LogUtil.debug("CLOCK: Stopping server-side thread");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /**
   * Our key to get hold of ServerContexts
   */
  private ServerContext sctx;

  /**
   * Are we updating the clocks on all the pages?
   */
  private transient boolean active = false;
}
