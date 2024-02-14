<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
String pwd=request.getParameter("pwd");

if(name.equals("jothi") && pwd.equals("jothi"))
{
	%>
	<jsp:forward page="Display.jsp" />
	<%
}
	else
	{
	%>
	<jsp:include page="Login.jsp" />
	<%
	out.print("Invalid Username/PAssword");
	}
	%>

</body>
</html>