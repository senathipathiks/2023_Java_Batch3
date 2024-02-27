<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Frame</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
body {
	background-color: #f8f9fa;
	background-image: url('DeleteImage.jpg');
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	height: 100vh;
	margin: 0;
	padding: 0;
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	height: 100vh;
	margin: 0;
}

form {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	background-color: rgba(255, 255, 255, 0.8);
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

input[type="text"] {
	width: 100%;
	padding: 8px;
	margin: 8px 0;
	box-sizing: border-box;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: #dc3545;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #c82333;
}
</style>
</head>
<body>
	<br>
	<br>
	<br>
	<form action="InsertServelet" method="post">
		<h5 class="text-center mb-4">Delete Student</h5>
		<div class="form-group">
			<label for="sid">Enter the Student ID to Delete:</label> <input type="text" id="sid"
				name="sid" required pattern="[0-9]+"
				title="Please enter a valid student ID (numeric)">
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-danger btn-lg" value="Delete"name="button">
		</div>
	</form>
</body>
</html>
