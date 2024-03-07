<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="insert.jsp" %>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center> 
<%
out.print("<h1> <font color=green>Record Inserted Successfully</font></h1>");
%>
<h1>${bean}</h1>
</center>
</body>
</html>