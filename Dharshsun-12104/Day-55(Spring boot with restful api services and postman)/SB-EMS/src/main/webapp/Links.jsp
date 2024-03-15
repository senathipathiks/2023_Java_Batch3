<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS WEB APPLICATION</title>

<style type="text/css">
a{
text-decoration:none;
color:white;
}
th{
background-color:black;
height:50px;
font-weight: bold;
color:white;
border-radius: 20px;

}
h1{
text-align:center;
color:white;
}
body{
background-color:brown;
}
</style>
</head>
<body>
<h1>EMPLOYEE MANAGEMENT SYSTEM</h1>
<table width="100%" cellspacing="15" align="center">
<th><a href="InsertEmployee" target="content">Insert Employee</a></th>
<th><a href="DeleteEmployee" target="content">Delete Employee</a></th>
<th><a href="DeleteEmployeeByName" target="content">Delete Employee By Name</a></th>
<th><a href="UpdateEmployee" target="content">Update Employee</a></th>
<th><a href="FindEmployee" target="content">Find Employee</a></th>
<th><a href="FindAllEmployee" target="content">FindAll Employee</a></th>
<th><a href="FindEmployeeByName" target="content">Find Employee By Name</a></th>




</table>
</body>
</html>