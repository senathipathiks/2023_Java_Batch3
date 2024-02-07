<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<style>
h1{
  color:purple;
  padding: 90px;
  margin :40px;
}
</style>
<body>
<center>  
<h1>Welcome to my page !!!!  <%= request.getParameter("name") %></h1>
</center>
</body>
</html>