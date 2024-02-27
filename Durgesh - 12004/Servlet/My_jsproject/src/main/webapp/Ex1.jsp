<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- This is My world --%>

<% String name = "Durgesh"; %>

<%
out.print("<h1>Welcome " +name+ "</h1>");
%>

<%= "<h1> Welcome "+name+ "</h1>" %>


<%! int cube(int x)
{
return x*x*x;
}%>

<%
out.print(cube(3));
%>

<% cube(4); %>


</body>
</html>