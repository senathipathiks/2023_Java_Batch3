<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.MyDivClass {
	border: 2 px solid blue;
	width: 45%;
	position: absolute;
	top: 2.0%;
	left: 20%;
	border-radius: 20 px;
}

table {
	border: 1.5px solid black;
	width: 160%;
	height: 800%;
	border-radius: 20px;
	padding-top: 5%;
	padding-bottom: 5%;
	padding-left: 5%;
	padding-right: 1.5%;
	background-color: buttonshadow;
}

.Txtstyle {
	width: 110%;
	height: 200%;
	border-radius: 5px;
}

.style {
	width: 100%;
	height: 60%;
	border-radius: 5px;
}

body {
	
	width: 30%;
	height: 30%;
	background-size: 1240px;
}

.h1 {
	text-align: left;
	color: black;
	margin: right;
}

.submit {
	color: skyblue;
	background-color: black;
}
</style>
<script>
function Validation() {
	var emailRegEx = '^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$';
	var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
	var mobilenumberRegEx = '^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$';
	var fname = document.getElementById("fname").value;
	var lname = document.getElementById("lname").value;
	var dob = document.getElementById("dob").value;
	var email = document.getElementById("email").value;
	var password = document.getElementById("pwd").value;
	var mobilenumber = document.getElementById("mobileno").value;
	var tc = document.getElementById("tc").value;
	if (fname == "") {
		alert("First name cannot be empty");
	} else if (lname == "") {
		alert("Last name cannot be empty");
	} else if (dob == "") {
		alert(" Select your Date-Of-Birth");
	} else if (email == "") {
		alert("Email cannot be empty");
	} else if (!email.match(emailRegEx)) {
		alert("Enter valid email address")
	}

	else if (password == "") {
		alert("Password is must");
	} else if (password.length < 6 && !password.match(passwordRegEx)) {
		alert("Enter Valid Password!")
	} else if (mobilenumber == "") {
		alert("Mobile number cannot be empty")
	
	} else if (tc == "") {
		alert("Please accept the T&C");
	}
}
</script>
</head>
<body>
<form action="Register"  method="post">
	<div class="MyDivClass" action="Register">
		<center>
			<h1>Register Now</h1>
			<h3>Please fill the below details</h3>
		</center>
		<table>
			<tr>
				<td>Name</td>
				<td><input class="style" type="text" placeholder="First Name"
					id="fname" name="fname"></td>
				<td><input class="style" type="text" placeholder="Last Name"
					id="lname"></td>
			</tr>
			<tr>
				<td>Date-of-Birth</td>
				<td><input class="style" type="date" id="dob" name="dob"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio">Male <input type="radio" name="gender">Female</td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><input class="Txtstyle" type="text"
					placeholder="Enter your Email id" id="email" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input class="Txtstyle" type="password"
					placeholder="Enter your password" id="pwd"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input class="Txtstyle" type="password"
					placeholder="Confirm password" id="pwd"></td>
			</tr>

			<tr>
				<td>Mobile Number</td>
				<td><input class="Txtstyle" type="text"
					placeholder="Enter Mobile Number" id="mobileno" name="mobileno"></td>
			</tr>
			<td><input type="checkbox" id="tc"> I accept the T&C</td>
			<tr>
				<td text align="center"><input class="submit" type="Submit"
					onclick="Validation()" /></td>
			</tr>
			<br>
			<br>
			
		</table>
		
	</div>
	</form>
</body>
</html>