
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
if (name.equals("vicky") && pwd.equals("vicky"))
{
	%>
	<jsp:forward page="loginsucess.jsp"></jsp:forward>
}
else
{
	
%>
	<jsp:include page="login.jsp"></jsp:include>





</body>
</html>