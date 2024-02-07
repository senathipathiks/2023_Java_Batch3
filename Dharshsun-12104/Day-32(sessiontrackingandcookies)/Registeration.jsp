<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<form action="RegisterServlet" method="post">
<table>
<tr><td>Name :</td><td><input type="text" name="name" /></td></tr>
<tr><td>Age :</td><td><input type="number" name="age" /></td></tr>
<tr><td>Male<input type="radio" value="Male" name="gender"></td><td>Female<input type="radio" value="Female" name="gender"></td></tr>
<tr><td>Email :</td><td><input type="email" name="username" required="required"></td></tr>
<tr><td>Password :</td><td><input type="password" name="password" required="required"></td></tr>
<tr><td><input type="submit" value="sumbit"></td></tr>
</table>
</form>
</body>