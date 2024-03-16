<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
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
	margin-top: 30px;
}

#form {
	border-radius: 5px;
	background-color: rgba(255, 255, 255);
	padding: 20px;
	width: 600px;
	height: auto;
}

#newbutt {
	width: 150px;
	margin-left: 220px;
	border-radius: 5px;
}

#butt {
	width: 150px;
}
</style>
</head>
<body>
	<div id="form" class="row g-3">
		<form action="fetch" method="post">
			<div
				class="text-center shadow p-3 bg-body rounded h3 text-primary mb-3">Enter
				Employee details to Update</div>
			<div class="input-group input-group-lg">
				<span class="input-group-text col-5">Select Employee Id</span> <select
					class="form-select col-4" name="empId">
					<option selected value="-1">Choose</option>
					<c:forEach items="${idList}" var="id">
						<option value='${id}'>${id}</option>
					</c:forEach>
				</select>
				<button type="submit" class="btn btn-success col-3" name="button">
					<i class="bi bi-download"></i> Fetch
				</button>
			</div>
		</form>
		<form action="UpdateEmployee" method="post" class="row g-3">
		<c:if test="${bean != null }">
			<div class="input-group input-group-lg">
				<span class="input-group-text col-5">Enter Employee Id</span>
				<div class="form-floating">
					<input type="text" class="form-control col-7 bg-secondary" name="empId"
						placeholder="EmployeeId" autocomplete="off" readonly="readonly"
						value="${bean.empId}"> <label for="empId">Employee Id</label>
				</div>
			</div>
			<div class="input-group input-group-lg ">
				<span class="input-group-text col-5">Enter Employee Name</span>
				<div class="form-floating">
					<input type="text" class="form-control col-7" name="empName"
						placeholder="EmployeeName" autocomplete="off" required="required"
						value="${bean.empName}">
					<label for="empName">Employee Name</label>
				</div>
			</div>
			<div class="input-group input-group-lg">
				<span class="input-group-text col-5">Enter Salary</span>
				<div class="form-floating">
					<input type="text" class="form-control col-7" name="empSalary" 
						placeholder="Salary" autocomplete="off" required="required"
						value="${bean.empSalary}">
					<label for="empSalary">Employee Salary</label>
				</div>
			</div>
			<div class="input-group">
				<a href="back"><button type="button" class="btn btn-success"
						id="butt">
						<i class="bi bi-arrow-left"></i> Back
					</button></a>
				<button type="submit" class="btn btn-success" name="button"
					id="newbutt">
					<i class="bi bi-arrow-repeat"></i> Update
				</button>
			</div>
			</c:if>
		</form>
		<c:if test="${msg != null}">
				<c:choose>
					<c:when test="${msg =='success'}">
						<div class='alert alert-success' role='alert'>
							<i class='bi bi-check-circle'></i>
							<c:out value="Record Updated Successfully"></c:out>
						</div>
					</c:when>
					<c:otherwise>
						<div class='alert alert-success' role='alert'>
							<i class='bi bi-check-circle'></i>
							<c:out value="Updation Failure"></c:out>
						</div>
					</c:otherwise>
				</c:choose>
			</c:if>
	</div>
</body>
</html>