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
background-color: #152238;
display: grid;
row-gap: 50px;
margin-top: 50px;
margin-left: 10px;
}

</style>
</head>
<body>
<div  style="width:90%;" ><a href="Insert" class="btn btn-primary " name="button" target="operation">Insert</a></div>
<div  style="width:90%;" ><a href="Delete" class="btn btn-primary" name="button" target="operation">Delete</a></div>
<div  style="width:90%;"><a href="Update" class="btn btn-primary " name="button" target="operation">Update</a></div>
<div  style="width:90%;"><a href="Find" class="btn btn-primary" name="button" target="operation">Search</a></div>
</body>
</html>
