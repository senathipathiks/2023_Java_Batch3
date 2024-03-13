<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body class="bg-danger">
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="black">
<table border="2" align="center">
<tr>
<td>Student ID: </td>
<td><input type="text" name="sid"></td></tr>
<tr>
<td>Student Name: </td>
<td><input type="text" name="sname"></td></tr>
<tr>
<td>Student City: </td>
<td><input type="text" name="scity"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn btn-primary btn-lg align-center" value="Update" name="button"> </td>
</tr>
</table>
</font>
</form>
</body>
</html>