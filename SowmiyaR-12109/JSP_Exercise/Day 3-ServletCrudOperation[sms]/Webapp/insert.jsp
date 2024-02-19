<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>

 body{
 background-image: url("https://img.freepik.com/free-vector/realistic-design-technology-background_23-2148426705.jpg");
 background-repeat: no-repeat;
 background-size: cover;
 }

</style>
</head>
<body>
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="blue">
<table border="1" align="center">
<tr>
<td><h4>Student ID:</h4></td>
<td><input type="text" name="sid"></td>
</tr>
<tr>
<td><h4>Student Name:</h4></td>
<td><input type="text" name="sname"></td>
</tr>
<tr>
<td><h4>City:</h4></td>
<td><input type="text" name="scity"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="Insert" name="button">
</tr>
</table>
</font>

</form>

</body>
</html>