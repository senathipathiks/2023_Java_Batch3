<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.Ems.bean.Employee" %>
    <%@ include file="view.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
 <%
 Employee Emp=(Employee)request.getAttribute("bean");
out.write("<font size =5px color=purple><table align=center border=2px>"
        				+"<tr>"
        				+"<th> Emp ID </th>"
        				+"<th> Emp Name </th>"
        				+"<th> Emp City </th>"
        				+"<th> Emp deptid </th>"
        				+"<th> Emp deptname </th>"
        				+"<th> Emp phoneno </th>"
        				+"</tr>"
        				+"<tr>"
        				+"<td>"+Emp.getId()+"</td>"
        				+"<td>"+Emp.getName()+"</td>"
        				+"<td>"+Emp.getCity()+"</td>"
        				+"<td>"+Emp.getDeptid()+"</td>"
        				+"<td>"+Emp.getDeptname()+"</td>"
        				+"<td>"+Emp.getPhno()+"</td>"
        				
        				+"</tr>"
       				+"</font>");
 %> 
</body>
</html>