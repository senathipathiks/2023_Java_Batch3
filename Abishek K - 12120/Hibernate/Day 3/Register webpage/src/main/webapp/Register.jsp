<%@page import="com.abi.day3.RegisterMain"%>
<%@page import="com.abi.day3.Register"%>
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

Register obj = new Register();
obj.setUsername(request.getParameter("uname"));
obj.setPassword(request.getParameter("pwd"));
int i = RegisterMain.register(obj);
if(i>0){
	out.print("You are successfully Registered");
}

%>

</body>
</html>