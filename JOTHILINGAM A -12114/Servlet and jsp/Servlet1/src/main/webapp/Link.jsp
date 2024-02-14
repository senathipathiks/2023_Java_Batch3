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

background: rgb(93,86,219);
background: linear-gradient(90deg, rgba(93,86,219,0.804359243697479) 15%, rgba(129,208,15,1) 23%, rgba(93,186,205,1) 50%);

}
</style>
</head>
<body >
<div class="container d-flex align-item-center justify-content-center">
<form action="InsertServlet" method="post">
<br><br><br><br>

<a href="Insert.jsp" class="btn btn-danger btn-lg" name="button" target="frame2">Insert</a><br><br>
<a href="Delete.jsp" class="btn btn-secondary btn-lg" name="button" target="frame2">Delete</a><br><br>
<a href="Update.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Update</a><br><br>
<a href="View.jsp" class="btn btn-success btn-lg" name="button" target="frame2">Find</a><br><br>

</form>
</div>

</body>
</html>