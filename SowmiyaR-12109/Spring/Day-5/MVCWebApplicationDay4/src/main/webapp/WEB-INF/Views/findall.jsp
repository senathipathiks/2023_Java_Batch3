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
body{
background-image: url("https://t3.ftcdn.net/jpg/03/55/60/70/360_F_355607062_zYMS8jaz4SfoykpWz5oViRVKL32IabTP.jpg");
background-repeat: no-repeat;
background-size: cover;
}
.Table{
border:6px solid thin;
background-color: silver;
height:200px;
width:450px;
border-radius: 50px;
}
 
#button{
text-align: center;
}
td{
font-weight: bold;
}
 
</style>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
 
<body>
<br><br><br><br>
<form action="Updation">
<font size="5px" color="black">
 
<table border="1" align="center">
<tr>
<th>Student Id </th>
<th>Student Name</th>
<th> City</th>
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