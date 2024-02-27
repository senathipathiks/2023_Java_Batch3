<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
    <%@include file="Login.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
<%
 // creating an instance 
Date date = new Date();
out.print(date.getDate());

%>
</h1>
<br>

<%
out.print(date.getMonth());
%>
<br>

<%
out.print(new Date().getDate());
%>


</body>
</html>