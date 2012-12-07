package com.media.dao;

import com.media.entities.Dictionary;
import com.media.entities.Dictionaryitem;
import java.util.List;

public interface DictionaryDao {

  public void saveDicItem(Dictionaryitem item);
  
  public List getDictionaryList();
  
  public Dictionary getDictionaryEntity(String id);
  
  public List getDictionaryItemList(String DicId);
  
  public Dictionaryitem getDictionaryitemEntity(String itemId);
  
  public void removeDictionaryItem(final String ids);
}
