<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</style>




</head>
<body >
<div >
		
		<table width="50%" align="center" border="2">
		
		<tr><th>Employee id</th><th>Employee name</th><th>Employee salary</th></tr>
		<c:forEach var="emp" items="${EmpList}">
		<form action="Edit">
		<tr>
		<td><input type="text" value="${emp.eid}" name="eid" readonly="readonly"/></td>
		<td><input type="text" value="${emp.ename}" name="ename"/></td>
		<td><input type="text" value="${emp.esalary}" name="esalary" /></td>
		
		<td><input type="submit" value="update" name="btn" class="btn btn-success"/></td>
		<td><input type="submit" value="Delete" name="btn" class="btn btn-danger"/></td>
		</tr>
		</form>
		</c:forEach>
		
		<form action="Add">
		<tr>
		<td><input type="text"name="eid" /></td>
		<td><input type="text" name="ename"/></td>
		<td><input type="text" name="esalary" /></td>
		
		<td><input type="submit" value="add" name="btn" class="btn btn-success"/></td>
		
		</tr>
		</form>
		</table>
	

	</div>
</body>
</html>