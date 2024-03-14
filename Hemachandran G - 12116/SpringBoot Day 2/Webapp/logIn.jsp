<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form {
	border: 1px solid black;
	padding-left: 50px;
	padding-top:30px;
	width: 300px;
	margin-top: 100px;
	margin-left: 40%;
	height: 130px;
}

.input {
	margin-left: 24px;
}

</style>
</head>
<body>

<form action="form">
<label for="uid" >UserId:</label>
<input type="text" name="uid" class="input" >
<br><br>
<label for="uname">UserName:</label>
<input type="text" name="uname" >
<br><br>
<button type="submit" >Submit</button>

</form>
<p>${msg}</p>
</body>
</html>