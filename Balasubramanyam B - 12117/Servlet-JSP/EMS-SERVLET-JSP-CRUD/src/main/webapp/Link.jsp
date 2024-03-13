<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Link Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
background: url(240_F_159330343_LXJNQkkFaA6tRoYIqX4VWjTVA8ISOG8a.jpg);
 
  background-size: 100% 100%;
display: grid;
row-gap: 40px;
margin-top: 50px;
margin-left: 40px;
margin-right: 5px;
}

</style>
</head>
<body>
<div class="card card-body text-center " style="width:80%;" ><a href="Insert.jsp" class="btn btn-success " name="button" target="operation">Insert</a></div>
<div class="card card-body text-center " style="width:80%;" ><a href="Delete.jsp" class="btn btn-danger" name="button" target="operation">Delete</a></div>
<div class="card card-body text-center " style="width:80%;"><a href="Update.jsp" class="btn btn-warning " name="button" target="operation">Update</a></div>
<div class="card card-body text-center " style="width:80%;"><a href="Search.jsp" class="btn btn-info" name="button" target="operation">Search</a></div>
</body>
</html>