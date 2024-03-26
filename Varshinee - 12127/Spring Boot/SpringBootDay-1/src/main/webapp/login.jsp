<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="perform-login">
Enter the name:<input type="text" name="name"/>
Enter Password:<input type="text" name="pass"/>
<input type="submit" value="Submit"/>
</form>
<b>${msg}</b>
</body>
</html>