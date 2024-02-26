<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body{

}
.Table{
border:6px solid thin;
background-color: silver;

}
#button{
padding-right: 20px;
text-align: center;
}
h5{
color:black;
text-shadow: 1px 2px silver;
}
#id{
background-color: transparent;

}

</style>
</head>
<body>
<br><br><br><br>
<div id="id"  style="width:70%">
<h5 ><i><center>INSERT STUDENT DETAILS</center></i></h5>
<form action="InsertHb" method="post" >
<font size="5px" color="black">
<table border="4" align="center" class="Table">

<tr>
<td><h4>Student Name</h4></td>
<td><input type="text" name="name" required></td>
</tr>
<tr>
<td><h4>Student city</h4></td>
<td><input type="text" name="city" required  ></td>
</tr>

<tr id="button">
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg"  value="INSERT" required name="button">
</tr>

</div>


</table>
</font>

</form>

</body>
</html>