<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test login</title>
</head>
<body>
	<%
	String name = request.getParameter("usr_name");	
	String pass = request.getParameter("pass");	
	
	if(name.equals("Sundhar")&& pass.equals("Dhanu")){
		%>
		<jsp:forward page="LoginSuccess.jsp"/>
	<%}else{%>
	<jsp:include page="Login.jsp"/>
	
		<%}
		out.print("<spann class=\"text-danger ms-5 \">Invalid user credentials...!</span>");
		%>
</body>
</html>