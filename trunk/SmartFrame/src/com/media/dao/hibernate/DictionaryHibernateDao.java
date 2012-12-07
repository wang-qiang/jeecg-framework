package com.media.dao.hibernate;

import org.springframework.orm.hibernate3.support.*;
import java.util.*;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateCallback;
import java.sql.SQLException;
import com.media.dao.DictionaryDao;
import com.media.entities.Dictionary;
import com.media.entities.Dictionaryitem;

public class DictionaryHibernateDao extends HibernateDaoSupport implements DictionaryDao{

  public DictionaryHibernateDao() {
  }

  private static final String LOAD_DICTIONARYS = "from Dictionary order by dictionaryid";
  private static final String LOAD_DICITEMS_BYDICID = "from Dictionaryitem where dictionaryid = ? order by itemorder,itemvalue";
  private static final String REMOVE_DICITEM = "delete from Dictionaryitem where idemid in (:ids)";

  public void saveDicItem(Dictionaryitem item){
    this.getHibernateTemplate().saveOrUpdate(item);
  }
  
  public List getDictionaryList(){
    return this.getHibernateTemplate().find(LOAD_DICTIONARYS);
  }
  
  public Dictionary getDictionaryEntity(String id){
    return (Dictionary)this.getHibernateTemplate().get(Dictionary.class, id);
  }
  
  public List getDictionaryItemList(String DicId){
    return this.getHibernateTemplate().find(LOAD_DICITEMS_BYDICID, DicId);
  }
  
  public Dictionaryitem getDictionaryitemEntity(String itemId){
    return (Dictionaryitem)this.getHibernateTemplate().get(Dictionaryitem.class,itemId);
  }
  
  public void removeDictionaryItem(final String ids){
    this.getHibernateTemplate().execute(new HibernateCallback(){
      public Object doInHibernate(Session s) throws HibernateException,SQLException{
        Query query = s.createQuery(REMOVE_DICITEM);
        query.setString("ids",ids);
        query.executeUpdate();
        return null;
      }
    });
  }
}
