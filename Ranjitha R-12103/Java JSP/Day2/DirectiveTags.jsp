<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%--Directive tags --%>
     <%@ page import="java.util.Date" %>
     <%@ include file="Login.jsp" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Date date=new Date();
out.print(new Date()+"</br>");
out.print(new Date().toLocaleString());



%>
</body>
</html>