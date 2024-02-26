<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
 background-image:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKsIzeVJIo4hsyw-IQo0-LtXUVTQI9TZxvgw&usqp=CAU");
background-size: cover;
background-repeat: no-repeat;
height: 450px;
}
table{
 background-image: linear-gradient(to right, pink, purple);
border: 2px solid purple;
}

#button{
text-align: center;
}
td{
font-weight: bold;
}

</style>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="black">
<table border="1" align="center">
<tr>
<td>Student Id: </td>
<td><input type="text" name="sid" required></td>
</tr>
<tr>
<td>Student Name: </td>
<td><input type="text" name="sname" required></td>
</tr>
<tr>
<td>Address </td>
<td><input type="text" name="saddress" required></td>
</tr>
<tr>
<td>Phone No: </td>
<td><input type="text" name="sphoneno" required></td>
</tr>
<tr>
<td>Email: </td> 
<td><input type="text" name="semail" required></td>
</tr>
<tr>
<tr>
<td colspan="2" id="button"><input type="submit" class="btn btn-warning btn-lg" value="Update" name="button">
</td>
</tr>
</table>
</font>
</form>

</body>
</html>