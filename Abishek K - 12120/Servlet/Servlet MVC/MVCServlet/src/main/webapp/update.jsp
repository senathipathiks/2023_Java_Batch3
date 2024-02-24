<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="index.css">
</head>
<body>
<h1 class="banner">Updation Operations</h1>
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="white">
<table border="1" align="center" class="table table-dark table-hover">
<tr>
<td>Student ID: </td>
<td><input type="text" name="studId"></td>
</tr>
<tr>
<td>Student Name: </td>
<td><input type="text" name="studName" ></td>
</tr>
<tr>
<td>City: </td>
<td><input type="text" name="studCity"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" class="btn btn-primary btn-lg" value="Update" name="button"></td>
</tr>
</table>
</font>
</form>

</body>
</html>