<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form method = "post" action = "login-validate">
<input type = "text" name = "username" placeholder = "username">
<br>
<input type = "text" name = "pass" placeholder = "password">
<br>
<input type = "submit" value = "Login">
</form>

<p>${msg}</p>
</body>
</html>