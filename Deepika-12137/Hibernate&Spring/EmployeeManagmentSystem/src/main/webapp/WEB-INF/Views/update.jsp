<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
<style type="text/css">
body {
	background-image:
		url("https://www.einnosys.com/wp-content/uploads/2023/09/Best-Software-Solutions-for-Education-Industry.png");
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	margin-top: 70px;
}

td {
	height: 40px;
	color: white;
}

b {
	color: white;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 20px;
}

.button {
	border: 2px solid grey;
	background-color: #00008B;
	color: white;
	font-weight: bold;
}

table {
	border: 4px solid white;
	padding: 0px;
}

h1 {
	color: white
}
</style>
</head>
<body>
	<table widht="80%" align="center" border="none">
		<tr>
			<td>Employee Id</td>
			<td>
				<form action="Fetch" method="post" modelAttribute="bean">
					<select name="empId" class="select">
						<%
						ArrayList<Integer> list = (ArrayList<Integer>) request.getAttribute("IdList");
						for (Integer i : list) {
						%>
						<option value="<%=i%>"><%=i%></option>
						<%
						}
						%>
					</select><input type="submit" value="Fetch" name="button" />
				</form>
			</td>
		</tr>
		<form action="updateemployee" method="post" modelAttribute="bean">
			<%
			Employee emp = (Employee) request.getAttribute("bean");
			if (emp != null) {
			%>
			<tr>
				<td>Enter Employee Id</td>
				<td><input type="text" name="empId"
					value="<%=emp.getEmpId()%>" readonly /></td>
			</tr>
			<tr>
				<td>Enter Employee Name</td>
				<td><input type="text" name="empName"
					value="<%=emp.getEmpName()%>" /></td>
			</tr>
			<tr>
				<td>Enter Employee Salary</td>
				<td><input type="text" name="empSalary"
					value="<%=emp.getEmpSalary()%>" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					class="button" value="Update" name="button" /></td>
			</tr>
			<%
			} else {
			%>
			<tr>
				<td>Enter Employee Name</td>
				<td><input type="text" name="empName" /></td>
			</tr>
			<tr>
				<td>Enter Employee Salary</td>
				<td><input type="text" name="empSalary" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit"
					class="button" value="Update" name="button" /></td>
			</tr>
			<%
			}
			%>
		</form>

	</table>
	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null) {
		out.print("<h1>" + msg + "</h1>");
	}
	%>
</body>
</html>