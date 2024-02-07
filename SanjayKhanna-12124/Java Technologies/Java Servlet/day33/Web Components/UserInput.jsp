<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Input page</title>
</head>
<body>
<form action="AuthServlet" method="post">
<table>
<tr><td>User Name :</td><td><input type="email" name="username" required="required" /></td></tr>
<tr><td>Password :</td><td><input type="password" name="password" required="required" /></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>