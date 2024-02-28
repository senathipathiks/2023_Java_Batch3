<%@page import="com.hibernate.webapp.RegistrationMain"%>
<%@page import="com.hibernate.webapp.Registration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Registration obj = new Registration();
obj.setName(request.getParameter("name"));
obj.setEmail(request.getParameter("email"));
obj.setPassword(request.getParameter("password"));
int i=RegistrationMain.register(obj);
if(i>0)
	out.print("you are successfully Registered");



%>

</body>
</html>