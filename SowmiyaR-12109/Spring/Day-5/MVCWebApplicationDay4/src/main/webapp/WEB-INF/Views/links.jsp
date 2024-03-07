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

}
#Align{
color:black;
}

</style>
</head>
<body>
<form action="StudentContoller" method="post">

<center> 
<font size="2px">
 
 <a href="Insert" class="btn btn-info btn-lg" name="button" target="frame2" id="Align"><h6>Insert</h6></a>
<a href="Delete" class="btn btn-info btn-lg" name="button" target="frame2" id="Align"><h6>Delete</h6></a>
<a href="Update" class="btn btn-info btn-lg" name="button" target="frame2" id="Align"><h6>Update</h6></a> 
<a href="View" class="btn btn-info btn-lg" name="button" target="frame2" id="Align"><h6>Find</h6></a>

<a href="FindAll" class="btn btn-info btn-lg" name="button" target="frame2" id="Align"><h6>FindAll</h6></a>
</font>

</center>
</form>

</body>
</html>