<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String action = request.getParameter("action");
	if(action.equals("Insert")){
		%>
		<%@include file="Insert.jsp" %>
		<%="<br><center><h2>No Field Should be Empty</h2></center>"%>
	
		<%
	}else if(action.equals("Delete")){
		%>
		<%@include file="Delete.jsp" %>
		<%="<br><center><h1>No Field Should be Empty</h1></center>"%>
		<%
	}else if(action.equals("Update")){
		%>
		<%@include file="Update.jsp" %>
		<%="<br><center><h1>No Field Should be Empty</h1></center>"%>
		<%
	}
	else if(action.equals("Search")){
		%>
		<%@include file="Find.jsp" %>
		<%="<br><center><h1>No Field Should be Empty</h1></center>"%>
		<%	
	}
	%>
	
</body>
</html>