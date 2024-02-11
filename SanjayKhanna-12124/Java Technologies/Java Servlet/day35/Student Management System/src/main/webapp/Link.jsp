<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
	margin-top:80px;
 display: grid;
 row-gap: 80px;
 background-color: maroon;
}

</style>
</head>
<body>
<a href="Insert.jsp" class="btn btn-primary btn-lg" name="button" target="content">Insert</a>
<tr><a href="Delete.jsp" class="btn btn-primary btn-lg" name="button" target="content">Delete</a>
<tr><a href="Update.jsp" class="btn btn-primary btn-lg" name="button" target="content">Update</a>
<tr><a href="Search.jsp" class="btn btn-primary btn-lg" name="button" target="content">Search</a>
</body>
</html>