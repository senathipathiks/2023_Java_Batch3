<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="Red">
<table border="3" align="center">
<tr>
<td>Student ID: </td>
<td><input type="text" name="sid"></td>
</tr>
<tr>
<td colspan="3"><input type="submit" class="btn btn-success btn-lg" value="Find" name="button">
<input type="submit" class="btn btn-success btn-lg" value="Find All" name="button"></td>

</tr>

</table>
</font>

</form>


</body>
</html>