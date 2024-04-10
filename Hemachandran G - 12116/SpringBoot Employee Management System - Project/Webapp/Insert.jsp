<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<style type="text/css">
body {
	background-color: #EDEADE;
	font-size: 16px;
	margin-left: 30%;
	margin-top: 50px;
	font-weight: bold;
	opacity: 0.9;
}

body:hover {
	opacity: 9.0;
}

form{
margin-bottom: 
}
.card {
	border: none;
	border-radius: 10px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	background-color: rgba(255, 255, 255, 0.8);
	padding: 20px;
	
}

.container{
margin-top: 0px;
}

.card-header {
	background-color: #152238;
	color: white;
	border-radius: 5px 5px 0 0;
	padding: 10px;
	margin-bottom: 20px;
}

.card-body {
	padding: 0;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 10px;
	border-bottom: 1px solid #ddd;
}

th {
	font-weight: bold;
	text-align: left;
}

input[type="text"] {
	width: 100%;
	padding: 10px;
	border: 1px groove grey;
	border-radius: 5px;
	box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.1);
	font-size: 16px;
	margin-bottom: 10px;
}

input[type="submit"] {
	
	
	border: 1px solid darkgreen;
	border-radius: 5px;
	padding: 10px 20px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

</style>
</head>
<body>
	
	<div class="card w-50 ">
		<div class="card-header text-center">
			<h5>Enter the Employee Details to Insert :</h5>
		</div>
		<div class="card-body ">
			<form action="InsertOperation">
				
									<label>Employee Id:</label>
									<input type="text" name="empId"
										autocomplete="off" placeholder="Enter emp id" required="required" />
								
									<label>Employee Name:</label>
									<input type="text"
										name="empName" autocomplete="off" placeholder="Enter emp name" required="required" />
								
									<label>Employee Salary:</label>
									<input type="text" name="salary"
										autocomplete="off" placeholder="Enter emp salary" />
								
								
										<input type="submit" class="btn btn-outline-success"
										name="button" value="Insert" />
									
									

			</form>
			
			
		</div>
		
		
	</div>
	<h3>${msg}</h3>
</body>
</html>
