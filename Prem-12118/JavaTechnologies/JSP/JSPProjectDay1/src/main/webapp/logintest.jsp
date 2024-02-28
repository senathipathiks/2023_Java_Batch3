<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<%
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");

	if (name.equals("Prem") && pwd.equals("Prem@1234")) {
	%>
	<jsp:forward page="loginsuccess.jsp"/>
	
	<%
	} else {
	%>

	<jsp:include page="Day2 Demo1.jsp" />

	<%
	out.print("INVALID UerName/Password");
	}
	%>
</body>
</html>