<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="RedirectEx"> <center>

<label>Enter the Name: </label>
<input type="text" name = "uname" <% request.getParameter("uname"); %>>
<br>

<label>Enter the Password: </label>
<input type="text" name = "pass" >
<br>

<button type="submit">Login</button>

</center>
</form>

</body>
</html>