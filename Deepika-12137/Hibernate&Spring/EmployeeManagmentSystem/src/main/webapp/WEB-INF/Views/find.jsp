<%@page import="java.util.ArrayList"%>
<%@page import="com.ems.bean.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
select {
	width: 250%;
	height: 35px;
	border-radius: 50px;
}

table {
	margin-top: 150px;
}

td {
	padding-top: 30px;
	color: white;
	font-weight: bold;
	font-size: 20px;
	margin-left: 15px;
}

body {
	background-color: #383b4f;
	margin-top: 150px;
}

input {
	width: 80%;
	height: 30px;
	padding: 5px;
	margin-left: 60px;
	background-color: #a4aaba;
	border-radius: 50px;
	padding: 15px;
	padding: 5px;
	border: none;
	border-radius: 20px;
}
</style>


</head>
<body>

<table border="0" align="center">
		<tr>
			<td>Employee ID</td>

			<td>
				<form action="findemployee" method="post" modelAttribute="bean">
					<select name="empId">
						<%
						ArrayList<Integer> idList = (ArrayList<Integer>) request.getAttribute("IdList");
										for (Integer i : idList) {
											out.print("<option value='" + i + "'>" + i + "</option>");
										}
						%>
					</select>
			</td>
			<td><input type="submit" value="Fetch" name="button"></td>
			</form>

		</tr>
	</table>
	
	<br>
	
	<%
		Course emp = (Course) request.getAttribute("bean");
			if (emp != null) {
		%>
	
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
		</tr>
		<tr>
			<td><%=emp.getEmpId()%></td>
			<td><%=emp.getEmpName()%></td>
			<td><%=emp.getEmpSalary()%></td>
		</tr>
	</table>
	
	<%
	} else {
	String msg = (String) request.getAttribute("msg");
	if (msg != null) {
		out.print("<h1>" + msg + "</h1>");
	}
	}
	%>
	

</body>
</html>