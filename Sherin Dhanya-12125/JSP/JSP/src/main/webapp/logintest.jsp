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

if(name.equals("sherin")&& pwd.equals("sherin"))
{	
%>
<jsp:forward page="loginsuccess.jsp"/>
	<%--response.sendRedirect("loginsuccess.jsp");--%>
	<% 
}
else
{
	%>
<jsp:include page="login.jsp"/>
<%
out.print("Invalid username/password");
}
%>

	<%--out.print("Login Failure");--%>
</body>
</html>