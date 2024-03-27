<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="insert.jsp" %>
    <%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<style>
h1{
color: black;
}
</style>
</head>
<body>
<%
out.print("<h1> Inserted successfully </h1>");
%>
<h1>${bean}</h1>
</body>
</html>