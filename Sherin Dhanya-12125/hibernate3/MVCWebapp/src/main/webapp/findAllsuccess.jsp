<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.course.bean.Course" %>
    <%@page import="java.util.LinkedList" %>
    <%@include file="find.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<style>
.table{
margin:-570px;
padding:0;
padding-top: 500px;
padding-left: 500px;
border-color: black;
}
</style>
</head>
<body>
<div class="table">
<% 

LinkedList<Student> cor=(LinkedList<Student>)request.getAttribute("bean");
out.write("<font size =5px color=white><table align=bottom border=1 >"
		+"<tr>"
		+"<th> Student ID </th>"
		+"<th> Student Name </th>"
		+"<th> Department </th>"
		+"<th> Place </th>"
		+"</tr>");
		for (Student e:cor)
		out.print(
		"<tr>"
		+"<td>"+e.getStudentId()+" </td>"
	    +"<td>"+e.getStudentName()+" </td>"
	    +"<td>"+e.getDepartment()+" </td>"
	    +"<td>"+e.getplace()+" </td>"
	    +"</tr>");
	    out.print("</table></font>");
	    
	    %>		
</div>
</body>
</html>