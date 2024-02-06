<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<script>
	function Validation() {
		var userRegEx = '^[A-Za-z]\\w{5,29}$';
		var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
		var name = document.getElementById("name").value;
		var password = document.getElementById("pass").value;
		if (name == "") {
			alert("Name can not be empty");
		} else if (password == "") {
			alert("Password is must");
		} else if (password.length < 6 && !password.match(passwordRegEx)) {
			alert("Enter Valid Password!");
		}
	}
</script>
</head>
<body>
	<form action="MyServletLogin" method="post">
		<center>
			<h1>Login Page</h1>
			<h1>
				Enter your Name:<input type="text" name="name" id="name">
			</h1>

			<h1>
				Enter your Password:<input type="password" name="pass" id="pass">
			</h1>
			<br> <br>
			<button onclick="Validation()">Submit</button>
		</center>
	</form>
</body>
</html>