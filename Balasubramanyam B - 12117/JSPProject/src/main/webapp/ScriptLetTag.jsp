<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">

<%--Script let tag --%>

<%
String name = request.getParameter("name");
out.println("<h1>Welcome to "+name+"</h1>");
%>


</body>
</html>