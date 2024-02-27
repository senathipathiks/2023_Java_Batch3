<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>

.Insert{
padding:5px;
}

.delete{
padding:5px;
}

.update{
padding:5px;
}

.view{
view:10px;
}


</style>
</head>
<body>
<form action="InsertServlet" method="post">
<br><br><br>
<br>
<center>
<font size="5px" color="orange">
<div class="all">
<div class="Insert">
<a href="Insert.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Insert</a><br>
</div>
<div class="delete">
<a href="delete.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Delete</a><br>
</div>
<div class="update">
<a href="update.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Update</a><br>
</div>
<div class="view">
<a href="view.jsp"   class="btn btn-primary btn-lg" name="button" target="frame2">View</a>
</div>
</div>
</font>
</center>
</form>

</body>
</html>