<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
a{
text-decoration:none;
color:white;
}
th{
background-color: green;
height:50px;
font-weight:bold;
}

</style>
</head>
<body>
<table width="100%" cellspacing="10px">
<th><a href="InsertEmployee.jsp" target="content">Insert</a></th>
<th><a href="EMSController?emsAction=Delete" target="content">Delete</a></th>
<th><a href="EMSController?emsAction=Update" target="content">Update</a></th>
<th><a href="EMSController?emsAction=Find" target="content">Find</a></th>
<th><a href="EMSController?emsAction=FindAll" target="content">FindAll</a></th>


</table>

</body>
</html>