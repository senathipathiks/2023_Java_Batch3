<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%--
Date date=new Date();
out.println(new Date().toLocaleString());

--%>

<%
String name=request.getParameter("username");
String pwd=request.getParameter("password");

if(name.equals("Deepika") && pwd.equals("Deepika12")){
	%>
	<jsp:forward page="LoginSuccess.jsp" />
	<%
}
else{
	
	%>
	<jsp:include page="Login.jsp" />
	
<%	
out.print("invalid credentials");
}

%>
</body>
</html>