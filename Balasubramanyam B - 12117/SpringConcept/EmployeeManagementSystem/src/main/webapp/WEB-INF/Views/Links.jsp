<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="background-color:rgb(75, 0, 130)";>
<div style="margin-top:11px;">
<ul class="nav justify-content-center gap-5">
  <li class="nav-item">
    <a class="btn btn-success" name="button" target="operation" href="insert">Insert</a>
  </li><br><br>
  <li class="nav-item">
    <a class="btn btn-danger" name="button" target="operation" href="delete">Delete</a>
  </li><br><br>
  <li class="nav-item">
    <a class="btn btn-warning" name="button" target="operation" href="update">Update</a>
  </li><br><br>
  <li class="nav-item">
    <a class="btn btn-info" name="button" target="operation" href="find">View</a>
  </li><br><br>
   <li class="nav-item">
    <a class="btn btn-dark" name="button" target="operation" href="findall">View All</a>
  </li><br><br>
</ul></div>
</body>
</html>