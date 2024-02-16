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
String name = request.getParameter("name");
String pass = request.getParameter("password");

if(name.equals("abi") && pass.equals("abi"))
{
%>
<jsp:forward page="LoginSuccess.jsp"/>
<%
}
else
{
%>
<jsp:include page="Login.jsp"/>	
<%
out.print("Invalid Username/Password");
}
%>
</body>
</html>