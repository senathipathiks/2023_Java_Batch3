
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
Course cor=(Course)request.getAttribute("bean");
out.write("<font size =5px color=white><table align=center border=2>"
		+"<tr>"
		+"<th> Course ID </th>"
		+"<th> Course Name </th>"
		+"<th> Course Type </th>"
		+"<th> Course Duration </th>"
		+"<th> Course Fee </th>"
		+"</tr>"
		+"<tr>"
		+"<td>"+cor.getCourseID()+"</td>"
		+"<td>"+cor.getCourseName()+"</td>"
		+"<td>"+cor.getCourseType()+"</td>"
		+"<td>"+cor.getCourseDuration()+"</td>"
		+"<td>"+cor.getCourseFee()+"</td>"
		+"</tr>"
		+"</font>");
%>
</div>
</table>
</body>
</html>