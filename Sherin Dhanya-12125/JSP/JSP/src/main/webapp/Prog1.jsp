<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--This is my first jsp page --%>
<%! 
String name="Sherin";
int square(int x)
{
	return x*x;
}
%>
<%
String name = "SHERIN ";
String name1 = " KIRUBA";
String name2 = " JOTHI";

out.print("<h1> Welcome "+ name +"</h1>");
out.print("<h1>" + square(2) + "</h1>");

%>
<%= "<h1> Welcome " + name1 + "</h1>" %>
<%= "<h1> Welcome " + name2 + "</h1>" %>
<%= "<h1>" + square(3) + "</h1>"%>
</body>
</html>