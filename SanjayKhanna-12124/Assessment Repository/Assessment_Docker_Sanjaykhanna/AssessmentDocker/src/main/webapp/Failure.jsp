<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure Page</title>
</head>
<body>
<%
	String action = request.getParameter("action");

	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<div class=\"card card-body w-50 text-center mt-2\"><h4>Insertion Failure</h4></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center \"><h4>Deletion Failure</h4></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<div class=\"card card-body w-50 text-center mt-2\"><h4>Updation Failure</h4></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%="<br><div class=\"card card-body w-75 text-center\" ><h4>No Record Found</h4></div>" %>
		<%	
	}else if(action.equals("DeleteAll")){
		%>
		<%@include file="DeleteAll.jsp" %>
		<%="<br><div class=\"card card-body w-50 text-center\"><h4>Password Incorrect or Deletion Failure</h4></div>" %>
			<%
		}
			
		%>

</body>
</html>