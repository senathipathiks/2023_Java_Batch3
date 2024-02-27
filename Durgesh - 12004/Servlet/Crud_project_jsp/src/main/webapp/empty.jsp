<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>

<%
String action = request.getParameter("action");

if(action.equals("Insert"))
{
%>

<%@include file="insert.jsp" %>

<%="(<br><h1><font color=darkyellow> <center> All Fields should be entered </center> </font></h1>)" %>

<% 
}
else if(action.equals("Update"))
{ 
%>

<%@include file="update.jsp" %>

<%= "(<br><h1><font color=darkyellow> <center> All Fields should be entered </center> </font></h1>)" %>

<% 
}
else if(action.equals("Search"))
{ 
%>

<%@include file="search.jsp" %>

<%= "(<br><h1><font color=darkyellow> <center> All Fields should be entered </center> </font></h1>)" %>

<% 
}
else if(action.equals("Delete"))
{ 
%>

<%@include file="delete.jsp" %>

<%= "(<br><h1><font color=darkyellow> <center> All Fields should be entered </center> </font></h1>)" %>

<%
}
%>	

</body>
</html>