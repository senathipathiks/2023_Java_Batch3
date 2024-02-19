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
String name=request.getParameter("uname");
String pwd=request.getParameter("pwd");

if(name.equals("Sri")&&pwd.equals("Sri25")){
	//response.sendRedirect("Welcome.jsp");
%>	
<jsp:forward page="Welcome.jsp"></jsp:forward>
<%
}
else{
%>
<jsp:include page="Login.jsp"></jsp:include>

<%
out.println("<h1>Login failed</h1>");
out.println("<h2>Enter Valid Credentials</h2>");
}
%>
</body>
</html>