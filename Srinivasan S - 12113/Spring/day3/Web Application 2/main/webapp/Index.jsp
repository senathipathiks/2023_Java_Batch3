<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="addStudent" method="post" modelAttribute="student">
<table style="position: absolute;left: 25%">
<h2 style="margin-left: 25%">Student Information</h2>
<tr>
<td>Id</td>
<td><input type="text" name="id" /></td>
</tr>

<tr>
<td>Name</td>
<td><input type="text" name="name" /></td>
</tr>

<tr>
<td>Age</td>
<td><input type="text" name="age" /></td>
</tr>

<tr>
<td colspan="1"></td>
<td><input type="submit" value="Submit" /></td>
</tr>
</table>
</form>
</body>
</html>