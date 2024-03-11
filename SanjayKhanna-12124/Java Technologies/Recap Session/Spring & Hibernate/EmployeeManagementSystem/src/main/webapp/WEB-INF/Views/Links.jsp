<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style type="text/css">
a{
 text-decoration: none;
 color: black;
}
th{
background-color: purple;
font-size: 24px;
}
th:hover {
	color:red;
	background-color: blue;
}
</style>
</head>
<body>
<br><br><br>
<table width="100%" cellpadding="15" align="center">
<th><a href="insert" target="Operation" >Insert</a></th>
<th><a href="delete" target="Operation">Delete</a></th>
<th><a href="update" target="Operation">Update</a></th>
<th><a href="find" target="Operation">Find</a></th>
<th><a href="findall" target="Operation">Find All</a></th>
<th><i class="bi bi-plus-circle-dotted"></i></th>
</table>
</body>
</html>