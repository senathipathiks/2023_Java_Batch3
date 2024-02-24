<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
<style type="text/css">
tr{
padding: 10px 15px;
}
table{
margin:50px 0px 0px 400px;
padding: 2%;
}
</style>
</head>
<body>
<form action="Register" method="post">
<table>
<tr><td>Name :</td><td><input type="text" name="name" required="required" /></td></tr>
<tr><td>Age :</td><td><input type="number" name="age" required="required" /></td></tr>
<tr><td>Male<input type="radio" value="Male" name="gender" ></td><td>Female<input type="radio" value="Female" name="gender"></td></tr>
<tr><td>Email :</td><td><input type="email" name="email" required="required"></td></tr>
<tr><td>Password :</td><td><input type="password" name="password" required="required"></td></tr>
<tr><td><input type="submit" name="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>