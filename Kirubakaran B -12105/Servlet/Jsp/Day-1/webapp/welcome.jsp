<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--This is my first java server page --%>
<%! int square(int x)
{
return(x*x);}
%>

<%
String name="kiruba";
out.print("square of 3 is" +square(3));

%>

<%=square(4) %>
</body>
</html>