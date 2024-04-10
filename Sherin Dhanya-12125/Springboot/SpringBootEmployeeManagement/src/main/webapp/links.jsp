<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">

a {
	text-decoration: none;
}

th {
	background-color: ash;
	color: black;
	font-weight: bolder;
	font-size: x-large;
	height: 30px;
	border-radius: 20px;
	padding-left: 120px;
}
#title{
padding-top: 20px;
display: flex;
}
img{
    width: 100px;
    margin-left: 15%;
}
h1{
padding-right: -35px;
padding-top: -14px;
}

.header{
    display: flex;
    flex-direction: row;
}

h1{
    display: flex;
    align-items: center;
    padding-left: 10%;
}
</style>
</head>
<body >
	
	<div style="width: 50%" id="title"></div>
	<div class="header">
        <img src="https://www.codester.com/static/uploads/items/000/028/28925/icon.png"/>
        <h1 > Welcome to Employee Management System</h1>
    </div>
	
	</div>

	<table width="50%" cellspacing="15px">
		<th><a href="InsertEmployee" target="frame2" type="button" class="btn btn-outline-info">Insert</a></th>
		<th><a href="DeleteEmployeeById" target="frame2" type="button" class="btn btn-outline-info " >Delete by Id</a></th>
		<th><a href="DeleteEmployeeByName" target="frame2" type="button" class="btn btn-outline-info">Delete by Name</a></th>
		<th><a href="UpdateEmployee" target="frame2" type="button" class="btn btn-outline-info">Update</a></th>
		<th><a href="FindEmployee" target="frame2" type="button" class="btn btn-outline-info">Find By Id</a></th>
		<th><a href="FindEmployeeByName" target="frame2" type="button" class="btn btn-outline-info">Find By Name</a></th>
		<th><a href="FindAllEmployee"target="frame2" type="button" class="btn btn-outline-info">Find all </a></th>
	</table>
</body>
</html>