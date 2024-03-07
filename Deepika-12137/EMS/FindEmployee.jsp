<%@page import="java.util.List"%>
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
    height:35px;
	border-radius:50px;
}

table{
margin-top:150px;
}
td{
padding-top: 30px;
color:white;
font-weight: bold;
font-size: 20px;
margin-left: 15px;
}
body{

background-color: #383b4f;
margin-top: 150px;

}

input{

    width: 80%;
    height:30px;
	padding:5px;
	margin-left:60px;
	background-color: #a4aaba;
	border-radius:50px;
	padding: 15px;
	padding:5px;
	border:none;
	border-radius:20px;
}

</style>

</head>
<body>


	<table border="0" align="center">
		<tr>
			<td>Employee ID</td>

			<td>
				<form action="EMSController" method="post">
					<select name="eid">
						<%
						List<Integer> idList = (List<Integer>) request.getAttribute("IdList");
						for (Integer i : idList) {
							out.print("<option value='" + i + "'>" + i + "</option>");
						}
						%>
					</select>
			</td>
			<td><input type="submit" value="Search" name="emsAction"></td>
			</form>

		</tr>
		
		<tr>
			<td>Employee ID</td>
			<td>${emp.eid}</td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td>${emp.ename}</td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td>${emp.esalary}</td>
		</tr>
		
		</form>
	</table>

	<br>

	<%
	String result = (String)request.getAttribute("msg");
	if (result != null) {
		out.print("<center><font color=green><b>" + result + "</b></font></center>");
	}
	%>

</body>
</html>