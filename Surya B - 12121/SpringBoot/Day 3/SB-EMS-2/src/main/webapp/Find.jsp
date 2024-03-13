<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*"%>
<%@ page import="com.ems.bean.Employee"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>


<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<style>
body {
	display: flex;
	justify-content: center;
	flex-direction: column;
	align-items: center;
}

.tabular {
	width: 320px;
	margin-top: 40px;
	border-radius: 10px;
}

.container {
	background-color: black;
	width: 400px;
	height: 100px;
	display: flex;
	color: white;
	justify-content: center;
	align-items: center;
	gap: 20px;
	font-family: verdana;
	font-size: 14px;
	border-radius: 15px;
	margin-top: 5%;
	padding: 10px;
	box-shadow: 0px 1px 1px rgba(3, 7, 18, 0.02), 0px 5px 4px
		rgba(3, 7, 18, 0.03), 0px 12px 9px rgba(3, 7, 18, 0.05), 0px 20px 15px
		rgba(3, 7, 18, 0.06), 0px 32px 24px rgba(3, 7, 18, 0.08);
}

#submit-btn {
	margin-top: 10px;
	background-color: red;
	color: white;
	border-style: none;
	width: 80px;
	height: 30px;
	border-radius: 10px;
	font-weight: 600;
}

#submit-btn:hover {
	cursor: pointer;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">


		<form action="PerformFind">
			<table>
				<tr>
					<td>Employee ID
					<td>
					<td><select name="eid" required="required">

							<c:forEach var="id" items="${list}">
								<option value="${id}">${id}</option>
							</c:forEach>
					</select></td>
				</tr>



				</tr>
				<tr>
					<td><input type="submit" id="submit-btn" value="Find"
						name="btn" /></td>
				</tr>
			</table>
		</form>
		</tr>

		</table>

		<form action="PerformFindByName">
			<table>
				<tr>
					<td>Employee Name
					</td>
					<td><select name="ename" required="required">

							<c:forEach var="name" items="${slist}">
								<option value="${name}">${name}</option>
							</c:forEach>
					</select></td>
				</tr>



				
				<tr>
					<td><input type="submit" id="submit-btn" value="Find"
						name="btn" /></td>
				</tr>
			</table>
		</form>
		

	</div>



	<div class="tabular">
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Employee ID</th>
					<th scope="col">Employee Name</th>
					<th scope="col">Employee Salary</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${msg.equals('name')}">

					<c:forEach var="emp" items="${emp}">
						<tr>

							<td>${emp.eid}</td>
							<td>${emp.ename}</td>
							<td>${emp.esalary}</td>

						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${msg.equals('id')}">
					<tr>

						<td>${emp.eid}</td>
						<td>${emp.ename}</td>
						<td>${emp.esalary}</td>

					</tr>
				</c:if>
			</tbody>
		</table>

	</div>
</body>
</html>