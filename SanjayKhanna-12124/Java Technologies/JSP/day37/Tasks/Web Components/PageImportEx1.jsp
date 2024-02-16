<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date</title>
</head>
<body>
Current Date :<%=new Date().toLocaleString() %>
<%@include file="Login.jsp" %>
</body>
</html>