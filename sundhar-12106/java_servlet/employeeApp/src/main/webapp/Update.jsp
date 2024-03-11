<%@page import="com.employeeapp.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="conatiner d-flex justify-content-center align-item-center mt-3">
		<form id="form-1" action="EMSController" method="post"
			class="border rounded p-3 shadow">
			<h1 class="ms-4">Update Employee</h1>
			<table id="table-1" class="">

				<tr>
					<th>Select Employee ID</th>
					<td><select name="eid" class="form-control">
							<option>select</option>
							<%
							ArrayList<Integer> ls = (ArrayList<Integer>) request.getAttribute("ls");
							System.out.println(ls + "front end");
							Employee emp = (Employee) request.getAttribute("employee");

							if (ls != null) {
								for (Integer id : ls) {
							%>
							<option>
								<%=id%>
							</option>

							<%
							}
							}
							%>
					</select></td>
				</tr>


				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-primary" type="submit" name="emsAction"
						value="find" /></td>
				</tr>
				</form>
				<%
				if (emp != null) {
				%>
				<form action="EMSController">
				<tr>
					<td>Enter Employee ID</td>
					<td><input class="form-control" name="eid" type="text"
						value="<%=emp.getEid()%>"></td>
				</tr>

				<tr>
					<td>Enter Employee Name</td>
					<td><input class="form-control" name="name" type="text"
						value="<%=emp.getName()%>"></td>
				</tr>

				<tr>
					<td>Enter Employee salary</td>

					<td><input class="form-control" name="salary" type="text"
						value="<%=emp.getSalary()%>"></td>
				</tr>

				<tr>
					<td colspan="2" class="text-center">
					<input
						class="btn btn-success" type="submit" name="emsAction"
						value="UpdateEmployee" />
						</td>
				</tr>
				<%
				}
				%>

			</table>
			<%
			String result = (String) request.getAttribute("result");

			if (result == "Success") {
				out.print("<h3 class=\"text-success\">Updation " + result + "</h3>");
			} else if (result == "Failure") {
				out.print("<h3 class=\"text-failure\">Updation " + result + "</h3>");
			}
			%>

		</form>
	</div>
</body>
</html>