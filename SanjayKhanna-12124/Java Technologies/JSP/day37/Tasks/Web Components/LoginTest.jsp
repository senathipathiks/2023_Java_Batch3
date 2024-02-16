
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
	String name = request.getParameter("username");
	String password = request.getParameter("password");
	session.setAttribute("name", name);
	
	if(name.equals("Sanjay") && password.equals("sanjay@42")){
		//response.sendRedirect("Welcome.jsp");%><jsp:forward page="Welcome.jsp" />
		
<%
	}
	else{
		//out.println("Username or Password is incorrect");
	%>
	<jsp:include page="Login.jsp"></jsp:include>
	<%="Username or Password is incorrect" %>
	<%} %>

</body>
</html>