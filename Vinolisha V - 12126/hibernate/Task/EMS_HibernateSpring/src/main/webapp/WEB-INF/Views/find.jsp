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
#container {
	background-color: #ccc;
	margin-left: none;
	padding: 25px 50px;
	margin-top: 10px;
	width:500px;
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


td {
	padding: 10px;
	outline: none;
	margin: 10px;
}

#search {
	text-align: center;
	width: 100px;
	background-color: #023095;
	color: white;
	padding: 7px;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

select {
	width: 100px;
	padding: 10px;
}
#result{
	background-color: black;
}
#new{
   	width: 600px;
    background-color:#023095;
   	color: white;
    padding: 10px 20px 30px;
    margin-top:10px;
    
}
</style>
</head>
<body>
	<form action="findemployee" method="post" modelAttribute="bean">
		<table id="container" width="80%" align="center" border="0">
			<tr>
				<td>Employee Id</td>
				<td>
					<form action="EMSController" method="post">
						<select name="empid">
							<%
							ArrayList<Integer> idList = (ArrayList<Integer>) request.getAttribute("key");
							for (Integer i : idList) {
								out.println("<option value='" + i + "'>" + i + "</option>");
							}
							%>
						</select><input id="search" type="submit" value="Fetch" name="button" />
					</form>
	
				</td>
			</tr>
		</table>
		<% Employee emp=(Employee)request.getAttribute("bean");
			if(emp!=null){
		%>
	<table id="new" align="center">
			<tr>
				<td>Employee Id</td>
				<td><%= emp.getEmpid()%></td>
			</tr>
			<tr>
				<td>Employee Name</td>
				<td><%= emp.getEmpName()%></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><%= emp.getEmpSalary()%></td>
			</tr>
		</table>
		<%}
			else{
			String result = request.getParameter("msg");
			if (result != null) {
				out.println("<font color=black><b>" + result + "</b></font>");
			}
			}
			%>
</body>
</html>