<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete by name</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="container-fluid  d-flex justify-content-center align-item-centern mt-4">
		<form id="form-1" action="DelEmpName" method="post"
			class="border rounded p-3 shadow">
			<h1 class="text-center">Delete by name Employee</h1>
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
						class="btn btn-success" type="submit" value="Delete" /></td>
				</tr>
				</form>
				<c:if test="${ result == 'Success' }">
					<h3 class="text-success">
						Deletion
						<c:out value="${result}" />
					</h3>
				</c:if>
				<c:if test="${ result == 'Failure' }">
					<h3 class="text-success">
						Deletion
						<c:out value="${result}"></c:out>
					</h3>
				</c:if>
			</table>
	</div>
</body>
</html>