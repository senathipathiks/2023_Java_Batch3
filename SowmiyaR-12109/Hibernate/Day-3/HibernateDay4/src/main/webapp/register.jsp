<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.hibernate.day4.Registration" %>
   <%@page import="com.hibernate.day4.RegistrationMain" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
padding-top: 90px;
color: purple;
}
</style>
</head>
<body>
<%
Registration obj=new Registration();
obj.setUsername(request.getParameter("name"));
obj.setPassword(request.getParameter("password"));

int i=RegistrationMain.register(obj);
if(i>0)
	out.print("<h1><center>you are successfully register<center></h1>");
%>
</body>
</html>