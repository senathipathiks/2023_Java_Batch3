<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int square(int x)
{
	return x*x;
}
%>
<%
out.print(square(2));
%>
<%= square(3) %>
</body>
</html>