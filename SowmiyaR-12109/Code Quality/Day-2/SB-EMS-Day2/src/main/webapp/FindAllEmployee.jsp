<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 
<title>Insert title here</title>
<style type="text/css">
body {
	background-image: url("");
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	margin-top: 70px;
}
 
td {
	height: 40px;
	color: black;
}
 
b {
	color: black;
}
 
input {
	height: 40px;
	width: 300px;
	border-radius: 20px;
}
 
select {
	height: 40px;
	width: 300px;
	border-radius: 20px;
}
 
.button {
	border: 2px solid black;
	background-color: #9400d3;
	color: white;
	font-weight: bold;
}
 
table {
	border: 4px solid #9400d3;
	padding: 0px;
}
</style>
</head>
<body><br><br>
<font size="3px" color="black">
<table border="2" align="center">
<tr>
<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Salary</th>
<th>Action</th>
</tr>
<form action="Insert">
<tr>
<td><input type="text" name='eid'/></td>
<td><input type="text" name='ename'/></td>
<td><input type="text" name='esalary'/></td>
<td><input type='submit' value='INSERT' class='btn btn-success' />
</form>
<c:forEach items="${beanList}" var="bean">
<form action="Edit">
<tr>
<td><input type="text" name='eid'  value='${bean.eid}' readonly="readonly"/></td>
<td><input type="text" name='ename'  value='${bean.ename}' /></td>
<td><input type="text" name='esalary'  value='${bean.esalary}' /></td>
<td><a href="Edit?eid=${bean.eid}" ><input type='submit' value='Edit' class='btn btn-dark' id='savebutton'/></a>
</form>
<td><a href="Remove?eid=${bean.eid}" ><input type='submit' value='Remove' class='btn btn-dark' id='savebutton' /></a>
</tr>
</c:forEach>
</table>
</font>
 
</body>
</html>