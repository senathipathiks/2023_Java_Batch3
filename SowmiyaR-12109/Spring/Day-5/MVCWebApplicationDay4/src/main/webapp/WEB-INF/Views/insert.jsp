<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body{
background-image: url("https://t3.ftcdn.net/jpg/03/55/60/70/360_F_355607062_zYMS8jaz4SfoykpWz5oViRVKL32IabTP.jpg");
background-repeat: no-repeat;
background-size: cover;
}
.Table{
border:6px solid thin;
background-color: silver;
height:300px;
border-radius: 50px;
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
<br><br><br><br><center> 
<div id="id"  style="width:70%">
<h5 ><i><center>INSERT STUDENT DETAILS</center></i></h5>
<form action="Insertion" modelAttribute="bean" >
<font size="5px" color="black">
<table border="4" align="center" class="Table">
<tr>
<td><h4>Student ID</h4></td>
<td><input type="text" name="sid" required></td>
</tr>
<tr>
<td><h4>Student Name</h4></td>
<td><input type="text" name="sname" required></td>
</tr>
<tr>
<td><h4>Student city</h4></td>
<td><input type="text" name="scity" required  ></td>
</tr>

<tr id="button">
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg"  value="INSERT" required name="button">
</tr>

</div>


</table>
</font>

</form>
</center>
</body>
</html>