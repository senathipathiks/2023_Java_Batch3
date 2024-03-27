<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- Option 1: Include in HTML -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<style>
form{
padding: 50px;
word-spacing: 30px;
}
.box{
padding-top: 40px;

}
</style>
</head>
<body>
<form action="perform-login" align="center">
<div class="box">
<i class="bi bi-person-square">Username <input type="text" name="Username" required/></i>
<br>
<br>
<br>
<i class="bi bi-eye-slash">Password <input type="text" name="Password" required></input></i>
<br>
<br>
<br>
<input type="submit" value="Login"/>
</div>
</form>
<br>
<h2><center>${Msg}</center></h2>

<br>
</body>
</html>