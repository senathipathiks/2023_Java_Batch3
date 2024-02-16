<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<form action="InsertServlet" method="post">
<font size="5px" color="green"><br>
		<br>
		<br>
		<table border="1" align="center">
		<tr>
		<td>Student Id:</td>
		<td><input type="text" name="sId"></td></tr>
		<tr>
		<td colspan="2"><center><input type="submit" class="btn btn-primary btn-md" name="button" value="Find"></center></td></tr>
		<tr>
		<td colspan="2"><center><input type="submit" class="btn btn-primary btn-md" name="button" value="FindAll"></center></td></tr>
		</table>
</font>
</form>
</body>
</html>