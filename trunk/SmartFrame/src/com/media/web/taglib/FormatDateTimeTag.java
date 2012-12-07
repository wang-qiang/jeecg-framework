package com.media.web.taglib;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;
import com.opensymphony.xwork2.util.ValueStack;
 
public class FormatDateTimeTag extends ComponentTagSupport {

  private static final long serialVersionUID = -9002845458485377791L;

  @Override
  public Component getBean(ValueStack arg0, HttpServletRequest arg1, HttpServletResponse arg2) {
    return new FormatDateTime(arg0);
  }

  private String patern = "yyyy-MM-dd HH:mm:ss";
  private String dateType = "Datetime";
  private String value;
  
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
  public String getPatern() {
    return patern;
  }
  public void setPatern(String patern) {
    this.patern = patern;
  }
  public String getDateType() {
    return dateType;
  }
  public void setDateType(String dateType) {
    this.dateType = dateType;
  }
  
  protected void populateParams() {
    super.populateParams();
    FormatDateTime tag = (FormatDateTime) component;
    tag.setDateType(dateType);
    tag.setPatern(patern);
    tag.setValue(value);
  }
}
