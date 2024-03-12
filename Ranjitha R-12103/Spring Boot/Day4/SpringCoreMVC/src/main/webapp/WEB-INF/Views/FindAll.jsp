
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	color: white;
	align-content: center;
	font-family: monospace;
	background-color: teal;
}
#colr{
color: white;
}
</style>
</head>
<body>
<br><br><br>
<center>
<h2>All Book Details</h2>
<font size="5px" color="black">
<table border="1" color="black">
<tr>
<td>Book Id </td>
<td>Book Name</td>
<td>Book Author</td>
</tr>
<c:forEach items="${beanlist}" var="bean">
<tr id="colr">
<td>${bean.getBookid()}</td>
<td>${bean.getBookname() }</td>
<td>${bean.getBookauthor()}</td>
</c:forEach>
</tr>
</table>
</font></center>
</body>
</html>