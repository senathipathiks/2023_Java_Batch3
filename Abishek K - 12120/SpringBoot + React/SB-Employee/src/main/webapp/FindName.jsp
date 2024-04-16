<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
.card {
	height: 270px;
	width: 720px;
	margin-left: 30%;
	margin-top: 40px;
	padding: 30px;
	margin-bottom: 30px;
}

body {
	background-color: #A7BEAE;
}

#output {
	margin-top: 1px;
}
</style>
</head>
<body id="MB">
	<div class="card">
		<h5 class="card-header bg-primary">Find Operation</h5>
		<div class="card-body ">

			<form action="PerformFindName" method="post">

				<div class="form-floating mb-3">
					<label for="floatingInput">Employee Name</label> <select
						class="form-select" aria-label="Default select example"
						style="height: 30px; width: 100%" name="empName">

						<option selected>--Select Name--</option>
						<c:forEach items="${nameList}" var="name">
							<option>${name}</option>
						</c:forEach>
					</select>
				</div>
				<br>
				<div class="form-floating">
					<input type="submit" value="Find" name="button"
						class="btn btn-primary">

				</div>

			</form>
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>


	<c:if test="${empList!=null}">

		<div class='card card-body' id='output'>
			<h5 class='card-header bg-primary'>Record</h5>
			<table class='table table-dark table-hover'>
				<tr>
					<td>Employee ID</td>
					<td>Employee Name</td>
					<td>Employee Salary</td>
					<td>Employee Department</td>
					<td>Employee Domain</td>
					<td>Employee MobileNo.</td>
					<td>Employee Blood Group</td>
				</tr>
				<c:forEach items="${empList}" var="emp">
					<tr>
						<td>${emp.empId }</td>
						<td>${emp.empName }</td>
						<td>${emp.empSalary }</td>
						<td>${emp.empDeprt }</td>
						<td>${emp.empDomain }</td>
						<td>${emp.empPh }</td>
						<td>${emp.empBlood }</td>

					</tr>
				</c:forEach>
			</table>
		</div>

	</c:if>


	<br>
	<c:if test="${msg!=null}">
		<div class="card-body bg-success" id="noti">
			<h3>
				<font color=white>${msg}</font>
			</h3>
		</div>
	</c:if>
</body>
</html>