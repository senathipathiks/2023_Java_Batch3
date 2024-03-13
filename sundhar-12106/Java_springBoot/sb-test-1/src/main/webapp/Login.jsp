<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container d-flex justify-content-center mt-3">
		<div class="conatiner">
			<form action="login-access" method="post" class="mt-2 border shadow rounded p-3">
				<h2 class="text-center">login</h2>
				<label>Enter username</label> <br> <input type="text"
					name="username" class="form-control"> <label>Enter
					password</label> <br> <input type="password" name="password"
					class="form-control"> <input type="submit"
					class="btn btn-success mt-2" value="Login">
			</form>
			
			<c:if test="${error != null }">
				<h4 class="text-danger">${error}</h4>
			</c:if>
		</div>
	</div>
</body>
</html>