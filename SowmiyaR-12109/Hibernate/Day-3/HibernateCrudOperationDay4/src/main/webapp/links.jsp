<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body{
  background-size:contain;
 background-repeat:no-repeat;
 background-position: right;
}
#id1{
background-color:grey;
}
#id2{
background-color:grey;
}
#id3{
background-color:grey;
}
#id4{
background-color:grey;
}
</style>
</head>
<body>
<form action="InsertHb" method="post">
<br><br><br><br>
<br>
<center>
<font size="2px">
 
<div id="id1" class="card card-body text-center" style="Width:40%" style="height:30%"> <a href="insert.jsp" class="btn btn-success btn-lg" name="button" target="frame2"><h6>INSERT</h6></a></div> <br> <br>
<div id="id2" class="card card-body text-center" style="Width:40%" style="height:30%"><a href="delete.jsp" class="btn btn-danger btn-lg" name="button" target="frame2"><h6>DELETE</h6></a></div> <br> <br>
<div id="id3" class="card card-body text-center" style="Width:40%" style="height:30%"><a href="update.jsp" class="btn btn-info btn-lg" name="button" target="frame2"><h6>UPDATE</h6></a> </div><br> <br>
<div id="id4" class="card card-body text-center" style="Width:40%" style="height:30%"><a href="view.jsp" class="btn btn-primary btn-lg" name="button" target="frame2"><h6>FIND</h6></a></div>

</font>
</center>

</form>
</body>
</html>