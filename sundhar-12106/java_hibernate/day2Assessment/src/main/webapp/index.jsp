<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link rel="icon" type="png" href="fav.png">
</head>
<title>Register form</title>
<body>
	<div class="container mt-5 d-flex justify-content-center">
		<form action="Register.jsp" method="post"
			class="mt-5 border border rounded d-inline-flex flex-column p-5 fo">
			<h1>Registration Form</h1>
			<label for="umail" class="form-label">Enter email</label> <input
				type="email" class="form-control" name="umail" id="umail"
				placeholder="xyz@gmail.com"><br>
			<label for="uname" class="form-label">Enter username</label> <input
				type="text" class="form-control" name="uname" id="uname"
				placeholder="username"><br> <label for="pass"
				class="form-label">Enter password</label> 
				<input type="password" class="form-control" name="pass" id="pass" placeholder="password"><br>
			<input class="btn btn-primary mb-2" type="submit" value="Register">
			<div class="container"><a href="#" class="m-2">forget password?</a><span>or</span>
			<a href="#" class="">login</a>
			</div>
		</form>
	</div>

</body>
</html>
