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


<%! String name="Ranjitha Rajaram"; %>



<%! int square(int x){
	return x*x;
} %>
<% out.println(square(2)); %>
<%= square(3) %>

<%--out is implicit object of jsp,no need to create printwriter --%>
<%

String name="Ranjitha";
out.print("<h1> Welcome "+name+"</h1>");

%>

<%= "<h1> Welcome "+name+"</h1>" %>
</body>
</html>