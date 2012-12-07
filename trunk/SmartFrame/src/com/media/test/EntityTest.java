package com.media.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import com.media.util.LogUtil;
import org.junit.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.media.entities.*;

@ContextConfiguration(locations={"/applicationContext.xml"})
public class EntityTest extends AbstractJUnit4SpringContextTests{
  Session session = null;

  @Before
  public void setUp() throws Exception {
    try {
      SessionFactory sessionFactory = (SessionFactory)applicationContext.getBean("sessionFactory");
      session = sessionFactory.openSession();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @After
  public void tearDown() throws Exception {
    try {
      session.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testDicSave() {
    try {
      LogUtil.info("hello");
      Dictionary dic = new Dictionary();
      dic.setDictionaryid("27");
      dic.setTypenamecn("测试");
      dic.setTypenameen("test");
      dic.setTypetype("27");
      session.save(dic);
      session.flush();
    } catch (Exception e) {
      e.printStackTrace();
      Assert.fail(e.getLocalizedMessage());
    }
  }
}
