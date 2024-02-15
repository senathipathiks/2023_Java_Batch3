<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>Login</title>
</head>
<body>
	<div class="container d-flex justify-content-center align-item-center">
	<form action="LoginTest.jsp" class="form mt-5">
		<h1 class="text-center">Login</h1>
		username : <input type="text" name="usr_name"><br>
		<br> password : <input type="password" name="pass"><br>
		<br> <input class="ms-5 btn btn-outline-primary" type="submit" value="Login">
	</form>
	</div>
</body>
</html>