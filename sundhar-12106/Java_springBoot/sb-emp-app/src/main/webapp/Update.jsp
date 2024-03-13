<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<form id="form-1" action="GetEmp" method="post"
			 class="border rounded p-3 shadow">
			<h1 class="text-center">Update Employee</h1>
			<table id="table-1" class="">

				<tr>
					<th>Select Employee ID</th>
					<td><select name="empId" class="form-control">
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
						<td colspan="2" class="text-center text-danger">
							Record not found try again!!!
						</td>
					</tr>
					</c:if>

				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-success" type="submit"
						value="findById" /></td>
				</tr>
				</form>
				<form action="UpdateEmp" method="post">
					<c:if test="${emp != null }">
						<tr>
							<td colspan="2" class="text-center">
								<h2>Employee Details</h2>
							</td>
						</tr>
						<tr>
							<th>Employee ID</th>
							<td><input type="number" readonly="readonly" name="empId"
								class="form-control" value="${emp.getEmpId() }" /></td>
						</tr>

						<tr>
							<th>Name</th>
							<td><input type="text" name="empName" class="form-control"
								value="${emp.getEmpName() }"></td>
						</tr>

						<tr>
							<th>E-mail</th>
							<td><input type="text" name="email" class="form-control"
								value="${emp.getEmail() }"></td>
						</tr>

						<tr>
							<th>Phone Number</th>
							<td><input type="text" name="phoneNo" class="form-control"
								value="${emp.getPhoneNo() }"></td>
						</tr>

						<tr>
							<th>Salary</th>
							<td><input type="text" name="salary" class="form-control"
								value="${emp.getSalary()}"></td>
						</tr>


						<tr>
							<td colspan="2" class="text-center"><input
								class="btn btn-primary" type="submit" value="update" /></td>
						</tr>
					</c:if>
			</table>
			<c:if test="${ result == 'Success' }">
				<h3 class="text-success">
					Updation
					<c:out value="${result}" />
				</h3>
			</c:if>
			<c:if test="${ result == 'Failure' }">
				<h3 class="text-success">
					Updation
					<c:out value="${result}"></c:out>
				</h3>
			</c:if>
		</form>


	</div>
</body>
</html>