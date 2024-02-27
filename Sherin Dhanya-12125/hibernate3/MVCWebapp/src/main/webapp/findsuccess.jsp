
<%@page import="com.course.bean.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="find.jsp" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find</title>
<style >
.table{
margin:-570px;
padding:0;
padding-top: 500px;
padding-left: 700px;
border-color: black;
}
</style>
</head>
<body>
<div class="table">
<%
Student cor=(Student)request.getAttribute("bean");
out.write("<font size =5px color=white><table align=center border=2>"
		+"<tr>"
		+"<th> Student ID </th>"
		+"<th> Student Name </th>"
		+"<th> Department</th>"
		+"<th> Place </th>"
		+"</tr>"
		+"<tr>"
		+"<td>"+cor.getStudentID()+"</td>"
		+"<td>"+cor.getStudentName()+"</td>"
		+"<td>"+cor.getDepartment()+"</td>"
		+"<td>"+cor.getPlace()+"</td>"
		+"</tr>"
		+"</font>");
%>
</div>
</table>
</body>
</html>