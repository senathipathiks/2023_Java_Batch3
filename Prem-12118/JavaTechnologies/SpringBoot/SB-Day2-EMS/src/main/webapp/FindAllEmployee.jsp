<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Find Employee</title>

<style>
table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

tr:hover {
	background-color: #f5f5f5;
}

h4 {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>

	<table>
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
			<th><b>Edit</b></th>
			<th><b>Delete</b></th>
		</tr>

		<c:forEach var="Emp" items="${Emp}">
			<form action="EditorDelete">
			<tr>
				<td><input type="text" value="${Emp.eid}" name="eid"
					readonly='readonly' /></td>
				<td><input type="text" value="${Emp.ename}" name="ename" /></td>
				<td><input type="text" value="${Emp.esalary}" name="esalary" /></td>
				<td><input type="submit" value="Edit" name="emsbutton"
					class="btn btn-success"></td>
				<td><input type="submit" value="Delete" name="emsbutton"
					class="btn btn-danger"></td>
			</tr>
			</form>
		</c:forEach>
	</table>


	<form action="Add">
		<table>
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
		</tr>
		<tr>
			<td><input type="text" name="eid"></td>
			<td><input type="text" name="ename"></td>
			<td><input type="text" name="esalary"></td>
			<td><input type="submit" value="Add New Employee"
				name="emsbutton" class="btn btn-warning"></td>
		</tr>
		</table>
	</form>


</body>
</html>
