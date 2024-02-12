<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example1</title>
</head>
<body>
<%--This is My First JSP page --%>
<%! String name="SanjayKhanna"; %> <%-- Declaration Tag --%>
<%	
	String name="Vishnu";						
	out.print("<h1>Welcome "+name+"</h1>");
	%>
<%= "<h2>Enjoy your day " + name + "</h2>" %>

</body>
</html>