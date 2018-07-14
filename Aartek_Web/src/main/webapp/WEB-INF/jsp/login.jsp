<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<body>

	<form:form method="POST" action="userSignIn.do"
		modelAttribute="userMap">

		<table border="1" align="center">
			<tr>
				<td>Email:<form:input path="Email"
						placeholder="Please enter your email" id="Email" /></td>
				<td><form:errors path="Email" /></td>
			</tr>
			<tr>
				<td>Password:<form:password path="Password"
						placeholder="Password" id="password" /></td>
				<td><form:errors path="Password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
				<td colspan="2"><a href="SignUp.do">SignUp</a></td>
				<td colspan="2"><a href="product.do">product</a></td>
				
			</tr>
		</table>


	</form:form>

</body>
</html>