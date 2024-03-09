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

<style type="text/css">
body {
	background-color:
}

a {
	text-decoration: none;
	color: white;
}

.btn {
	padding: 10px 10px;
	font-weight: bold;
	row-gap: 50px;
	justify-content: center;
	border-radius: 10px;
	width: 150px;
	border-radius: 5px;
	outline: none;
	background-color: #023095;
	display: inline-block;
	padding-left: 0px;
	align-items: center;
	color: white;
	cursor: pointer;
	border: none;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 2);
	margin-left: 20px;
	font-size: 12px;
}

.maincontainer {
	display: flex;
	flex-direction: row;
	row-gap: 20px;
	align-items: center;
	justify-content: center;
	background: #023095;
	display: flex;
	min-height: 100px;
	border-radius: 20px;
	margin: 0px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

a:hover {
	text-decoration: none;
}
</style>
</head>
<body>
	<div class="maincontainer" with="20%" cellspacing="15" align="center">
	
		<div class="btn">
			<a href="home"target="content">Home Page</a>
		</div>
	
		<div class="btn">
			<a href="insertion" target="content">Insert Employee</a>
		</div>
		<div class="btn">
			<a href="delete" target="content">Delete Employee</a>
		</div>
		<div class="btn">
			<a href="update" target="content">Update Employee</a>
		</div>
		<div class="btn">
			<a href="find" target="content">Find Employee</a>
		</div>
		<div class="btn">
			<a href="findAll" target="content">Find All Employee</a>
		</div>
	</div>
</body>
</html>