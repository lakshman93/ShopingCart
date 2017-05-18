<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
	<p>welcome to bill page</p>
<div style="display: inline-flex;">
	<table style="width: 20%">
		<tr>
			<th>ItemName</th>
		</tr>
		<c:forEach var="itemeName" items="${itemeName}">
			<tr>
				<td><c:out value="${itemeName}" /></td>
			</tr>
		</c:forEach>
	</table>
	<table style="width: 20%">
		<tr>
			<th>prize</th>
		</tr>
		<c:forEach var="prizes" items="${prizes}">
			<tr>
				<td><c:out value="${prizes}" />*</td>

			</tr>
		</c:forEach>
	</table>
	<table style="width: 20%">
		<tr>
			<th>quantity</th>
		</tr>
		<c:forEach var="quantitys" items="${quantitys}">
			<tr>

				<td><c:out value="${quantitys}" /></td>

			</tr>
		</c:forEach>
	</table>
	<table style="width: 20%">
		<tr>
			<th>Amount</th>
		</tr>
		<c:forEach var="Amounts" items="${Amounts}">
			<tr>
  
				<td><c:out value="${Amounts}" /></td>

			</tr>
		</c:forEach>
	</table>
	
</div>
<h3>Total Amount::::: ${TotalAmount} </h3>
<br/>

<a href="Shoping">Click Here</a>to go next bill<br/>
<a href="index.jsp">Click Here</a> back to main page
</body>
</html>