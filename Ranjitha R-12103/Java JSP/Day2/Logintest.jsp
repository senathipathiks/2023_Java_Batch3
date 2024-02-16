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
	String pwd = request.getParameter("pass");

	if (name.equals("Ranj") && pwd.equals("12345"))
	{
	%>

	<jsp:forward page="LoginSuccess.jsp"></jsp:forward>
	<%
	}
	else
	{
	%>
	<jsp:include page="Login.jsp"></jsp:include>
	<%
	out.print("Invalid username or password");
	}
	%>
</body>
</html>