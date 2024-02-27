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
String name =request.getParameter("uname");

String pwd = request.getParameter("pass");
if(name.equals("Heram")&& pwd.equals("H123")){
	%>
	<jsp:forward page="Day2-LogInSuccess.jsp"></jsp:forward>
	<%


}
	
	
	%>
	

%>
</body>
</html>