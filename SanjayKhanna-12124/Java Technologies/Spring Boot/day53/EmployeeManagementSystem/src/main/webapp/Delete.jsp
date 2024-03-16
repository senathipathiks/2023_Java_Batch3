<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style type="text/css">
body {
	background-image:
		url('https://watermark.lovepik.com/photo/50101/5995.jpg_wh1200.jpg');
	background-size: cover;
	margin-left: 480px;
	margin-top: 50px;
}

#form {
	border-radius: 5px;
	background-color: rgba(255, 255, 255);
	padding: 20px;
	width: 600px;
	height: auto;
}

#butt {
	width: 150px;
	margin-left: 400px;
}
</style>
</head>
<body>
	<div id="form" class="row g-3">
		<div
			class="text-center shadow p-2 bg-body rounded h3 text-primary mb-3">Delete
			here</div>

		<form action="DeleteOption" method="post">
			<div class="input-group input-group-lg shadow">
				<span class="input-group-text col-5">Select option to delete</span>
				<select class="form-select col-4" name="option">
					<c:if test="${opt != null}">
						<option selected class="d-none" value="${opt}">${opt}</option>
					</c:if>
					<option value="id">Id</option>
					<option value="name">Name</option>
					<option value="salary">Salary</option>
				</select>
				<button type="submit" class="btn btn-primary col-3" name="button">
					Select</button>
			</div>
		</form>

		<c:if test="${opt != null}">
			<c:if test="${opt == 'Id'}">
				<form action="DeleteEmployeeById" method="post">
					<div class="input-group input-group-lg shadow">
						<span class="input-group-text col-5">Select Employee Id</span> <select
							class="form-select col-4" name="empId">
							<option selected value="-1">Choose</option>
							<c:forEach items="${idList}" var="id">
								<option value='${id}'>${id}</option>
							</c:forEach>
						</select>
						<button type="submit" class="btn btn-danger col-3" name="button">
							<i class="bi bi-trash"></i> Delete
						</button>
					</div>
				</form>
			</c:if>
			<c:if test="${opt == 'Name'}">
				<form action="DeleteEmployeeByName" method="post">
					<div class="input-group input-group-lg shadow">
						<span class="input-group-text col-5">Select Employee Name</span> <select
							class="form-select col-4" name="empName">
							<option selected value="-1">Choose</option>
							<c:forEach items="${nameList}" var="id">
								<option value='${id}'>${id}</option>
							</c:forEach>
						</select>
						<button type="submit" class="btn btn-danger col-3" name="button">
							<i class="bi bi-trash"></i> Delete
						</button>
					</div>
				</form>
			</c:if>
			<c:if test="${opt == 'Salary'}">
				<form action="DeleteEmployeeBySalary" method="post">
					<div class="input-group input-group-lg shadow">
						<span class="input-group-text col-5">Select Employee Salary</span>
						<select class="form-select col-4" name="empSalary">
							<option selected value="-1">Choose</option>
							<c:forEach items="${salaryList}" var="id">
								<option value='${id}'>${id}</option>
							</c:forEach>
						</select>
						<button type="submit" class="btn btn-danger col-3" name="button">
							<i class="bi bi-trash"></i> Delete
						</button>
					</div>
				</form>
			</c:if>
		</c:if>
		<c:if test="${msg != null}">
			<c:choose>
				<c:when test="${msg =='success'}">
					<div class='alert alert-success' role='alert'>
						<i class='bi bi-check-circle'></i>
						<c:out value="Record Deleted Successfully"></c:out>
					</div>
				</c:when>
				<c:otherwise>
					<div class='alert alert-danger' role='alert'>
						<i class='bi bi-check-circle'></i>
						<c:out value="Deletion Failure"></c:out>
					</div>
				</c:otherwise>
			</c:choose>
		</c:if>
		<a href="back"><button type="button" class="btn btn-success"
				id="butt">
				<i class="bi bi-arrow-left"></i> Back
			</button></a>
	</div>
</body>
</html>