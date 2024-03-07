<%@page import="java.util.List"%>
<%@page import="com.ems.bean.Employee"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{

background-color: #383b4f;
margin-top: 150px;
color:white;
font-size: 20px;
}

input{
border-radius:50px;
height:40px;
weight:110%;
background-color: #a4aaba;
border: none;
color:black;
}
.tbl{
color:black;
}
</style>
<body>

	<%
	List<Employee> empList = (List<Employee>) request.getAttribute("EmpList");
	out.println("<table width='80%' align='center'>");
	out.println("<tr><th>E-Id</th><th>E-Name</th><th>E-Salary</th><th>Edit</th><th>Remove</th>");

	for (Employee e : empList) {
		out.println("<form action='EMSController' method='post'>");
		out.println("<tr>");
		out.println("<td><input type='text' value='" + e.getEid() + "' name='eid' readonly='readonly'</td>");
		out.println("<td><input type='text' value='" + e.getEname() + "'name='ename'</td>");
		out.println("<td><input type='text' value='" + e.getEsalary() + "'name='esalary'</td>");
		out.println("<td><input type='submit' value='Edit/Save' class='btb' name='emsAction'></td>");
		out.println("<td><input type='submit' value='Remove' class='btb' name='emsAction'></td>");
		out.println("</tr>");
		out.println("</form>");
	}
	out.println("</table>");
	%>
	
	<br>
	<br>
	<br>
	<br>

	<form action="EMSController" method="post">
		<table class="tbl" border="0" align="center" width="40%">
			<tr>
				<td><input type="text" name="eid" placeholder="Employee ID"></td>
		
				<td><input type="text" name="ename" placeholder="Employee Name"></td>
		
				<td><input type="text" name="esalary"
					placeholder="Employee Salary"></td>
			
			
				<td align="center"><input type="submit" value="Insert"
					name="emsAction" id="button"></td>
			</tr>
		</table>
	</form>

	<%
	String result = request.getParameter("msg");
	if (result != null) {
		out.print("<center><font color=green><b>" + result + "</b></font></center>");
	}
	%>
</body>
</html>