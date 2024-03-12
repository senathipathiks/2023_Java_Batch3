<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<form action="valid">
<label>UserName:</label><br>
<input type="text" name="uname"><br><br>
<label>Password:</label><br>
<input type="text" name="password"><br><br>
<input type="submit" name="Login">
</form>
<br><br>
<%
String msg = (String)request.getAttribute("msg");
if(msg!=null){
if(msg.equals("Success")){
	%>
<h1>Login is Successfully Done</h1>

<%
}
else{
	
%>
<h1>Invalid Password or Username</h1>

<%} }%>

</body>
</html>