<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="green">
<table border="1" align="center">
<tr>
<td>Student ID: </td>
<td><input type="text" name="sid"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn btn-primary btn-lg" value="Find" name="button"> </td>

<td colspan="2"><input type="submit" class="btn btn-primary btn-lg" value="FindAll" name="button"> </td>
</tr>
</body>
</html>