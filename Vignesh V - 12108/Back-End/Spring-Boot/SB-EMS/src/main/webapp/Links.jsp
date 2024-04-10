<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS WEB APPLICATION</title>

<style type="text/css">
a {
	text-decoration: none;
	color: white;
}

th {
	background-color: black;
	height: 50px;
	font-weight: bold;
}
#a1{
width:50%;
}
</style>
</head>
<body>

	<br>
	<br>
	<br>
	<table width="100%" cellspacing="1" align="center">
		<th><a href="InsertEmployee" target="content">Insert</a></th>
		<th><a href="DeleteEmployee" target="content">Delete</a></th>
		<th><a href="DeleteEmployeeByName" target="content" id="a1">DeleteByName</a></th>
		<th><a href="UpdateEmployee" target="content">Update</a></th>
		<th><a href="FindEmployee" target="content">Find</a></th>
		<th><a href="FindEmployeeByName" target="content">FindByName</a></th>
		<th><a href="ViewAllEmployee" target="content">Views</a></th>

	</table>
</body>
</html>