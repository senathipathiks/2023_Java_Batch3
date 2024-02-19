<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>

 body{
  background-repeat: no-repeat;
 background-size: cover;
  padding-left: 310px;
 }
 .Table{
border:6px solid thin;
background-color: silver;
}
 #update{
 text-align: center;
 }
 h5{

text-shadow: 1px 2px silver;
}
#id{
background-color: transparent;

}

</style>
</head>
<body>
<br><br><br><br>
<div id="id" style="width:70%">
<h5 ><i><center>UPDATE EMPLOYEE DETAILS</center></i></h5>
<form action="InsertServletEmp" method="post">
<font size="5px" color="black">
<table border="4" align="center" class="Table">
<tr>
<td><h4>Employee ID</h4></td>
<td><input type="text" name="id" required></td>
</tr>
<tr>
<td><h4>Employee Name</h4></td>
<td><input type="text" name="name" required></td>
</tr>
<tr>
<td><h4>Employee City</h4></td>
<td><input type="text" name="city" required></td>
</tr>
<tr>
<td><h4>Employee deptid</h4></td>
<td><input type="text" name="deptid" required></td>
</tr>
<tr>
<td><h4>Employee deptname</h4></td>
<td><input type="text" name="deptname" required></td>
</tr>
<tr>
<td><h4>Employee phoneno</h4></td>
<td><input type="text" name="phno" required></td>
</tr>
<tr id="update">
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="UPDATE" name="button">
</tr>
</table>
</font>

</form>

</body>
</html>