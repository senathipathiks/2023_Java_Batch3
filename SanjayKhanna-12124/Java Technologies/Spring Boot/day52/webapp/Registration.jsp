<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page:</title>
</head>
<body>
<form action="register" method="post">
<table>
<tr><td>Name</td><td><input type="text" name="name" ></td></tr>
<tr><td>Age</td><td><input type="text" name="age" ></td></tr>
<tr><td>Gender</td><td><input type="radio" name="gender" value="male" />Male<input type="radio" name="gender" value="female" />Female</td></tr>
<tr><td colspan="2"><input type="submit" name="button" value="submit"></td></tr>
</table>
</form>
</body>
</html>