<%@page import="com.employeeapp.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find all</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="container mt-5 m-3 d-flex justify-content-center align-item-center">
		<div
			class="container d-flex  justify-content-center align-item-center">
			<form id="form-1" action="EMSController" method="post"
				class="border shadow p-3 rounded">
				<h2>Fetch All Operation</h2>
				<table>
					<tr>
						<th>Emlpoyee ID</th>
						<th>Emlpoyee Name</th>
						<th>Emlpoyee Salary</th>
						<th>Operation1</th>
						<th>Operation2</th>
					</tr>
					<%
					ArrayList<Employee> ls = (ArrayList<Employee>) request.getAttribute("ls");

					if (ls != null) {
						for (Employee e : ls) {
					%>
					<tr>
						<td><input type="number" readonly="readonly" name="eid"
							class="form-control" value="<%=e.getEid()%>" /></td>
						<td><input type="text" name="name" class="form-control"
							value="<%=e.getName()%>"></td>
						<td><input type="text" name="salary" class="form-control"
							value="<%=e.getSalary()%>"></td>
						<td><input type="submit" class="btn btn-warning"
							name="emsAction" value="UpdateEmp"></td>
						<td><input type="submit" class="btn btn-danger"
							name="emsAction" value="DeleteEmp"></td>
					</tr>
					<%
					}
					}
					%>
					</form>
				</table>
		</div>
		</div>
		<!-- Insert form -->
		<div class="container-fluid   d-flex justify-content-center align-item-center mt-5">
		<form id="form-1" action="EMSController" method="post" class="border shadow rounded p-3">
			<h1 class="ms-4">Insert Employee</h1>
			<table id="table-1" class="">

				<tr>
					<td>Enter Employee ID</td>
					<td><input class="form-control" name="eid" type="number"></td>
				</tr>
				<tr>
					<td>Enter Employee Name</td>
					<td><input class="form-control" name="name" type="text"></td>
				</tr>

				<tr>
					<td>Enter Employee salary</td>

					<td><input class="form-control" name="salary" type="text"></td>
				</tr>
				<tr>
					<td></td>
				</tr>
				

				<tr>
					<td colspan="2" class="text-center"><input class="btn btn-success"
						type="submit" name="emsAction" value="InsertEmployee1" /></td>
				</tr>

			</table>
			<%
			String result = (String) request.getAttribute("result");

			if (result == "Success") {
				out.print("<h3 class=\"text-success\">Insertion " + result + "</h3>");
			} else if (result == "Failure") {
				out.print("<h3 class=\"text-failure\">Insertion " + result + "</h3>");
			}
			%>

		</form>
	</div>
	
</body>
</html>