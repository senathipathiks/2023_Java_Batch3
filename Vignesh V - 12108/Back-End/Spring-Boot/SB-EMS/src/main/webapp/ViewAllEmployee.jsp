<%@page import="com.ems.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

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
	<c:if test="${EmpList!=null}">
		<h5 class='card-header bg-primary'>Record</h5>
		<table class='table table-dark table-hover'>
			<tr>
				<td>Employee ID</td>
				<td>Employee Name</td>
				<td>Employee Salary</td>
			</tr>
			<c:forEach items="${EmpList}" var="emp">
				<form action="EditOrDelete">



					<tr>
						<td><input type="text" value="${emp.empId}" name="empId"
							readonly="readonly" /></td>
						<td><input type="text" value="${emp.empName}" name="empName" /></td>
						<td><input type="text" value="${emp.empSalary}"
							name="empSalary" /></td>
						<td><input type="submit" value="Edit/Save" name="emsBtn"
							Class="btn btn -green" /></td>
						<td><input type="submit" value="Delete" name="empBtn"
							Class="btn btn -danger" /></td>



					</tr>
				</form>
			</c:forEach>
		</table>
		</div>

	</c:if>


	<br>
</body>
</html>
