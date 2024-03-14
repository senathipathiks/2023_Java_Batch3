<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="Insert.jsp" %>

<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
h1 {
	color: #1a2639;
	background-color: #eeeeee;
}
</style>
<%
out.print("<h1>  Record Inserted Successfully </h1>");
%>
<h1>${bean}</h1>
</body>
</html>