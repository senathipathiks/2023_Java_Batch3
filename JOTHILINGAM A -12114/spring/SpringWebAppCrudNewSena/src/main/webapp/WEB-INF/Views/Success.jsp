<%@page import="org.springframework.context.annotation.Bean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.spring.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<style>
.record{
color: green;
}
.box{
margin-left: 350px;
}
</style>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>
<%
	String action =(String) request.getAttribute("action");
	if(action.equals("Insertion")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\" record\"><center><h4>Record Inserted Successfully</h4><center></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Deleteded Successfully</h4><center></div>"%>
		<%
	}else if(action.equals("Update")){
		System.out.println(action);
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"record \"><center><h4>Record Updateded Successfully</h4><center></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Student stud = (Student) request.getAttribute("bean");
		%>
		<%="<center><br><div class=\"card card-body w-50 table table-info\"><table><tr style=\"font-weight:bold #77a874\"><td>Student ID</td><td>Student Name</td><td>Student Age</td><tr></center>" %>
		<%="<tr><td>"+stud.getSid()+"</td><td>"+stud.getSname()+"</td><td>"+stud.getScity() +"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("View")){
		%>
		<%@include file="Search.jsp" %>
		<%
		ArrayList<Student> list = (ArrayList<Student>)request.getSession().getAttribute("list");
		%>
		<%="<center><br><div class=\"card card-body w-50 table \"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table class=\"bg-light \" ><tr style=\"font-weight:bold row\"><td>Student ID</td><td>Student Name</td><td>Student Age</td><tr></center>" %>
		<%
		for(Student stud : list){
			%>
			<%="<tr class=\" table table-light \" ><td>"+stud.getSid()+"</td><td>"+stud.getSname()+"</td><td>"+stud.getScity()+"</td></tr>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
		
</body>
</html>