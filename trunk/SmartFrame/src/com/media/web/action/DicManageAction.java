package com.media.web.action;

import com.media.service.SysConfigService;
import com.media.entities.Dictionary;
import com.media.entities.Dictionaryitem;
import com.media.util.LogUtil;
import java.util.List;

public class DicManageAction extends BaseAction {
  
  private final String DICTIONARYSLIST = "DictionarysList";
  private final String LIST = "list";
  private final String EDIT = "edit";

  private SysConfigService sysConfigService;
  private String dictionaryId;
  private String dictionaryItemId;
  private String itemValue;
  private String typeType;
  private List dicList;
  private List dicItemList;
  private String lastLoginTime = "2009-10-10 22:3:10";

  public String getDictionaryId() {
    return dictionaryId;
  }

  public void setDictionaryId(String dictionaryId) {
    this.dictionaryId = dictionaryId;
  }

  public String getDictionaryItemId() {
    return dictionaryItemId;
  }

  public void setDictionaryItemId(String dictionaryItemId) {
    this.dictionaryItemId = dictionaryItemId;
  }

  public String getItemValue() {
    return itemValue;
  }

  public void setItemValue(String itemValue) {
    this.itemValue = itemValue;
  }

  public String getTypeType() {
    return typeType;
  }

  public void setTypeType(String typeType) {
    this.typeType = typeType;
  }

  public void setSysConfigService(SysConfigService sysConfigService) {
    this.sysConfigService = sysConfigService;
  }

  public SysConfigService getSysConfigService() {
    return sysConfigService;
  }
  
  @SuppressWarnings("unchecked")
  public List getDicList() {
    return dicList;
  }

  @SuppressWarnings("unchecked")
  public void setDicList(List dicList) 
  {
    this.dicList = dicList;
  }

  @SuppressWarnings("unchecked")
  public List getDicItemList() {
    return dicItemList;
  }

  @SuppressWarnings("unchecked")
  public void setDicItemList(List dicItemList) {
    this.dicItemList = dicItemList;
  }

  public String execute() throws Exception {
    return SUCCESS;
  }

  public String list(){
    try{
      
      LogUtil.info("hello,this is log test.");
      this.dicList = this.GetDicList();
      if(dicList.size() > 0){
        dictionaryId = ((Dictionary)dicList.get(0)).getDictionaryid().toString();
      }
      else{
        return ERROR;
      }
      this.dicItemList = this.GetDicItemList(dictionaryId);
      return LIST;
    }catch(Exception ex){
      System.out.print(ex.getMessage());
      return ERROR;
    }
  }
  
  @SuppressWarnings("unchecked")
  public List GetDicList() {
    return this.getSysConfigService().getDictionaryDao().getDictionaryList();
  }
  
  @SuppressWarnings("unchecked")
  public List GetDicItemList(String id){
    return this.getSysConfigService().getDictionaryDao().getDictionaryItemList(id);
  }
}
