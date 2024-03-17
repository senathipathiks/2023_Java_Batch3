
<%-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<style type="text/css">
td {
	height: 40px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 20px
}
/* .button{
 
border:none;
background-color: green;
color:white;
font-weight:bold
} */
</style>
</head>
<body>
	<div class="form-group">
		<form action="FetchEmployee" method="post">
			<div class="form-group">
				<table width="30%" align="center" border="0">
					<tr>
						<td>Employee Id:</td>
						<td><select type="text" name="empId" required="required"
							pattern={.4} /> <c:forEach var="empId" items="${IdList}">
								<option value="${empId}">${empId}</option>
							</c:forEach></select></td>
					</tr>
					<tr>
						<td align="center"><input class="btn btn-primary"
							type="submit" value="FetchEmployee" name="emsAction"
							required="required" /></td>
					</tr>

				</table>
		</form>
	</div>
	<br>
	<form action="PerformUpdate">
		<div class="form-group">
			<table width="70%" align="center">
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="empId" readonly="readonly"
						value="${emp.empId}"/></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="empName" value="${emp.empName}"/></td>
				</tr>
				<tr>
					<td>Employee Salary</td>
					<td><input type="text" name="empSalary"
						value="${emp.empSalary}"/></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update" /></td>
				</tr>
			</table>
		</div>
	</form>
	<center>
		<b>${msg}</b>
	</center>
</body>
</html>