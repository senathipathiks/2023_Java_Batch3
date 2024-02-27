<%@page import="com.webapp.day3.Registeration"%>
<%@page import="com.webapp.day3.User"%>
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
User obj=new User();
obj.setEmpname(request.getParameter("name"));
obj.setEmpmail(request.getParameter("email"));
int i=Registeration.register(obj);  
if(i>0)  
out.print("You are successfully registered");  
  
%> 

</body>
</html>