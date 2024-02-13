<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- This is the comment tag --%>

<%--Declaration tag --%>
<%! String name="Varshinee"; %> 

<%--Scripting tag --%>
<%
String name="Appu";  
out.print("<h1> Welcome "+ name +"</h1>");%>

<%--Expression --%>
<%= "<h1> Welcome" + name + "</h1>" %>
</body>
</html>