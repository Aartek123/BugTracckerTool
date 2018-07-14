<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<title>Product</title>
<link
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>

<script>
	$(document).ready(function() {
		$('#example').DataTable({
			"pagingType" : "full_numbers"
		});
	});
</script>
</head>
<body>
	<form:form name="myproducts" id="prdct" action="product.do"
		method="post" modelAttribute="prodMap">

		<table border="1" align="center">
			<tr>
				<td>Product name: <form:input path="prodname" /></td>
				<td><form:errors path="prodname" class="error" /></td>
			</tr>
			<tr>
				<td>Product Desc: <form:input path="proddesc" /></td>
				<td><form:errors path="proddesc" class="error" /></td>
			</tr>
			<tr>
				<td>Product Price: <form:input path="prodprice" /></td>
				<td><form:errors path="prodprice" class="error" /></td>
			</tr>
			<tr>
				<td>Product Quantity:<form:input path="prodqty" /></td>
				<td><form:errors path="prodqty" class="error" /></td>
			<%-- </tr>
			<tr>
			<td><form:input path="ProImage" id="ProImage" type="file" name="Upload Image" /></td>
			</tr>
			<tr> --%>
				<td><input type="submit" value="Submit"></td>
			</tr>

			<tr>
				<td colspan="2"><a href="logout.do">Logout</a></td>
			</tr>
		</table>
		 
	</form:form>

	<hr>

	<table id="example" align="center" border="1" bordercolor="pink"
		bgcolor="grey">
		<thead>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Description</th>
				<th>Product Price</th>
				<th>Product Quantity</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty prodList}">
	    No Such Record Found...
	 </c:when>
				<c:otherwise>
					<c:forEach items="${prodList}" var="prod">

						<tr>
							<td><c:out value="${prod.prodid}" /></td>
							<td><c:out value="${prod.prodname}" /></td>
							<td><c:out value="${prod.proddesc}" /></td>
							<td><c:out value="${prod.prodprice}" /></td>
							<td><c:out value="${prod.prodqty}" /></td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
		<tfoot> 
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Description</th>
				<th>Product Price</th>
				<th>Product Quantity</th>
			</tr>
		</tfoot>
	</table>



	<%-- <table id="MyProducts" border="1" align="center">
	<tr>
		<td><B>Product Id</B></td>
		<td><B>Product Name</B></td>
		<td><B>Product Description</B></td>
		<td><B>Product Price</B></td>
		<td><B>Product Quantity</B></td>
	</tr>

	 <c:choose>
	 <c:when test="${empty prodList}">
	    No Such Record Found...
	 </c:when>
	 <c:otherwise>
	<c:forEach items="${prodList}" var="prod">
	
	<tr>
			<td><c:out value="${prod.prodid}"/></td>
			<td><c:out value="${prod.prodname}"/></td>
			<td><c:out value="${prod.proddesc}"/></td>
			<td><c:out value="${prod.prodprice}"/></td>
			<td><c:out value="${prod.prodqty}"/></td>

		</tr>
	</c:forEach> 
	</c:otherwise>
	</c:choose>
	
</table> --%>
</body>
</html>