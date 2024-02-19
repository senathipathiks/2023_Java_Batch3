<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br><br><br>
<form action="InsertServlet" method="post">

<table border="1" align="center">
<tr>
<td>Student Id: </td>
<td><input type="text" name="sid"></td>
</tr>


<tr>
<td colspan="2"><input type="submit" class="btn btn-danger btn-sm" value="Delete" name="button"></td>
</tr>

</table>
</form>
</body>
</html>