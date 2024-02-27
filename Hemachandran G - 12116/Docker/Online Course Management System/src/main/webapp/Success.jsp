<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.cms.bean.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>
<%
	String action = request.getParameter("action");
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4 style=text-align:center;>Record Inserted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4 style=text-align:center;>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4 style=text-align:center;>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Course oc = (Course)request.getSession().getAttribute("bean");
		%>
		<%="<br><div class=\"card card-body w-105\"><h4>Here is the Record : </h4>" %>
		<%="<br><table><tr style=text-align:center\"font-weight:bold\"><td>Course ID</td><td>Course Name</td><td>Course Type</td><td>Course Duration</td><td>Course Fee</td> " %>
		<%="<tr><td>"+oc.getCourseID()+"</td><td>"+oc.getCourseName()+"</td><td>"+oc.getCourseType()+"</td><td>"+oc.getCourseDuration()+"</td><td>"+oc.getCourseFee()+"</td> </tr></table></div>" %>
		<%	
	}else if(action.equals("View")){
		%>
		<%@include file="Search.jsp" %>
		<%
		ArrayList<Course> list = (ArrayList<Course>)request.getSession().getAttribute("list");
		%>
		<%="<br><div class=\"card card-body w-105\"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=text-align:center\"font-weight:bold\"><td>Course ID</td><td>Course Name</td><td>Course Type</td><td>Course Duration</td><td>Course Fee</td> " %>
		<%
		for(Course oc : list){
			%>
			<%="<tr><td>"+oc.getCourseID()+"</td><td>"+oc.getCourseName()+"</td><td>"+oc.getCourseType()+"</td><td>"+oc.getCourseDuration()+"</td><td>"+oc.getCourseFee()+"</td> </tr></div>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
		
</body>
</html>