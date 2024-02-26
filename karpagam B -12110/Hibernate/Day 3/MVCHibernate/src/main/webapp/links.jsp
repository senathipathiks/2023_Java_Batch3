<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body{
background-color:white;
}
 .pagination{
     padding: absolute;
     margin-left: 30%;
  
  }
 

</style>
</head>
<body>
<div class="btn-group-horizontal">

<form action="" method="post">
<center>
<font size="5px" color="orange">
<br>
<i class="bi bi-1-circle-fill"></i><a href="home.jsp" class="btn btn-dark btn-lg" name="button" target="frame1"><b>HOME</b></a>
<i class="bi bi-1-circle-fill"></i><a href="insert.jsp" class="btn btn-dark btn-lg" name="button" target="frame1"><b>INSERT</b></a>
<a href="delete.jsp" class="btn btn-dark btn-lg" name="button" target="frame1"><b>DELETE</b></a>
<a href="update.jsp" class="btn btn-dark btn-lg" name="button" target="frame1"><b>UPDATE</b></a>
<a href="view.jsp" class="btn btn-dark btn-lg" name="button" target="frame1"><b>SEARCH</b></a>

</font>
</center>

</form>
</div>
</body>
</html>