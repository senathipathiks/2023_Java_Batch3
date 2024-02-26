<%@page import="com.hib.day3.RegisterMain"%>
<%@page import="com.hib.day3.Registration"%>
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
Registration obj=new Registration();
obj.setUsername(request.getParameter("username"));
obj.setPassword(request.getParameter("password"));
int i=RegisterMain.register(obj);
if(i>0){
	out.print("Registered successfully");
}
	

%>
</body>
</html>