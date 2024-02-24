<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
#noti{
align-items:center;
width:50%;
height:60px;
margin-left:30%;
margin-bottom:40px;
}
</style>
</head>
<body>
<%
String action = request.getParameter("action");

if(action.equals("Insert")){
	
%>
<%@ include file="Insert.jsp" %>
<% 

out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>Insertion Operation is Failure</font></h3></div>");
}
else if(action.equals("Find")){
	
%>
<%@ include file="Find.jsp" %>
<% 
out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>Find Operation is Failure</font></h3></div>");
}
else if(action.equals("FindAll")){
	
%>
<%@ include file="Find.jsp" %>
<% 
out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>FindAll Operation is Failure</font></h3></div>");
}
else if(action.equals("Delete")){
%>
<%@ include file="Delete.jsp" %>	
<%

out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>Delete Operation is Failure</font></h3></div>");
}
else if(action.equals("Update")){
%>
	<%@ include file="Update.jsp" %>	
<%

out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>Update Operation is Failure</font></h3></div>");
}
%>





</body>
</html>