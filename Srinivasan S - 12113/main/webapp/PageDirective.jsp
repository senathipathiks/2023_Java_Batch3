<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page</title>
</head>
<body>
<%
Date d=new Date();
out.println(d.toLocaleString());
%>
</body>
</html>