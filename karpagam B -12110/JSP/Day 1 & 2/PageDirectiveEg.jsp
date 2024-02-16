<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%--  below  is page directive --%>
    
    <%@ page import="java.util.Date" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Date date=new Date();
out.println(new Date().toLocaleString());



%>

</body>
</html>