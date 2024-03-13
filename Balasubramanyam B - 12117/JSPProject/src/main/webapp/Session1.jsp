<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<% String n = request.getParameter("name"); 
out.print("Welcome "+n); 
session.setAttribute("Name",n);
%> 
<a href="Session2.jsp">second page</a>
</body>
</html>