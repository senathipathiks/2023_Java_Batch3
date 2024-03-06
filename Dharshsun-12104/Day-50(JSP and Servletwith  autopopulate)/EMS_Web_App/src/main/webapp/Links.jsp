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

}
</style>
</head>
<body>
<br><br><br>
<table width="100%" cellspacing="15" align="center">
<th><a href="InsertEmployee.jsp" target="content">Insert Employee</a></th>
<th><a href="EmpController?emsAction=Delete" target="content">Delete Employee</a></th>
<th><a href="EmpController?emsAction=Update" target="content">Update Employee</a></th>
<th><a href="EmpController?emsAction=Find" target="content">Find Employee</a></th>
<th><a href="FindAllEmployee.jsp" target="content">FindAll Employee</a></th>


</table>
</body>
</html>