<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>

<body>
Enter the quantity of ${itemsname}
<form id="usrform" action="ShopingAjax" method="post">
<input name="itemname" id="itemname" value="${itemsname}" type="hidden"/>
<input name="TotalAmount" id="TotalAmount" value="${TotalAmount}" type="hidden"/>
Quantity: <input name="quantity" id="quantity" type="text"/><br/>
<input type="submit" value="submit" >
</form>
Amount ${Amount}   <br>
totalAmount ${TotalAmount} 
<br/>
<a href="index.jsp">Click Here</a> back to main page
</body>
</html>
