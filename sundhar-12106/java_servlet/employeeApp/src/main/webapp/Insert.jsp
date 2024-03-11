<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
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
						type="submit" name="emsAction" value="InsertEmployee" /></td>
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