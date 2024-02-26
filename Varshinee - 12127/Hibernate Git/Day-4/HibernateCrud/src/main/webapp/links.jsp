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

}
.button {
  transition-duration: 0.4s;
}

.button:hover {
  background-color: #04AA6D; /* Green */
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<form action="InsertServlet" method="post">
<center>
<font size="5px" color="orange">

<a href="insert.jsp" class="btn btn-success btn-lg" name="button" target="frame2">Insert</a>

<a href="delete.jsp" class="btn btn-danger btn-lg" name="button" target="frame2">Delete</a>

<a href="update.jsp" class="btn btn-warning btn-lg" name="button" target="frame2">Update</a>

<a href="Find.jsp" class="btn btn-info btn-lg" name="button" target="frame2">Find</a>
</center>
</font>


</form>

</body>
</html>