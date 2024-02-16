<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student-register</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="container d-flex  justify-content-center align-item-center">
		<form action="TestStudent.jsp" method="post">
		<h1 class="ms-5">Login</h1>
			<br> Student ID : <input type="number" placeholder="id"
				name="sid"><br> <br> Student name : <input
				type="text" placeholder="name" name="name"><br> <br>
			Student city : <input type="text" placeholder="city" name="city"><br>
			<br> <input class="ms-5 btn btn-primary" type="submit">
		</form>
	</div>
</body>
</html>