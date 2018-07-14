<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<body>
<form:form method="post" action="SignUp.do" modelAttribute="userRegistrationMap">
	Language : <a href="?language=en_US">English</a>|<a href="?language=zh_CN">Chinese</a>|<a href="?language=hi_IN">Hindi</a>
	<table border="1" align="center">
		
		<tr>
			<td>
			<spring:message code="label.FirstName"></spring:message>
			<form:input path="FirstName"  placeholder="Enter First Name" id="FirstName" /></td>
			<td><form:errors path="FirstName"/></td>
		</tr>
			
		<tr>
			 <td>
			<spring:message code="label.LastName"></spring:message>
			<form:input path="LastName"  placeholder="Enter Last Name" id="LastName" /></td>
			 <td><form:errors path="LastName"/></td>
		</tr>
			
		<tr>
                <td>
                <spring:message code="label.Email"></spring:message>
            	<form:input path="Email" placeholder="Enter EmailID" id="Email" /></td>
                <td><form:errors path="Email"/></td>
 		</tr>
		<tr>
			<td>
			<spring:message code="label.Mobile"></spring:message>
			<form:input path="Mobile"  placeholder="Mobile Number" id="Mobile" /></td>
			<td><form:errors path="Mobile"/></td>
		</tr>
			
		<tr>
			<td>
			<spring:message code="label.Password"></spring:message>
			<form:password path="Password" placeholder="Password" id="password" /></td>
			<td><form:errors path="Password"/></td>
		</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Register"/></td>
			</tr>
			</table>


	</form:form>

</body>
</html>