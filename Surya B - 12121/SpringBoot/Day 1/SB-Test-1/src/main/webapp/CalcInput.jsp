<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<form action = "perform-additon">
Enter First Number
<input type = "text" name= "One">
<br>
Enter Second Number
<input type = "text" name= "Two">
<br>
<input type = "submit" value = "Addition">
<br>
</form>
<b>Addition : ${sum}</b>
</body>
</html>