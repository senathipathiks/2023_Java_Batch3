<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form action="addStudent" method="post" modelAttribute("student")>
<table>
<tr><td>Name </td><td>:<input type="text" name="name" /></td></tr>
<tr><td>Age </td><td>:<input type="number" name="age" /></td></tr>
<tr><td>Gender</td><td>:<input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female</td></tr>
<tr><td colspan="2"><input type="submit" value="Submit">
</table>
</form>
</body>
</html>