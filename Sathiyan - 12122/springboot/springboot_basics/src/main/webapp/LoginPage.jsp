<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login-details">
		<input type="text" name="username" placeholder="Enter userName" required> 
		<input type="password" name="password" placeholder="Enter Password" required> 
		<input type="submit" value="Submit">
	</form>
	
	<br>
	<br>
	<br>
	<h1>
	${Msg}
	</h1>
</body>
</html>