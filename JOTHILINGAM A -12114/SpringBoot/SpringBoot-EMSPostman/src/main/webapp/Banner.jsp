<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banner page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style>
body {
	background-color: #152238;	
	align-content: center;
	
}

#title {
	margin-top:20px;
	display: flex;
  	align-items: center;
  	justify-content: center;	
}



.div {
	background-color: #152238;
	display: flex;
	row-gap: 50px;
	margin-top: 10px;	
  display: flex;
  align-items: center;
  justify-content: center;
}
a:hover {
    color: white;
	background-color: blue;
	
}
ul {		
	width: 50%;
	height: 10%;
	display: flex;
  align-items: center;
  justify-content: center;	
  margin-left: auto;
  margin-right: auto;
}
.nav{
padding-left: 61px;

}
</style>
</head>
<body>
	<div style="color: white;" id="title">
		<h2>Employee Management System</h2>
	</div>
	
	<div>
	<ul class="nav nav-pills">
  <li class="nav-item">
    <a class="nav-link " target="operation" href="Insert" style="color: white;">Insert</a>
  </li>
  <li class="nav-item">
    <a class="nav-link " target="operation" href="Delete" style="color: white;">Delete</a>
  </li>
  
  <li class="nav-item">
    <a class="nav-link " target="operation" href="DeleteName" style="color: white;">Delete By Name </a>
  </li>
  <li class="nav-item">
    <a class="nav-link" target="operation" href="Update" style="color: white;" >Update</a>
  </li>
    <li class="nav-item">
    <a class="nav-link" target="operation" href="Find" style="color: white;">Find</a>
  </li>
  </li>
    <li class="nav-item">
    <a class="nav-link" target="operation" href="FindByName" style="color: white;">Find By Name</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" target="operation" href="FindAll" style="color: white;">FindAll</a>
  </li>
 
</ul>
</div>
	



</body>
</html>