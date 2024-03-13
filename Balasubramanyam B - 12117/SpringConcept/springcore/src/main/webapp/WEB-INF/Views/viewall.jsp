<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false" %>
 <%@include file="insert.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<br><br><br><br>

<font size="5px" color="green">
<table border="1" align="center">
<tr>
<th>Student ID </th> 
<th>Student Name</th>
<th> City </th>
</tr>
<c:forEach items="${beanlist}" var="bean">
<tr>
<td>${bean.getSid()} </td>
<td>${bean.getSname()} </td>
<td>${bean.getScity()} </td>
</tr>
</c:forEach>

</table>
</font>

</body>
</html>