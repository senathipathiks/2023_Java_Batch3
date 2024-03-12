<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Insert.jsp"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	color: white;
	align-content: center;
	font-family:monospace; 	
}
</style>
</head>
<body>
<center>
<%
	out.print("<h3><center> Book Details Inserted Successfully</center></h3>");
	%>
	<h3>${bean}</h3></center>
</body>
</html>