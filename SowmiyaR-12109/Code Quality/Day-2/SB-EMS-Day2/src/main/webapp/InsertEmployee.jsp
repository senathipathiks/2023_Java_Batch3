<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee management system</title>
<style type="text/css">
body{
background-image:url("https://www.247hrm.com/wp-content/uploads/2016/07/tech-background-image-2.jpg" );
background-repeat:no-repeat;
background-position: right;
background-size:1540px;
}
td, tr{
height: 40px;
padding: 5px;
border: 2px solid purple;	
border-radius: 10px;
border: 0;

}
input{
height: 40px;
width: 300px;
border-radius: 10px;
border: 0;
}
.button{
border: none;
background-color: green;
color: white;
font-weight: bold;
}
table{
border: 6px grey;
padding: 40px;
background-color:silver;
border-radius: 25px;
color:purple;

}
 
</style>
</head>
<body>
<form action="PerformInsert">
<table widht="80%" align="center" border="none" >
<tr><td><h2>Employee Id</h2></td><td><input type="text" name="eid" required="required"/></td></tr>
<tr><td><h2>Employee Name</h2></td><td><input type="text" name="ename" required="required"/></td></tr>
<tr><td><h2>Employee Salary</h2></td><td><input type="text" name="esalary" required="required"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="Insert Employee" name="emsAction"/></td></tr>
 
</table>
</form>
 <br>
<center>
<font color="green"><h1>${msg}</h1></font>
</center>
</body>
</html>