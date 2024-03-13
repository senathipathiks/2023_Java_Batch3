<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<%
	String a = request.getParameter("num1");
	String b = request.getParameter("num2");

	int c = Integer.parseInt(a);
	int d = Integer.parseInt(b);
	int e = c + d;
	out.println("<h1> Result is : "+e+"</h1>");  %>
</body>
</html>