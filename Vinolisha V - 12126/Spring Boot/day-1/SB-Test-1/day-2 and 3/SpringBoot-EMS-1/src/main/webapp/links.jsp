<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
	
<style type="text/css">
body {
		background: #0a0908;
		border-radius: 10px;
}

a {
	text-decoration: none;
	color:black;
}

.btn {

display: flex;
justify-content: center;
	font-weight: bold;
	justify-content: space-between;
	border-radius: 10px;
	border-radius: 5px;
	outline: none;
	background-color: #d3d3d3;
	color: black;
	align-items: center;
	cursor: pointer;
	border: none;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 2);
	font-size: 12px;
	
}

.maincontainer {

	padding: 15px 80px;
	display: flex;
	flex-direction: row;
	row-gap: 20px;
	align-items: center;
	justify-content: space-between;
	display: flex;
	border-radius: 20px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

a:hover {
	text-decoration: none;
}

h4{
margin: 0;
margin-top:5px;
color:white;
}
</style>
</head>
<body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<h4><marquee>Employee Management System</marquee></h4>
	<div class="maincontainer" with="20%" cellspacing="15" align="center">
	
		<div class="btn">
			<a href="home"target="content">Home Page</a>
		</div>
	
		<div class="btn">
			<a href="insert" target="content">Insert Employee</a>
		</div>
		<div class="btn">
			<a href="delete" target="content">Delete Employee</a>
		</div>
		<div class="btn">
			<a href="deleteemployeebyname" target="content">Delete By Name</a>
		</div>
		<div class="btn">
			<a href="updateemployee" target="content">Update Employee</a>
		</div>
		<div class="btn">
			<a href="findemployee" target="content">Find Employee</a>
		</div>
		<div class="btn">
			<a href="findemployeebyname" target="content">Find Employee By Name</a>
		</div>
		<div class="btn">
			<a href="findAll" target="content">Find All Employee</a>
		</div>
	</div>
</body>
</html>