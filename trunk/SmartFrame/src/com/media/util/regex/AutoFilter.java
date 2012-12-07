package com.media.util.regex;

/**
 * <p>Title: TianyiBBS</p>
 *
 * <p>Description: BBSCS</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Laoer.com</p>
 *
 * @author Laoer
 * @version 7.0
 */
public class AutoFilter
    extends RegexFilter {

  public AutoFilter(String source) {
    super(source);
    String abgcolor = "#000000";

    this.regex = "(\\[IMG\\])(http://.[^\\[]*)(\\[\\/IMG\\])";
    this.rpStr = "<p><IMG SRC=\"$2\" border=0 onload=\"javascript:if(this.width>screen.width*.50)this.width=screen.width*.50\"></p>";
    this.doFiltration();
  }
}
