<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/struts-tags.tld" prefix="s"%>
<%@ taglib uri="/WEB-INF/tlds/media-tags.tld" prefix="m"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
  <title>dictionary</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<script type='text/javascript' src='/SmartFrame/dwr/interface/Clock.js'> </script>
	<script type='text/javascript' src='/SmartFrame/dwr/engine.js'> </script>
	<script type='text/javascript' src='/SmartFrame/dwr/util.js'> </script>
</head>
<body onload="dwr.engine.setActiveReverseAjax(true);">
	<h1>hello,world!</h1>
	<s:a href="javascript:alert('hello')">hello</s:a>
	
	<h1>Server Side Reverse Ajax Clock</h1>
	
	<input type="button" value="Start / Stop" onclick="Clock.toggle();" />
	
	<p></p>
	<div style="font-size: 200%;" id="clockDisplay"></div>
	<m:formatDateTime value="%{lastLoginTime}" patern="yyyy-MM-dd" />
</body>
</html>