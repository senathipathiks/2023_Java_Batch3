<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Information</h1>
<form action="addEmployee" method="POST" modelAttribute="employee">

<table>
<tr><td>Id</td>
<td><input type="text" name="id"/><br>
</td>
</tr>
<tr><td>Name</td>
<td><input type="text" name="name"/><br>
</td>
</tr>
<tr><td>Age</td>
<td><input type="text" name="age"/><br>
</td>
</tr>

<tr>
<td colspan="2">
<input type="submit" value="submit"/>
</td>
</tr>
</table>

</form>
</body>
</html>