package com.media.xml;

import java.util.List;
import org.w3c.dom.*;
import com.media.util.OsCacheUtil;
import com.media.util.Common;

public class OptionData {
  private static OsCacheUtil cache = new OsCacheUtil();
  public OptionData(){
    
  }
  
  public static List GetOptionData(OptionType type){
    Object rs = cache.get(type);
    if(rs != null){
      return (List)rs;
    }
    else{
      List list = OptionProvider.DataProvider(type);
      cache.add("t" + type, list);
      return list;
    }
  }
  
  public static String OptionName(OptionType type){
    String name = "";
    return name;
  }
  
  public static String OptionNames(String typeValues){
    String names = "";
    return names;
  }
}