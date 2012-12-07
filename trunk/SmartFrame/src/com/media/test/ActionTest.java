package com.media.test;

import com.opensymphony.xwork2.ActionProxy;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.apache.struts2.StrutsSpringTestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import com.media.web.action.*;
import com.media.service.*;
import com.media.dao.*;
import com.media.dao.hibernate.*;
import com.media.entities.*;

public class ActionTest extends StrutsSpringTestCase {

  protected void setUp() throws Exception {
    try {
      super.setUp();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void tearDown() throws Exception {
    try {
      super.tearDown();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void testDictionDao() {
    try {
      String url = "/DicManage!list.action";
      ActionMapping mapping = getActionMapping(url);
      assertNotNull(mapping);
      assertEquals("/", mapping.getNamespace());
      assertEquals("DicManage", mapping.getName());
      assertEquals("list", mapping.getMethod());
    } catch (Exception e) {
      e.printStackTrace();
      fail(e.getLocalizedMessage());
    }
  }

//  public void testGetActionMapping() {
//    ActionMapping mapping = getActionMapping("/test/testAction.action");
//    assertNotNull(mapping);
//    assertEquals("/test", mapping.getNamespace());
//    assertEquals("testAction", mapping.getName());
//  }
//
//  public void testGetActionProxy() throws Exception {
//    // set parameters before calling getActionProxy
//    request.setParameter("name", "FD");
//
//    ActionProxy proxy = getActionProxy("/test/testAction.action");
//    assertNotNull(proxy);
//
//    TestAction action = (TestAction) proxy.getAction();
//    assertNotNull(action);
//
//    String result = proxy.execute();
//    assertEquals(Action.SUCCESS, result);
//    assertEquals("FD", action.getName());
//  }
//
//  public void testExecuteAction() throws ServletException,
//      UnsupportedEncodingException {
//    String output = executeAction("/test/testAction.action");
//    assertEquals("Hello", output);
//  }
//
//  public void testGetValueFromStack() throws ServletException,
//      UnsupportedEncodingException {
//    request.setParameter("name", "FD");
//    executeAction("/test/testAction.action");
//    String name = (String) findValueAfterExecute("name");
//    assertEquals("FD", name);
//  }

}
