<%@page import="com.employeeApp.dto.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<form id="form-1" action="findById" method="post" modelAttribute="employee"
			class="border rounded p-3 shadow">
			<h1 class="ms-4">Fetch Employee</h1>
			<table id="table-1" class="">

				<tr>
					<th>Select Employee ID</th>
					<td><select name="eid" class="form-control">
							<option>select</option>

							<c:if test="${ls != null}">
								<c:forEach items="${ls}" var="ls">
									<option>${ls}</option>
								</c:forEach>

							</c:if>
					</select></td>
				</tr>


				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-success" type="submit" name="emsAction"
						value="findById" /></td>
				</tr>

				<c:if test="${emp != null }">
					<tr>
						<td colspan="2" class="text-center">
							<h2>Employee Details</h2>
						</td>
					</tr>
					<tr>
						<th>Employee ID</th>
						<td><input type="number" class="form-control"
							readonly="readonly" value="${emp.getEid() }"></td>
					</tr>
					<tr>
						<th>Employee Name</th>
						<td><input type="text" class="form-control"
							readonly="readonly" value="${emp.getName()}"></td>
					</tr>
					<tr>
						<th>Employee Salary</th>
						<td><input type="number" class="form-control"
							readonly="readonly" value="${emp.getSalary()}"></td>
					</tr>
				</c:if>

			</table>
		</form>


	</div>
</body>
</html>