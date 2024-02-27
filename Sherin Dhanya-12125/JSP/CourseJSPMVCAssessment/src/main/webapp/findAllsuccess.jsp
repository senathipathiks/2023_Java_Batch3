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

LinkedList<Course> cor=(LinkedList<Course>)request.getAttribute("bean");
out.write("<font size =5px color=white><table align=bottom border=1 >"
		+"<tr>"
		+"<th> Course ID </th>"
		+"<th> Course Name </th>"
		+"<th> Course Type </th>"
		+"<th> Course Duration </th>"
		+"<th> Course Fee</th>"
		+"</tr>");
		for (Course e:cor)
		out.print(
		"<tr>"
		+"<td>"+e.getCourseID()+" </td>"
	    +"<td>"+e.getCourseName()+" </td>"
	    +"<td>"+e.getCourseType()+" </td>"
	    +"<td>"+e.getCourseDuration()+" </td>"
	    +"<td>"+e.getCourseFee()+" </td>"
	    +"</tr>");
	    out.print("</table></font>");
	    
	    %>		
</div>
</body>
</html>