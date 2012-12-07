package com.media.web.taglib;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;

import com.media.util.LogUtil;
import com.media.util.Util;
import com.opensymphony.xwork2.util.ValueStack;

@StrutsTag(name = "DateTime", tldTagClass = "com.media.web.filter.DateTimeTag", description = "Render format datetime", allowDynamicAttributes = true)
public class FormatDateTime extends Component {

  public FormatDateTime(ValueStack stack) {
    super(stack);
  }

  private String value;
  private String patern;
  private String dateType;

  @StrutsTagAttribute(description = "datetime type: Datetime or Timestamp,default is Datetime", type = "String", defaultValue = "Datetime")
  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

  @StrutsTagAttribute(description = "format datetime value,default value is current datetime", type = "String")
  public void setValue(String value) {
    this.value = value;
  }

  @StrutsTagAttribute(description = "formate patern,default yyyy-MM-dd HH:mm:ss", type = "String", defaultValue = "yyyy-MM-dd HH:mm:ss")
  public void setPatern(String patern) {
    this.patern = patern;
  }

  public boolean start(Writer writer) {
    boolean result = super.start(writer);
    if (altSyntax()) {
      if (value.startsWith("%{") && value.endsWith("}")) {
        value = value.substring(2, value.length() - 1);
      }
    }
    LogUtil.info(value);
    if (value != null) {
      try {
        Date date = null;
        if (this.dateType.toLowerCase().equals("datetime")) {
          date = (Date) this.getStack().findValue("value");
        } else if (this.dateType.toLowerCase().equals("timestamp")) {
          long l = Long.parseLong(this.getStack().findValue("value").toString());
          date = new Date(l);
        }
        if (date != null) {
          writer.append(Util.formatDate(date, patern));
        }
      } catch (Exception ex) {
        LogUtil.debug(ex.getLocalizedMessage(), ex);
      }
    }
    return result;
  }
}
