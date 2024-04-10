<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Form</title>
</head>
<body>
<center>
	<h1>Submitted Student Information</h1>

	<table>
		<tr>
			<td>ID:</td>
			<td>${id}</td>
		</tr>

		<tr>
			<td>Name:</td>
			<td>${name}</td>
		</tr>

		<tr>
			<td>Age:</td>
			<td>${age}</td>
		</tr>

		<tr>
			<td>City:</td>
			<td>${city}</td>
		</tr>

	</table>
</center>
</body>
</html>