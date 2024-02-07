<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="LoginServlet" method="post">
<table Style="border:none">
<tr><td>User Name : </td><td><input type="text" name="username" autocomplete="off" id="user"/></td></tr>
<tr><td>Password : </td><td><input type="text" name="password" autocomplete="off" id="pass"/></td></tr>
<tr><td colspan="2"><button type="submit">Login</button></td></tr>
</table>
</form>
</body>
</html>