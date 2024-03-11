<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="login" method="post">
<table>
<tr><td>UserName</td><td><input type="text" name="username" ></td></tr>
<tr><td>Password</td><td><input type="text" name="password" ></td></tr>
<tr><td colspan="2"><input type="submit" name="button" value="submit"></td></tr>
</table>
</form>
<% String msg = (String) request.getAttribute("msg");
if(msg != null)
	out.print("<h4>"+msg+"</h4>");
%>
</body>
</html>