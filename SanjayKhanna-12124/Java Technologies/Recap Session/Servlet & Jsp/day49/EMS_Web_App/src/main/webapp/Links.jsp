<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>
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
<th><a href="Controller?action=Insert" target="Operation" >Insert</a></th>
<th><a href="Controller?action=Delete" target="Operation">Delete</a></th>
<th><a href="Controller?action=Update" target="Operation">Update</a></th>
<th><a href="Controller?action=Search" target="Operation">Find</a></th>
<th><a href="Controller?action=ViewAll&buttom" target="Operation">Find All</a></th>
</table>
</body>
</html>