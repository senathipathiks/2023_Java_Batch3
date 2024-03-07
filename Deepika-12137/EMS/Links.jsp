<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
	margin-left: 10px;
	margin-right: 10px;
	background-color: #a4aaba;
}

a{
text-decoration: none;
color: white;
font-size: 20px;

}

th{
	
	
	margin-right: 5px; 
	padding-top:1px;
	
}

table{
	margin-right: 40px;
}

</style>

</head>
<body>
<br>
<br>

<table border="0" align="center" width="100%">
	<th><a href="InsertEmployee.jsp" target="content">Insert Employee</a> </th>
	<th><a href="EMSController?emsAction=Delete" target="content">Delete Employee</a> </th>
	<th><a href="EMSController?emsAction=Update" target="content">Update Employee</a> </th>
	<th><a href="EMSController?emsAction=Find" target="content">Find Employee</a> </th>
	<th><a href="EMSController?emsAction=FindAll" target="content">Find All Employee</a> </th>
</table>

</body>
</html>