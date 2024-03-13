<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Date date = new Date();
out.print("DD:MM:YY = "+date.getDate()+":"+(date.getMonth()+1)+":"+(date.getYear()+1900));
out.print(date.toLocaleString());
%>

</body>
</html>