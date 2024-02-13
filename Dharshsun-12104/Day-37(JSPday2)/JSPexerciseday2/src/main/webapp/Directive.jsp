<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
    <%@ include file="login.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directives</title>
</head>
<body>
<%
Date date=new Date();
out.println(new Date().toLocaleString());
%>
</body>
</html>