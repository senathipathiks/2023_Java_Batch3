<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Find All</title>
</head>
<body>

	<div class="tabular">
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Employee ID</th>
					<th scope="col">Employee Name</th>
					<th scope="col">Employee Salary</th>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="emp" items="${EmpList}">
				  <form action="EditOrDelete">
					<tr>

						<td><input type="text" value="${emp.eid}" name="eid" readonly="readonly"/></td>
						<td><input type="text" value="${emp.ename}" name="ename"/></td>
						<td><input type="text" value="${emp.esalary}" name="esalary"/></td>
						<td><input type = "submit" id = "submit-btn" class = "btn btn-primary"  value = "Edit/Save" name = "btn" /></td>
						<td><input type = "submit" id = "submit-btn" class = "btn btn-danger"  value = "Delete" name = "btn" /></td>
					</tr>
					</form>
				
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div>
		
	</div>
</body>
</html>