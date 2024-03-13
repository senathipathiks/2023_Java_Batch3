<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FindAll Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<!-- //list all the employee details -->
	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<div class="container">
			<c:if test="${res == 'failure' }">
				<tr>
					<td colspan="2" class="text-center text-danger">Record not
						found try again!!!</td>
				</tr>
			</c:if>
			<table class="table table-striped">
				<c:if test="${empls != null }">
					<tr>
						<td colspan="7" class="text-center">
							<h2>Employee Details</h2>
						</td>
					</tr>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>E-mail</th>
						<th>Phone No</th>
						<th>Salary</th>
						<th>Operation1</th>
						<th>Operation2</th>
					</tr>
					<c:forEach items="${empls}" var="empls">
						<tr>
							<td>${empls.getEmpId() }</td>
							<c:if test="${id != empls.getEmpId() }">
								<td>${empls.getEmpName() }</td>
								<td>${empls.getEmail() }</td>
								<td>${empls.getPhoneNo() }</td>
								<td>${empls.getSalary()}</td>
								<td><a href="EditFA?id=${empls.getEmpId()}"
								class="btn btn-warning">Edit</a></td>
							</c:if>
							<c:if test="${id == empls.getEmpId() }">
							 <form method="post" action="UpdateFA?id=${empls.getEmpId()}">
								<td><input class="form-control" type="text" name="empName" value="${empls.getEmpName() }" required="required" /></td>
								<td><input class="form-control" type="email" name="email" value="${empls.getEmail() }" required="required"/></td>
								<td><input class="form-control" type="tel" name="phoneNo" value="${empls.getPhoneNo() }" required="required"/></td>
								<td><input class="form-control" type="number" name="salary" value="${empls.getSalary()}" required="required"/></td>
								<td><input type="submit" value="Update" class="btn btn-secondary"></td>
								</form> 
							</c:if>

							
							<td><a href="DeleteFA?id=${empls.getEmpId()}"
								class="btn btn-danger">Delete</a></td>
						</tr>
					</c:forEach>
				</c:if>
			</table>
		</div>
	</div>
</body>
</html>