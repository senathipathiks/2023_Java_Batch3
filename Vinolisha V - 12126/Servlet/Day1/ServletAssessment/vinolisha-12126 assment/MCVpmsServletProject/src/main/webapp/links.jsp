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
	background-color: #ffc8dd;
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
		<div><h1>Employment Management System</h1></div>
	</div>

	<div class="container-fluid text-center" id="two">
		<div id="a">
			<a href="insert.jsp" id="button" class="btn btn-primary btn-lg"
				name="button" target="operation">Insert Details</a>
		</div>
		<div id="a">
			<a href="delete.jsp" id="button" class="btn btn-danger btn-lg"
				name="button" target="operation">Delete Details</a>
		</div>
		<div id="a">
			<a href="update.jsp" id="button" class="btn btn-success btn-lg"
				name="button" target="operation">Update Details</a>
		</div>
		<div id="a">
			<a href="search.jsp" id="button" class="btn btn-warning btn-lg"
				name="button" target="operation">Search Details</a>
	</div>
</body>
</htm>