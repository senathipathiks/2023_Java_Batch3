<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
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
	<div id="form" class="row">
		<div
			class="text-center shadow p-2 bg-body rounded h3 text-primary mb-3">Search
			Here...</div>
		<form action="SearchOption" method="post">
			<div class="input-group input-group-lg shadow mb-3">
				<span class="input-group-text col-5">Select option to search</span>
				<select class="form-select col-4" name="option">
					<c:if test="${opt != null}">
						<option selected class="d-none" value="${opt}">${opt}</option>
					</c:if>
					<option value="id">Id</option>
					<option value="name">Name</option>
					<option value="salary">Salary</option>
				</select>
				<button type="submit" class="btn btn-primary col-3" name="button">Select</button>
			</div>
		</form>
		<c:if test="${opt != null}">
			<c:if test="${opt == 'Id'}">
				<form action="SearchEmployeeById" method="post">
					<div class="input-group input-group-lg shadow mb-3">
						<span class="input-group-text col-5">Select Employee Id</span> <select
							class="form-select col-4" name="empId">
							<option selected value="-1">Choose</option>
							<c:forEach items="${idList}" var="id">
								<option value='${id}'>${id}</option>
							</c:forEach>
						</select>
						<button type="submit" class="btn btn-success col-3" name="button">
							<i class="bi bi-search"></i>search
						</button>
					</div>
				</form>
			</c:if>
			<c:if test="${opt == 'Name'}">
				<form action="SearchEmployeeByName" method="post">
					<div class="input-group input-group-lg shadow mb-3">
						<span class="input-group-text col-5">Select Employee Name</span> <select
							class="form-select col-4" name="empName">
							<option selected value="-1">Choose</option>
							<c:forEach items="${nameList}" var="id">
								<option value='${id}'>${id}</option>
							</c:forEach>
						</select>
						<button type="submit" class="btn btn-success col-3" name="button">
							<i class="bi bi-search"></i>Search
						</button>
					</div>
				</form>
			</c:if>
			<c:if test="${opt == 'Salary'}">
				<form action="SearchEmployeeBySalary" method="post">
					<div class="input-group input-group-lg shadow mb-3">
						<span class="input-group-text col-5">Select Employee Salary</span>
						<select class="form-select col-4" name="empSalary">
							<option selected value="-1">Choose</option>
							<c:forEach items="${salaryList}" var="id">
								<option value='${id}'>${id}</option>
							</c:forEach>
						</select>
						<button type="submit" class="btn btn-success col-3" name="button">
							<i class="bi bi-search"></i> search
						</button>
					</div>
				</form>
			</c:if>
		</c:if>
		<c:if test="${msg != null }">
			<c:choose>
				<c:when test="${beanList != null}">
					<div class='alert alert-success mb-3' role='alert'>
						<i class='bi bi-check-circle'></i> Record Found Successfully
					</div>
					<div class="shadow p-2 bg-body rounded h5 text-dark mb-3">No
						of Record Found: ${beanList.size()}</div>
					<table class='table'>
						<tr class='table-primary'>
							<th>Employee Id</th>
							<th>Employee Name</th>
							<th>Employee Salary</th>
						</tr>
						<c:forEach items="${beanList}" var="bean">
							<tr>
								<td>${bean.empId}</td>
								<td>${bean.empName}</td>
								<td>${bean.empSalary}</td>
							</tr>
						</c:forEach>
					</table>
				</c:when>
				<c:when test="${bean != null}">
					<div class='alert alert-success mb-3' role='alert'>
						<i class='bi bi-check-circle'></i> Record Found Successfully
					</div>
					<table class='table'>
						<tr class='table-primary'>
							<th>Employee Id</th>
							<th>Employee Name</th>
							<th>Employee Salary</th>
						</tr>
						<tr>
							<td>${bean.empId}</td>
							<td>${bean.empName}</td>
							<td>${bean.empSalary}</td>
						</tr>
					</table>
				</c:when>
				<c:otherwise>
					<div class='alert alert-danger' role='alert'>
						<i class='bi bi-exclamation-circle-fill'></i> Search not found
					</div>
				</c:otherwise>
			</c:choose>
		</c:if>
		<a href="back"><button type="button" class="btn btn-success mt-3"
				id="butt">
				<i class="bi bi-arrow-left"></i> Back
			</button></a>
	</div>
</body>
</html>