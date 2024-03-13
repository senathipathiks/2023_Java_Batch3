<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.spring.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>Success page</title>
</head>
<body>

<%
	String action = request.getAttribute("res").toString();
   
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\"card bg-success card-body text-center\"><h4>Record Inserted Successfully</h4></div>"%>
		
		<%
		
	}
	 else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card  bg-success card-body text-center\"><h4>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card bg-success card-body text-center\"><h4>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Find")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Student s = (Student)request.getAttribute("bean");
		%>
		<%="<br><div class=\"card  card-body text-center\"><table><tr style=\" background-color:rgb(143, 188, 143);font-weight:bold\"><td>Employee ID</td><td>Employee Name</td><td>Employee City</td><tr>" %>
		<%="<tr><td>"+s.getId()+"</td><td>"+s.getName()+"</td><td>"+s.getCity()+"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("FindAll")){
		%>
		<%@include file="SearchAll.jsp" %>
		<%
		ArrayList<Student> list = (ArrayList<Student>)request.getAttribute("beanlist");
		%>
		<%="<br><div class=\"card   text-center card-body \"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=\" background-color:rgb(255, 222, 173); font-weight:bold\"><td>ID</td><td>Name</td><td>City</td><tr>" %>
		<%
		for(Student sms : list){
			%>
			<%="<tr><td>"+sms.getId()+"</td><td>"+sms.getName()+"</td><td>"+sms.getCity()+"  </td></tr>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}	
		%>
		
</body>
</html>