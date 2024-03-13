<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find employee page</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
	integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<form id="form-1" action="GetEmpFind" method="post"
			class="border rounded p-3 shadow">
			<h1 class="text-center">Find Employee</h1>
			<table id="table-1" class="">

				<tr>
					<th>Select Employee ID</th>
					<td><select name="empId" class="form-control">
					
							<option>select </option>

							<c:if test="${ls != null}">
								<c:forEach items="${ls}" var="ls">
									<option>${ls}</option>
								</c:forEach>

							</c:if>
						
					</select>
					
					</td>
				</tr>
				<c:if test="${res == 'failure' }">
					<tr>
						<td colspan="2" class="text-center text-danger">Record not
							found try again!!!</td>
					</tr>
				</c:if>

				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-success" type="submit" value="findById" /></td>
				</tr>
				</form>
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
						<td><input required="required" type="text" name="empName"
							class="form-control" value="${emp.getEmpName() }"></td>
					</tr>

					<tr>
						<th>E-mail</th>
						<td><input required="required" type="text" name="email"
							class="form-control" value="${emp.getEmail() }"></td>
					</tr>

					<tr>
						<th>Phone Number</th>
						<td><input required="required" type="text" name="phoneNo"
							class="form-control" value="${emp.getPhoneNo() }"></td>
					</tr>

					<tr>
						<th>Salary</th>
						<td><input required="required" type="text" name="salary"
							class="form-control" value="${emp.getSalary()}"></td>
					</tr>

				</c:if>
			</table>
	</div>
</body>
</html>