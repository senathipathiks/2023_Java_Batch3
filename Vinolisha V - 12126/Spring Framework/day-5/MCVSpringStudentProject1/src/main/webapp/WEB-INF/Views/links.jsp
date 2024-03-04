<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
body {
	background-image: url("https://snis.edu.in/wp-content/uploads/2023/09/indian-school-students-group-sitting-classroom.jpg");
	
}

#button {	
	margin-left: 20px;
	width: 160px;
	border-radius: 10px;
	height:45px;
	
}

#two {
	display: flex;
	flex-direction: row;
	align-items: center;
	justify-content: center;
}

h1 {
	font-size:30px;
	color: black;
	width:750px;
	margin-left:300px;
	
	
}
</style>
</head>
<body>
	<div class="container-fluid text-center" id="one">
		<div><h1>STUDENT MANAGEMENT SYSTEM</h1></div>
	</div>

	<div class="container-fluid text-center" id="two">
	<div id="a">
			<a href="home" id="button" class="btn btn-light btn-lg"
				name="button" target="operation">Home Page</a>
		</div>
		<div id="a">
			<a href="insert" id="button" class="btn btn-light btn-lg"
				name="button" target="operation">Insert Details</a>
		</div>
		<div id="a">
			<a href="delete" id="button" class="btn btn-light btn-lg"
				name="button" target="operation">Delete Details</a>
		</div>
		<div id="a">
			<a href="update" id="button" class="btn btn-light btn-lg"
				name="button" target="operation">Update Details</a>
		</div>
		<div id="a">
			<a href="search" id="button" class="btn btn-light btn-lg"
				name="button" target="operation">View Details</a>
	</div>
	<div id="a">
			<a href="searchall" id="button" class="btn btn-light btn-lg"
				name="button" target="operation">ViewAll Details</a>
	</div>
</body>
</htm>