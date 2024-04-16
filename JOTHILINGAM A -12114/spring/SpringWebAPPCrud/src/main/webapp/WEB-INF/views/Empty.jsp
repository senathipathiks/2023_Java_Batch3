<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empty Fields</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.record{
color: orange;
}
</head>
<body>
<%
	String action = request.getParameter("action");
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><div class=\"record \"><center><h4>No Field Should be Empty</h4><center></div>"%>
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><div class=\"record \"><center><h4>No Field Should be Empty</h4><center></div>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><div class=\"record \"><center><h4>No Field Should be Empty</h4><center></div>"%>
		<%
	}else if(action.equals("Search")){
		%>
		<%@include file="Search.jsp" %>
		<%="<br><div class=\"record \"><center><h4>No Field Should be Empty</h4><center></div>"%>
		<%	
	}
	%>
</body>
</html>