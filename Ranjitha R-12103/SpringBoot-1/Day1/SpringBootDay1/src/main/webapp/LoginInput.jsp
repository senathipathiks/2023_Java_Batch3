<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login-msg">
<h3>Login Here!..</h3>
<br>
Enter Your Name:<input type="text" name="name"/>
<br><br>
Enter Your password:<input type="text" name="password">
<br><br>
<input type="submit" value="Login Now">
<b>Status : ${Msg}</b>
</form>
</body>
</html>