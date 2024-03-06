<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert page</title>
<style type="text/css">
td{
padding: 18px 36px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	font-size: 24px;
}
body{
font-size: 24px;
margin-left: 320px
}
.button{
border:none;
background-color: gray;
color: black;
font-size: 30px;
margin-left: 300px
}

.button:hover {
	background-color: blue;
	color:red;
}
</style>
</head>
<body>
<form action="Controller" method="post">
<table>
<tr><td>Enter Employee Id </td><td><input type="text" name="empId" /></td></tr>
<tr><td>Enter Employee Name </td><td><input type="text" name="empName" /></td></tr>
<tr><td>Enter Employee Salary </td><td><input type="text" name="empSalary" /></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="button" value="Insert" name="button" /></td></tr>
</table>
</form>
</body>
</html>