<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="container-fluid   d-flex justify-content-center align-item-center mt-5">
		<form id="form-1" action="Save" method="post"
			class="border shadow rounded p-3">
			<h1 class="ms-4">Insert Details</h1>
			<table id="table-1" class="">
				<tr>
					<td>Enter Employee Name</td>
					<td><input class="form-control" name="empName" type="text" required="required"></td>
				</tr>
				
				<tr>
					<td>Enter E-mail</td>
					<td><input class="form-control" name="email" type="email" required="required"></td>
				</tr>
				
				<tr>
					<td>Enter phone number </td>
					<td><input class="form-control" name="phoneNo" type="tel" pattern="[7-9]{1}[0-9]{9}" required="required"></td>
				</tr>

				<tr>
					<td>Enter Employee salary</td>
					<td><input class="form-control" name="salary" type="number" required="required"></td>
				</tr>

				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-success" type="submit" 
						value="ADD Employee" /></td>
				</tr>

			</table>
			<c:if test="${ result == 'Success' }">
				<h3 class="text-success">
					insertion
					<c:out value="${result}" />
				</h3>
			</c:if>
			<c:if test="${ result == 'Failure' }">
				<h3 class="text-success">
					insertion
					<c:out value="${result}"></c:out>
				</h3>
			</c:if>
		</form>
	</div>
</body>
</html>