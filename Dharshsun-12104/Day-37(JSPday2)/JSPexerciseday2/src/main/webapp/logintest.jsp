<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Test</title>
</head>
<body>
<%
String name = request.getParameter("name");
String pass = request.getParameter("pass");

if(name.equals("dharshsun") && pass.equals("Dharshsun"))
	response.sendRedirect("loginsuccess.jsp");

else
	out.print("login failiure");

%>
</body>
</html>