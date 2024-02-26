<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.day3.HibernateWeb.Registration"%>
    <%@page import="com.day3.HibernateWeb.RegistrationMain"%>
    
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
   obj.setPassword(request.getParameter("pass"));
	
   int i=RegistrationMain.register(obj);
   if(i>0)
	   out.print("You are Successfully registred");
%>


</body>
</html>