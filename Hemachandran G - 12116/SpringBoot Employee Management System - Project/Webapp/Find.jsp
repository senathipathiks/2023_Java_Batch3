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
	margin-top: 30px;
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
	border: none;
	border-radius: 5px;
	box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.1);
	font-size: 16px;
	margin-bottom: 10px;
}

input[type="submit"] {
	border: 1px solid black;
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
</style>
</head>
<body>

	<div class="card" id="eid">
		<div class="card-header text-center" id="ban">
			<h5>Enter the Employee Details to Delete :</h5>
		</div>
		<div class="card-body ">
			<form action="FindEmployee">
				<table style="border: none; width: 100%;">

					<tr>

						<td style="padding: 10px; vertical-align: top;">
							<table style="width: 100%;">
								<tr>
									<td style="padding: 5px;"><label>Enter Employee
											Id:</label></td>
									<td><select
										class="btn btn-muted dropdown-toggle dropdown-toggle-split"
										name="empId" required="required" style="border: 1px solid black">
											<option>Select Id to Find</option>
											<c:forEach var="id" items="${idList}">

												<option value="${id}">${id}</option>

											</c:forEach>
									</select></td>
								</tr>

								<td colspan="2" style="text-align: right; padding: 10px;">
									<input type="submit" class="btn btn-outline-success"
									name="button" value="Find" />
								</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</form>

			<table>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Salary</th>
				</tr>

				<tr>
					<th>${Emp.empId}</th>
					<th>${Emp.empName}</th>
					<th>${Emp.salary}</th>
				</tr>
			</table>


			</tr>

		</div>

	</div>


	<!-- ************************************************************************* -->

	<div id="name" class="card" align="center">
		<div class="card-header text-center" id="ban">
			<h5>Enter the Employee Details to Delete :</h5>
		</div>
		<div class="card-body ">
			<form action="FindEmployeeByName">
				<table style="border: none; width: 100%;">

					<tr>

						<td style="padding: 10px; vertical-align: top;">
							<table style="width: 100%;">
								<tr>
									<td style="padding: 5px;"><label>Enter Employee
											Name:</label></td>
									<td><select
										class="btn btn-muted dropdown-toggle dropdown-toggle-split"
										name="empName" required="required" style="border: 1px solid black">
											<option>Select Name to Find</option>
											<c:forEach var="name" items="${nameList}">

												<option value="${name}">${name}</option>

											</c:forEach>
									</select></td>
								</tr>

								<td colspan="2" style="text-align: right; padding: 10px;">
									<input type="submit" class="btn btn-outline-success"
									name="button" value="Submit" />
								</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</form>

			<table>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Salary</th>
				</tr>
				<c:forEach var="Emp" items="${NameList}">
					<tr>
						<th>${Emp.empId}</th>
						<th>${Emp.empName}</th>
						<th>${Emp.salary}</th>
				</c:forEach>
				</tr>
		</div>

	</div>





	</table>
</body>
</html>

