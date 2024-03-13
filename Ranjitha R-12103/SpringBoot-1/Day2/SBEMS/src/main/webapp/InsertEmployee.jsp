<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<title>Insert title here</title>

<style type="text/css">
td, tr {
	height: 40px;
	width: 100px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 20px;
	margin-left: 130px;
}

body {
	background-image:
		url("https://d2slcw3kip6qmk.cloudfront.net/marketing/blog/2017Q4/hr-matrix/hr-matrix-header.png");
}

.button {
	border: none;
	background-color: maroon;
	color: white;
	font-weight: bold;
}

table {
	
}

h2 {
	color: black;
}

#card {
	align-content: center;
	justify-content: center;
	padding: 20px;
	margin-top: 50px;
	margin-left: 350px;
	background-color: gray;
}
</style>
</head>
<body>
	<div class="card w-50" id="card">
		<div class="card-body">

			<form action="PerformInsert">
				<br>
				<h2 align="center">Insert Employee Details</h2>
				<br>

				<table width="80%' border="0">
					<tr>
						<td>Employee Id</td>
						<td><input type="text" name="eid" required="required"></td>
					</tr>
					<tr>
						<td>EmployeeName</td>
						<td><input type="text" name="ename" required="required"></td>
					</tr>
					<tr>
						<td>EmployeeSalary</td>
						<td><input type="text" name="salary" required="required"></td>
					</tr>

					<tr>
						<td colspan="2" align="center"><input class="button"
							type="submit" value="InsertEmployee" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<br>
	<center>
		<font color="white"><h4>
				<b>${msg}</b>
			</h4></font>
	</center>

</body>
</html>