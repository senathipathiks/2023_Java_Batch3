<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FindBy Name</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<form id="form-1" action="GetEmpName" method="post"
			class="border rounded p-3 shadow">
			<h1 class="text-center">Find by name Employee</h1>
			<table id="table-1" class="">

				<tr>
					<th>Select Employee Name</th>
					<td><select name="empName" class="form-control">

							<option>select</option>

							<c:if test="${ls != null}">
								<c:forEach items="${ls}" var="ls">
									<option>${ls}</option>
								</c:forEach>

							</c:if>

					</select></td>
				</tr>
				<c:if test="${res == 'failure' }">
					<tr>
						<td colspan="2" class="text-center text-danger">Record not
							found try again!!!</td>
					</tr>
				</c:if>

				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-success" type="submit" value="findByName" /></td>
				</tr>
				</form>
			</table>
	</div>
	<!-- //list all the employee details -->
	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<div class="container">
			<table class="table table-striped">
				<c:if test="${empls != null }">
					<tr>
						<td colspan="5" class="text-center">
							<h2>Employee Details</h2>
						</td>
					</tr>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>E-mail</th>
						<th>Phone No</th>
						<th>Salary</th>
					</tr>
					<c:forEach items="${empls}" var="empls">
						<tr>

							<td>${empls.getEmpId() }</td>
							<td>${empls.getEmpName() }</td>
							<td>${empls.getEmail() }</td>
							<td>${empls.getPhoneNo() }</td>
							<td>${empls.getSalary()}</td>
						</tr>
					</c:forEach>
				</c:if>
			</table>
		</div>
	</div>
</body>
</html>