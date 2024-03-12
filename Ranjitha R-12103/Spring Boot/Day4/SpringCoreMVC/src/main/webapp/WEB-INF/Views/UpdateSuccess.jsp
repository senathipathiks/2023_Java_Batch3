<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Update.jsp" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
font-family: monospace;
}
</style>
</head>
<body>
<%
	out.print("<h3><center>Book details Updated Successfully</center> </h3>");
	%>
	<h3>${bean}</h3>
</body>
</html>