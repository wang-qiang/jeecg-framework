package com.media.test;

import org.springframework.test.context.junit4.*;
import org.springframework.test.context.ContextConfiguration;
import org.junit.*;
import java.util.List;
import com.media.service.*;
import com.media.dao.*;
import com.media.entities.*;

@ContextConfiguration(locations={"/applicationContext.xml"})
public class DaoTest extends AbstractJUnit4SpringContextTests  {

  private SysConfigService scSvr;

  public SysConfigService getScSvr() {
    return scSvr;
  }

  public void setScSvr(SysConfigService scSvr) {
    this.scSvr = scSvr;
  }
  
  @Test
  public void testDictionDao() {
    try {
      scSvr = (SysConfigService)applicationContext.getBean("sysConfigTarget");
      DictionaryDao dao = scSvr.getDictionaryDao();
      List list = dao.getDictionaryList();
      Assert.assertEquals(true, list.size() != 0);
      Dictionary dic = (Dictionary) (list.get(0));
      Assert.assertEquals(true, Integer.parseInt(dic.getDictionaryid()) > 0);
    } catch (Exception e) {
      e.printStackTrace();
      Assert.fail(e.getLocalizedMessage());
    }
  }
}
