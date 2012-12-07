package com.media.service;

import com.media.dao.DictionaryDao;

public class SysConfigService {
  
  private DictionaryDao dictionaryDao;
  
  public SysConfigService(){
    
  }
  
  public void setDictionaryDao(DictionaryDao dao){
    dictionaryDao = dao;
  }
  
  public DictionaryDao getDictionaryDao(){
    return this.dictionaryDao;
  }
}
