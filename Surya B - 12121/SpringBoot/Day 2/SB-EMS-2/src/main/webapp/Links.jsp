<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>
<style>
body{
background-color: black;
}
#title{
font-family: sans-serif;
color: White;
text-align: center;
font-size: 12px;
}

a{
text-decoration: none;
color: black;
font-weight: 600;
font-family: sans-serif;
padding: 5px;
border-radius: 10px;
transition: 0.2s;
}

a:hover{
background-color: #87CEEB;
color: white;

}

#collection{
display: flex;
flex-direction: row;
background-color: white;
justify-content: space-around;
width: 450px;
height: 30px;
align-items: center;
border-radius: 15px;

}

#content{
display: flex;
justify-content: center;
}

div
</style>
</head>
<body>
	<div id = "title">
	<h1>Employee Management System</h1>
	</div>
	<div id = "content">
	<div id = "collection">
	
		<div><a href="InsertEmployee" target = "content">Insert</a></div>
		<div><a href="Delete" target = "content">Delete</a></div>
		<div><a href="Update" target = "content">Update</a></div>
		<div><a href="Find" target = "content">Find</a></div>
		<div><a href="FindAll" target = "content">Find All</a></div>
	</div>	
	</div>
	
</body>
</html>