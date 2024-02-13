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
String name=request.getParameter("name");
String pwd=request.getParameter("pwd");

if(name.equals("Varshi") && pwd.equals("Varshi"))
{
%>
<jsp:forward page="Loginsuccess.jsp"></jsp:forward>
<% 
}
else
{
%>
<jsp:include page="Login2.jsp"></jsp:include>
<%
out.print("Invalid Username/Password");
}
%>



</body>
</html>