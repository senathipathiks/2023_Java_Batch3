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
	margin-top: 110px;
	font-weight: bold;
	opacity: 0.9;
}
 
body:hover {
	opacity: 9.0;
}
 
.card {
	border: none;
	border-radius: 10px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
	background-color: rgba(255, 255, 255, 0.8);
	padding: 20px;
	margin-top: 50px;
}
 
.card-header {
	background-color: #007bff;
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
	border: none;
	border-radius: 5px;
	box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.1);
	font-size: 16px;
	margin-bottom: 10px;
}
 
input[type="submit"] {
	background-color: #007bff;
	color: white;
	border: none;
	border-radius: 5px;
	padding: 10px 20px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}
 
input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
 
	<div class="card w-100 ">
		<div class=" text-center"></div>
		<div class="card-body ">
			
				<table style="border: none; width: 100%;">
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Employee Salary</th>
					
					<c:forEach var="emp" items="${empList}">
					<form action="EditOrRemove">
						<tr>
							<td><input type="text" value="${emp.empId}" name="empId"
								readonly='readonly' /></td>
							<td><input type="text" value="${emp.empName}" name="empName" /></td>
							<td><input type="text" value="${emp.empSalary}"
								name="empSalary" /></td>
							<td><input type="submit" value="Edit"
								class="btn btn-primary" name="btn"></td>
							<td><input type="submit" value="Remove"
								class="btn btn-danger" name="btn"></td>
						</tr>
						</form>
					</c:forEach>
							<form action='PerfromInsert1' method='post'>
							<tr>
								<td><input type='text' name='empId' /></td>
								<td><input type='text' name='empName' /></td>
								<td><input type='text' name='empSalary' /></td>
								<td><input type='submit' value='Save'
									class='btn btn-success' name='emsAction'></td>
						</tr>
						</form>
				
				</table>
			
		</div>
	</div>
</body>
</html>