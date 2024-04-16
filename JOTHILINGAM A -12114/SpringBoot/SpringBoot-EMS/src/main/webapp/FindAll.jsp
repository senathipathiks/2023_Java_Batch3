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
	/* margin-left: 30%; */
	/* margin-top: 50px; */
	font-weight: bold;
	opacity: 0.9;
	display: flex;
  	align-items: center;
  	justify-content: center;
	
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
	height:;
	width: 800px;
	align-items: center;
	margin-right:100px;	
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

	color: white;
	border: none;
	border-radius: 5px;
	padding: 10px 20px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}
</style>
</head>
<body>
<div class="box">
<div class="card ">
		<div class=" text-center"></div>
		<div class="card-body ">
				<table>
					<th>
						<form action="Add"></form>
						<input type="submit" value="Add" class="btn btn-primary"
						name="btn">
					</td>
					</form>
					</th>
					<table>
						<tr>
							<form action="New">
								<td><input type="text" name="eid" placeholder="Enter Employee ID" required="required" title="Enter Employee ID"></td>
								<td><input type="text" name="ename" placeholder="Enter Employee Name" required="required" title="Enter Employee Name"></td>
								<td><input type="text" name="esalary"placeholder="Enter Employee Salary" required="required" title="Enter Employee Salary" ></td>
								<td><input type="submit" class="btn btn-warning"
									value="Insert"></td>
							</form>
						</tr>
					</table>
				</table>


				<table style="border: none; width: 100%;">
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Employee Salary</th>
					<th>Action</th>
					<th>Action</th>
					<c:forEach var="emp" items="${empList}">
					<form action="FindAllOrEditOrUpdate">
						<tr>
							<td><input type="text"  name = "eid" value="${emp.eid}" readonly="readonly"></td>
							<td><input type="text"  name = "ename" value="${emp.ename}" required title="please Enter a Name" ></td>
							<td><input type="text"  name = "esalary" value="${emp.esalary}" required="required"  title="please Enter a Employee Salary" ></td>							
							<td><input type="submit" value="Edit/Save" class="btn btn-primary" name="btn"></td>
							<td><input type="submit" value="Remove" name="btn" class="btn btn-danger"></td>
						</tr>
						</form>
					</c:forEach>
				</table>
				
			</div>
	</div>
</div>

	
</body>
</html>

