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
out.println("Square :"+square(2));
%>

<%= square(5) %>
</body>
</html>