<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form action="Register" method="get" modelAttribute="register">
			<input type="text" name="fName" placeholder="first name"> <input
				type="text" name="lName" placeholder="last name"> <input
				type="tel" name="phoneNo" placeholder="*******786"> <input
				type="submit" value="Register">
		</form>
	</div>
</body>
</html>
