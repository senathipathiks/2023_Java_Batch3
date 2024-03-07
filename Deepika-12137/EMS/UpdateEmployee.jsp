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
	width: 70%;
    height:35px;
	border-radius:50px;
}

body{
background-color: #383b4f;
margin-top: 150px;
}

table{
padding: 20px;
}
		
td{
color:white;
}

input{

width: 70%;
    height:25px;
	padding:5px;
	margin-right:70px;
	background-color: #a4aaba;
	border-radius:50px;
padding-bottom: 5px;
border:none;
border-radius:20px;
}
.submit{
width:160px;
padding: 20px;
border:none;
boder-radius:100px;
margin-top: 15px;
font-weight: bold;

}

.submit:hover{
background-color:#dff9ba;
color: black;
}

.fetch-btn{
margin-right:25px;
padding: 15px;
padding-top: 5px;
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
			<td><input class="fetch-btn" type="submit" value="Fetch" name="emsAction"></td>
			</form>

		</tr>
		<form action="EMSController" method="post">
		<tr>
			<td>Employee ID</td>
			<td><input type="text" name="eid" value="${emp.eid}"
				readonly="readonly"></td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td><input type="text" name="ename" value="${emp.ename}"></td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td><input type="text" name="esalary" value="${emp.esalary}"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input class="submit" type="submit" value="UpdateEmployee" name="emsAction"></td>
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