<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="update.jsp" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	out.print("<h1> <font color=green> Record updated Successfully </font></h1>");
%>
<h1>${bean}</h1>
</body>
</html>