<%@page import="com.day2.webappmaven.Registration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@page import="com.day2.webappmaven.Registration" %>
   <%@page import="com.day2.webappmaven.RegistrationMain" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Registration obj=new Registration();
obj.setUsername(request.getParameter("name"));
obj.setPassword(request.getParameter("pwd"));
int i=RegistrationMain.register(obj);
if(i>0)
	out.print("<h1><font color=red>You are successfully registered..!!</font></h1>");

%>
</body>
</html>