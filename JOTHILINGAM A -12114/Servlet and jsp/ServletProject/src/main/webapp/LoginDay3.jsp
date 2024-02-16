<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login jsp</title>
<style>
#box1 {
	margin-top: 50px;
}

#f, #f1 {
	margin-top: 20px;
}
button{
margin-top: 20px;
}
</style>
</head>

<body>
	
	<center>
		<h1>Login page</h1>
	</center>

	<form action="InboxPage" method="get">
		<center>
			Username:<input type="text" name="user" id="f">
			<br> password:<input type="text" name="pass" id="f1">
			<br>
			<button>submit</button>
		</center>
	</form>


</body>
</html>