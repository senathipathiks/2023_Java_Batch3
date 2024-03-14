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
	margin-bottom: 20px;
	font-weight: bold;
	opacity: 0.9;
	display: flex;
	flex-direction: row;
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
	border: 1px solid grey;
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

#name {
	width: 500px;
}

#eid {
	width: 500px;
	align-content: left;
	margin-right: 10px;
}

#ban {
	width: 467px;
}
h3{
margin-top: 20%;
color: green; 

}

</style>
</head>
<body>

	<div class="card" id="eid">
		<div class="card-header text-center" id="ban">
			<h5>Enter the Employee Details to Delete :</h5>
		</div>
		<div class="card-body ">

			<table style="border: none; width: 100%;">

				<tr>

					<td style="padding: 10px; vertical-align: top;">
						<table style="width: 100%;">
							<tr>
								<form action="FetchEmployee">
									<td style="padding: 5px;"><label>Enter Employee
											Id:</label></td>
									<td><select
										class="btn btn-muted dropdown-toggle dropdown-toggle-split"
										name="empId" required="required"
										style="border: 1px solid black">
											<option>Select Id to Update</option>
											<c:forEach var="id" items="${idList}">

												<option value="${id}">${id}</option>

											</c:forEach>
									</select></td>
							</tr>

							<td colspan="2" style="text-align: right; padding: 10px;"><input
								type="submit" class="btn btn-outline-success" name="button"
								value="Fetch Employee" /></td>

							</tr>
						</table>
					</td>
				</tr>
			</table>
			</form>

			<table>
				<form action="UpdateEmployee">

					<tr>
						<td>Employee Id</td>
						<td><input type="text" name="empId" value="${emp.empId}"
							readonly="readonly" placeholder="Employee Id"></td>
					</tr>



					<tr>
						<td>Employee Name</td>
						<td><input type="text" value="${emp.empName}" name="empName" placeholder=" Employee Name"></td>
					</tr>
					<tr>
						<td>Employee Salary</td>
						<td><input type="text" value="${emp.salary}" name="salary" placeholder="Employee Salary"></td>
					</tr>
					<td><input type="submit" class="btn btn-outline-success"
						name="button" value="Update Employee" /></td>
			</table>


			</tr>
			</form>
		</div>
		
	</div>

	<h3>${msg}</h3>

	<!-- ************************************************************************* -->






	</table>
</body>
</html>

