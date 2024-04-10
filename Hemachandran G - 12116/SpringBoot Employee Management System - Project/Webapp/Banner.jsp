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
	margin-top: 20px;
}

#title {
	margin-top: 40px;
	margin-left: 400px;
}

.div {
	background-color: #152238;
	display: flex;
	row-gap: 50px;
	margin-top: 10px;
	margin-left: 450px;
	
}

a {
margin: 10px;
border: 1px solid white;
	
}


ul {
	margin-left: 30%;
	
	width: 37%;
	height: 10%;
	margin-top: 10px;
}
</style>
</head>
<body>
	<div style="color: white; "
		id="title">
		<h2>Employee Management System</h2>
	</div>


<ul class="nav nav-pills">
  <li class="nav-item">
    <a class="btn btn-outline-primary " target="operation" href="Insert" style="color: white;">Insert</a>
  </li>
  <li class="nav-item">
    <a class="btn btn-outline-primary " target="operation" href="Delete" style="color: white;">Delete</a>
  </li>
  <li class="nav-item">
    <a class="btn btn-outline-primary" target="operation" href="Update" style="color: white;" >Update</a>
  </li>
    <li class="nav-item">
    <a class="btn btn-outline-primary" target="operation" href="Find" style="color: white;">Find</a>
  </li>
  <li class="nav-item">
    <a class="btn btn-outline-primary" target="operation" href="FindAll" style="color: white;">FindAll</a>
  </li>
 
</ul>
</body>
</html>