<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Ems.bean.Employee" %>
    <%@page import="java.util.LinkedList" %>
    <%@include file="view.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Employee> Emp=(LinkedList<Employee>)request.getAttribute("bean");
out.write("<font size=5px color=purple><table align=center border=1>"
		+"<tr>"
		+"<th> Emp ID </th>"
		+"<th> Emp Name </th>"
		+"<th> Emp City </th>"
		+"<th> Emp deptid </th>"
		+"<th> Emp deptname </th>"
		+"<th> Emp phno </th>"
		+"</tr>");
   for(Employee e :Emp) 
	out.print(    
			"<tr>"
			+"<td>"+e.getId()+"</td>"
			+"<td>"+e.getName()+"</td>"
			+"<td>"+e.getCity()+"</td>"
			+"<td>"+e.getDeptid()+"</td>"
			+"<td>"+e.getDeptname()+"</td>"
			+"<td>"+e.getPhno()+"</td>"
			+"</tr>");
out.print("</table></font>");

%>
</body>
</html>