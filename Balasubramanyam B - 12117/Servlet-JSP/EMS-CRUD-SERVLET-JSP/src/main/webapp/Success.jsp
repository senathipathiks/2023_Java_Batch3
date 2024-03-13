<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.ems.bean.Employee"%>
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
		<%="<br><div class=\"card card-body w-50\"><h4>Record Inserted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Record Deleted Successfully</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"card card-body w-50\"><h4>Record Updated Successfully</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%
		Employee emp = (Employee)request.getSession().getAttribute("bean");
		%>
		<%="<br><div class=\"card card-body w-50\"><table><tr style=\"font-weight:bold\"><td>Employee ID</td><td>Employee Name</td><td>Employee Age</td><tr>" %>
		<%="<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"</td><td>"+emp.getAge()+"</td></tr></table></div>" %>
		<%	
	}else if(action.equals("View")){
		%>
		<%@include file="Search.jsp" %>
		<%
		ArrayList<Employee> list = (ArrayList<Employee>)request.getSession().getAttribute("list");
		%>
		<%="<br><div class=\"card text-center card-body w-50 \"><h4>No Of Record : "+list.size()+"</h4>" %>
		<%="<br><table><tr style=\"font-weight:bold\"><td>ID</td><td>Name</td><td>Age</td><tr>" %>
		<%
		for(Employee emp : list){
			%>
			<%="<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"</td><td>"+emp.getAge()+"  </td></tr>" %>
			<%} %>
			<%="</table></div>" %>
			<%
		}
			
		%>
		
</body>
</html>