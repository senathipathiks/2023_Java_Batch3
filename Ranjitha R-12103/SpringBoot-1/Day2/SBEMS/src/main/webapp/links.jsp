<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a {
	text-decoration: none;
	color: white;
}

th {
	background-color: teal;
	height: 50px;
	font-weight: bold;
	background-image:
		url("https://d2slcw3kip6qmk.cloudfront.net/marketing/blog/2017Q4/hr-matrix/hr-matrix-header.png");
}

body {
	background-color: hash;
	background-color: silver;
}

h1 {
	align-content: center;
}
</style>
</head>
<body>
	<h1 align="center">Employee Management System</h1>

	<table width="100%" cellspacing="15">
		<th><a href="InsertEmployee" target="content">Insert Employee</a></th>
		<th><a href="" target="content">Update Employee</a></th>
		<th><a href="DeleteEmployee" target="content">Delete Employee</a></th>
		<th><a href="DeleteByNameEmployee" target="content">Delete By
				Name Employee</a></th>
		<th><a href="FindEmployee" target="content">Find Employee</a></th>
		<th><a href="" target="content">FindAll Employee</a></th>

	</table>
</body>
</html>