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
String pass = request.getParameter("pass");


if(name.equals("dharshsun") && pass.equals("Dharshsun"))
	%>
	
	<jsp:forward page="loginsuccess.jsp"/>
<%
else
{
%>
<jsp:include page="login.jsp"></jsp:include>

<%
out.print("Invalid username/Password");
}

%>
</body>
</html>