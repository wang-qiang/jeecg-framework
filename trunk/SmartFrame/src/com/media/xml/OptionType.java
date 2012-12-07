package com.media.xml;

public enum OptionType {
  type1(1),type2(2),type3(3),type4(4),type5(5);
  
  private int value;
  
  OptionType(int intVal){
    this.value = intVal;
  }
  
  public int getValue(){
    return this.value;
  }
}
