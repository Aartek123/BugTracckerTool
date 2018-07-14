<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!-- Step Number 6 make BaseLayout file   -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aartek Project</title>
</head>
<body>
  <table width="100%" cellpadding="0" cellspacing="0" border="1" align="center">

  <tr>
    <td colspan="2" align="left"><tiles:insertAttribute name="header" /></td>
  </tr>
  
  <tr>
    <td colspan="2" align="left"><tiles:insertAttribute name="menu" /></td>
  </tr>
  
  <tr>
    <td valign="top" ><tiles:insertAttribute name="body" /></td>
  </tr>
  <tr>
    <td colspan="2" align="left"><tiles:insertAttribute name="footer" /></td>
  </tr>
  </table>
</body>
</html>