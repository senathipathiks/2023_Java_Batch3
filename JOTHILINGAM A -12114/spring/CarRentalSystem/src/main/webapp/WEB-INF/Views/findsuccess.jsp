<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="NewElem" >
<input type="submit" value="Add Employee" class="btn btn-success" id="new">
</form>
<br>

<h5 class="card-header bg-primary"><b>FindAll Operation</b></h5>
<table class="table table-dark table-hover">

<tr>
<td><b>ID</b></td>
<td><b>Student Name</b></td>
<td><b>Student city</b></td>
<td><b>Edit</b></td>
<td><b>Delete</b></td>
</tr>


<tr>


<form action="Edit" modelAttribute="rdata" >
<td ${c.carID}></td>
<td>${c.carModel}</td>
<td>${c.carType}</td>
<td>${c.rate_per_km}</td>
<td>${c.seat_Capacity}</td>
<td><input type="submit" value="Edit" class="btn btn-warning"></td>
</form>


</body>
</html>