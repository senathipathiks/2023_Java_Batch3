<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.hibernate.day3.RegistrationMain" %>
    <%@page import="com.hibernate.day3.Registration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Registration obj=new Registration();
obj.setUsername(request.getParameter("username"));
obj.setPassword(request.getParameter("password"));
int i=RegistrationMain.register(obj);
if(i>0)
	out.print("You are successfully registered");

%>
</body>
</html>