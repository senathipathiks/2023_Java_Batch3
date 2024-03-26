<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"	rel="stylesheet">
</head>
<body>
	<table class="table table-striped align-center container">
		<thead>
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Salary</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${idList}" var="emp">
				<form action="EditOrDelete">
				<tr>
					<td><input type="text" name="eid" value="${emp.eid }" class="form-control form-control-md" readonly="readonly"/></td>
					<td><input type="text" name="ename" value="${emp.ename }" class="form-control form-control-md" /></td>
					<td><input type="text" name="esalary" value="${emp.esalary }" class="form-control form-control-md" /></td>
					<td><input type="submit" name="emsBtn" value="Save/Edit" class="btn btn-success" />
						<input type="submit" name="emsBtn" value="Delete" class="btn btn-danger" />
					</td>
				</tr>
				</form>
				
			</c:forEach>
		</tbody>

	</table>
	<form action="InsertionInFindAll">
		<table class="table table-bordered align-center container">
			<tr>
			<td><input type="text" name="eid" class="form-control form-control-md"/></td>
					<td><input type="text" name="ename" class="form-control form-control-md" /></td>
					<td><input type="text" name="esalary" class="form-control form-control-md" /></td>
					<td><input type="submit" name="button" value="Add" class="btn btn-success" />
			</tr>
		</table>
	
	</form>
</body>
</html>