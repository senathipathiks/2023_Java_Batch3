<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
body{
	display:flex;
	justify-content:center;
	align-items: center;
}
#container {
	background-color: #ccc;
	margin-left: none;
	padding: 25px 50px;
	margin-top: 10px;
}

table {
	border: 30px solid transparent;
	align-items: center;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	border-radius: 20px;
}

#box {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	padding: 20px;
}

.button {
	padding: 10px 10px;
	font-weight: bold;
	justify-content: center;
	border-radius: 10px;
	width: 200px;
	border-radius: 5px;
	outline: none;
	background-color: #023095;
	display: inline-block;
	padding-left: 30px;
	align-items: center;
	color: white;
	cursor: pointer;
	border: none;
	box-shadow: 0 2px 10px rgba(0, 0, 0, 2);
}

td {
	padding: 10px;
	outline: none;
	margin: 10px;
}

#fetch {
	text-align: center;
	width: 80px;
	background-color:#023095;
	color:white;
	padding:7px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

select {
	width:100px;
	padding:10px;
}
</style>
</head>
<body>
	
		<table id="container" width="50%" border="0">
			<tr>
				<td>Employee Id</td>
				<td>
					<form action="fetch" method="post" modelAttribute="bean">
						<select name="empid">
							<%
							ArrayList<Integer> idList = (ArrayList<Integer>) request.getAttribute("key");
							for (Integer i : idList) {
								out.println("<option value='" + i + "'>" + i + "</option>");
							}
							%>
						</select>
						<input id="fetch" type="submit" value="Fetch" name="button" />
					</form>
				</td>
			</tr>
		<form action="updateemployee" method="post" modelAttribute="bean">
			<% Employee emp=(Employee)request.getAttribute("bean");
				if(emp!=null){
			%>
	<tr><td>Employee Id</td>
				<td><input id="box" type="text" name="eid" value="<%=emp.getEmpid()%>"readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><input id="box" type="text" name="ename" value="<%=emp.getEmpName()%>" /></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input id="box" type="text" name="esalary" value="<%=emp.getEmpSalary()%>" /></td>
			</tr>
			<tr>
				<td colspan="2" align="left"><input class="button"
					type="submit" value="Update Employee" name="emsAction" /></td>
			</tr>
			<% }
				else{%>
				<tr>
				<td>Employee Name</td>
				<td><input id="box" type="text" name="empName" /></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input id="box" type="text" name="empSalary" /></td>
			</tr>
			<tr>
				<td colspan="2" align="left"><input class="button"
					type="submit" value="Update Employee" name="button" /></td>
			</tr>
			<%} %>
			
		</table>
	</form>

	<br>
	<%
	String result = (String) request.getAttribute("msg");
	if (result != null) {
		out.println("<font color=black><b>" + result + "</b></font>");
	}
	%>

</body>
</html>