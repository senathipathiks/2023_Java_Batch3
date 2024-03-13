<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
<title>Insert title here</title>
<style type="text/css">
td {
	height: 40px;
}

select, input {
	height: 40px;
	width: 300px;
	border-radius: 20px;
}

body {
	background-color: teal;
}

.button {
	border: none;
	background-color: maroon;
	color: white;
	font-weight: bold;
}

h2 {
	color: black;
}

#card {
	align-content: center;
	justify-content: center;
	padding: 20px;
	margin-top: 50px;
	margin-left: 350px;
	background-color: gray;
}

#btn {
	width: 100px;
}
</style>
</head>
<body>
	<div class="card w-50" id="card">
		<div class="card-body">


			<h2 align="center">Find Employee Details</h2>
			<br>
			<table widht="80%" align="center" border="0">
				<tr>
					<td>Employee Id</td>
					<td>
						<form action="PerformFind">
							<select type="text" name="eid" required="required">
								<option value="-1">Select Employee Id</option>
								<%
								List<Integer> idList = (List<Integer>) request.getAttribute("IdList");
								for (Integer i : idList) {
									out.println("<option value='" + i + "'>" + i + "</option>");
								}
								%>
							</select> <input type="submit" value="Search" id="btn" />
						</form>

					</td>
				</tr>

				<tr>
					<td>Employee Id :</td>
					<td>${emp.eid}</td>
				</tr>
				<tr>
					<td>Employee Name :</td>
					<td>${emp.ename}</td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td>${emp.salary}</td>
				</tr>
				<br>

			</table>

		</div>
	</div>


	<br>
	<%
	String result = (String) request.getAttribute("msg");
	if (result != null) {
		out.println("<center><font color=black><b>" + result + "</b></font></center>");
	}
	%>

</body>
</html>