<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body class="btn btn-primary btn-lg btn-block">
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="green">
<center>
<table border="1" align="center" class="btn btn-dark" >

<tr><th colspan="2"><center>Update Page</center></th></tr>

<tr>
<td>Student Id To Update: </td>
<td><input type="text" name="sid"></td>
</tr>

<tr>
<td>Student Name: </td>
<td><input type="text" name="sname"></td>
</tr>

<tr>
<td>Phone Number: </td>
<td><input type="text" name="sno"></td>
</tr>

<tr>
<td>City: </td>
<td><input type="text" name="scity"></td>
</tr>

<tr>
<td colspan="2"> <input type="submit" class="btn btn-primary btn-lg active" value="Update" name="button"></td>
</tr>

</center>
</table>
</body>
</html>