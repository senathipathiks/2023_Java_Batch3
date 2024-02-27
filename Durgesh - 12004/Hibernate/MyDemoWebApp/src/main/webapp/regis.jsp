<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>'
    <%@page import="com.webapp.demo.Registration" %>
    <%@page import="com.webapp.demo.RegistrationMain" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Registration r = new Registration();
r.setuName(request.getParameter("uname"));
r.setPassword(request.getParameter("passw"));
int i = RegistrationMain.register(r);
if(i>0)
	out.print("You are successfully registered");
%>

</body>
</html>