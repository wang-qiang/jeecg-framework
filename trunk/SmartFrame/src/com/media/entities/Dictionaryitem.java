package com.media.entities;

// Generated 2009-9-25 11:55:31 by Hibernate Tools 3.2.2.GA

/**
 * Dictionaryitem generated by hbm2java
 */
public class Dictionaryitem implements java.io.Serializable {

  private static final long serialVersionUID = 1L;
  private String dictionaryitemid;
  private String dictionaryid;
  private String itemnamecn;
  private String itemnameen;
  private String itemdesciption;
  private String itemstatus;
  private String itemtype;
  private String itemvalue;
  private String itemorder;
  private String itemisvisible;
  private String itemisauth;
  private String lastmodusr;
  private String lastmodtime;

  public Dictionaryitem() {
  }

  public Dictionaryitem(String dictionaryitemid, String itemnamecn,
      String itemtype, String itemvalue) {
    this.dictionaryitemid = dictionaryitemid;
    this.itemnamecn = itemnamecn;
    this.itemtype = itemtype;
    this.itemvalue = itemvalue;
  }

  public Dictionaryitem(String dictionaryitemid, String dictionaryid,
      String itemnamecn, String itemnameen, String itemdesciption,
      String itemstatus, String itemtype, String itemvalue,
      String itemorder, String itemisvisible, String itemisauth,
      String lastmodusr, String lastmodtime) {
    this.dictionaryitemid = dictionaryitemid;
    this.dictionaryid = dictionaryid;
    this.itemnamecn = itemnamecn;
    this.itemnameen = itemnameen;
    this.itemdesciption = itemdesciption;
    this.itemstatus = itemstatus;
    this.itemtype = itemtype;
    this.itemvalue = itemvalue;
    this.itemorder = itemorder;
    this.itemisvisible = itemisvisible;
    this.itemisauth = itemisauth;
    this.lastmodusr = lastmodusr;
    this.lastmodtime = lastmodtime;
  }

  public String getDictionaryitemid() {
    return this.dictionaryitemid;
  }

  public void setDictionaryitemid(String dictionaryitemid) {
    this.dictionaryitemid = dictionaryitemid;
  }

  public String getDictionaryid() {
    return this.dictionaryid;
  }

  public void setDictionaryid(String dictionaryid) {
    this.dictionaryid = dictionaryid;
  }

  public String getItemnamecn() {
    return this.itemnamecn;
  }

  public void setItemnamecn(String itemnamecn) {
    this.itemnamecn = itemnamecn;
  }

  public String getItemnameen() {
    return this.itemnameen;
  }

  public void setItemnameen(String itemnameen) {
    this.itemnameen = itemnameen;
  }

  public String getItemdesciption() {
    return this.itemdesciption;
  }

  public void setItemdesciption(String itemdesciption) {
    this.itemdesciption = itemdesciption;
  }

  public String getItemstatus() {
    return this.itemstatus;
  }

  public void setItemstatus(String itemstatus) {
    this.itemstatus = itemstatus;
  }

  public String getItemtype() {
    return this.itemtype;
  }

  public void setItemtype(String itemtype) {
    this.itemtype = itemtype;
  }

  public String getItemvalue() {
    return this.itemvalue;
  }

  public void setItemvalue(String itemvalue) {
    this.itemvalue = itemvalue;
  }

  public String getItemorder() {
    return this.itemorder;
  }

  public void setItemorder(String itemorder) {
    this.itemorder = itemorder;
  }

  public String getItemisvisible() {
    return this.itemisvisible;
  }

  public void setItemisvisible(String itemisvisible) {
    this.itemisvisible = itemisvisible;
  }

  public String getItemisauth() {
    return this.itemisauth;
  }

  public void setItemisauth(String itemisauth) {
    this.itemisauth = itemisauth;
  }

  public String getLastmodusr() {
    return this.lastmodusr;
  }

  public void setLastmodusr(String lastmodusr) {
    this.lastmodusr = lastmodusr;
  }

  public String getLastmodtime() {
    return this.lastmodtime;
  }

  public void setLastmodtime(String lastmodtime) {
    this.lastmodtime = lastmodtime;
  }

}
