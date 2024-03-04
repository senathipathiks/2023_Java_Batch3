<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information</h2>
	<form  action="addStudent" modelAttribute="student">
	
	<table>
	
	<tr>
		<td>Name</td>
		<td><input type="text" name="name">
	</tr>
	
	<tr>
		<td>Age</td>
		<td><input type="number" name="age"></td> 
	</tr>
	
	<tr>
		<td>Gender</td>
		<td><input type="text" name="gender"></td>
	</tr>
	
	<tr>
		<td>City</td>
		<td><input type="text" name="city"></td> 
	</tr>
	
	<tr>
		<td colspan="2">
		<input type="submit" value="Submit"></td>
	</tr>
	
	</table>
	
	</form>
</body>
</html>