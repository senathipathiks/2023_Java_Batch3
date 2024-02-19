<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comment Tag</title>
</head>
<body>
<%--This is my Comment tag --%>
<%! String name="Srinivasan"; %>

<%
name="Srini";
out.print("<h1>Welcome "+name+" by scriptlet tag</h1>"); 
%>

<%= "<h1>Welcome " +name+" by expression tag</h1>"%>
</body>
</html>