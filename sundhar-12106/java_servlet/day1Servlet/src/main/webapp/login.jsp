<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginServlet</title>
</head>
<body>
	<form action="ValidateServlet">
	username : <input type="text" name="usr_name">
	password : <input type="password" name="pass">
	<button type="submit">Login</button>
	</form>
</body>
</html>