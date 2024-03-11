<%@page import="java.util.ArrayList"%>
<%@page import="com.ems.bean.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee salary</th>
			<th>Action</th>
		</tr>

		<%
		ArrayList<Course> list = (ArrayList<Course>) request.getAttribute("IdList");
			//Employee emp1 =(Employee)request.getAttribute("bean");
			for(Course emp : list){
		%> <form action="EditFind" modelAttribute="bean" ><% 
			out.print("<form>");
			out.print("<tr>");
			out.print("<td><input type=\"text\" name=\"empId\" value=\"" +emp.getEmpId()+ "\" readonly> </td>");
			out.print("<td><input type=\"text\" name=\"empName\" value=\"" +emp.getEmpName()+ "\" > </td>");
			out.print("<td><input type=\"text\" name=\"empSalary\" value=\"" +emp.getEmpSalary()+ "\" > </td>");
			out.print("<td><input type=\"submit\" name=\"edit\" value=\"edit\" ><input type=\"submit\" name=\"delete\" value=\"delete\" > </td>");
			out.print("<tr> </form>");
			
			} 

			%>
</form>
	</table>
</body>
</html>