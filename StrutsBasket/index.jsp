
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Log In</title>
<link href="style.css" rel="stylesheet" type="text/css"/> 
</head>

<body>
<div id="enternameWR">
  <html:form action="/index">
    <table width="391" height="65" border="0">
      
      <tbody>
        <tr>
          <td height="26" colspan="2">
            <bean:write name="LoginForm" property="error" filter="false"/>
            &nbsp;</td>
          </tr>
        <tr>
          <td width="129" height="33">Enter your name:</td>
          <td width="232" bgcolor="#FFFFFF">
            <bean:cookie id="name" name="name" value=" "/>
            <html:text property="name" value="${cookie.name.value}" /></td>
          </tr>
        </tbody>
      </table>
    
    <html:submit value="Login" />
    
  </html:form>
</div>
</body>
</html>
