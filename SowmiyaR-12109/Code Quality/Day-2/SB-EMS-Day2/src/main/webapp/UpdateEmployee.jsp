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
body {
	background-image:
		url("https://www.247hrm.com/wp-content/uploads/2016/07/tech-background-image-2.jpg" );
	background-repeat: no-repeat;
	background-position: right;
	background-size: 1540px;
}

td, tr {
	height: 40px;
	padding: 5px;
	border: 2px solid purple;
	border-radius: 10px;
	border: 0;
}

input, select {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	border: 0;
}

.button {
	border: none;
	background-color: grey;
	color: black;
	font-weight: bold;
}

table {
	border: 6px grey;
	padding: 40px;
	background-color: silver;
	border-radius: 25px;
	color: purple;
}
</style>
</head>
<body>

	<form action="FetchEmployee" method="post">
		<br>
		<h2 align="center">Find Employee Details</h2>
		<br>

		<table width="40%' border=" 0" align="center">
			<tr>
				<td><h3>Employee Id</h3></td>
				<td><select name="eid">

						<c:forEach var="id" items="${IdList}">
							<option value="${id}">${id}</option>
						</c:forEach>
				</select></td>


			</tr>

			<tr>
				<td colspan="2" align="center"><input class="button"
					value="Fetch Employee" type="submit" /></td>
			</tr>
		</table>
	</form>

	<br>
	<form action="PerformUpdate"> 
	<table width="50%" align="center">

		<tr>
			<td>Employee Id</td>
			<td><input type="text" name="eid" readonly="readonly" value="${Emp.eid}"/></td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td><input type="text" name="ename" value="${Emp.ename}"></td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td><input type="text" name="esalary" value="${Emp.esalary}"></td>
		</tr>
		<tr><td colspan="2" align="center"><input class="button"
					value="Update Employee" type="submit" /></td></tr>
	</table>
 </form>
	<center>
		<font color="white"><h1>${msg}</h1></font>
	</center>

</body>
</html>