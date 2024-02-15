<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.time.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<%
	LocalDate date = LocalDate.now();

%>
	
	<%= "<h1>Today's date is "+ date.getDayOfMonth() +" : "+(date.getMonth()) +" : "+ date.getYear() +"</h1>" %>
</body>
</html>