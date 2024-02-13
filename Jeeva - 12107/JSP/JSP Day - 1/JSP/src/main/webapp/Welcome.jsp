<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- This Is My First JSP Page --%>
	<%! String name="Steve"; %>
	<% String name="Steve";
	out.print("<h1><marquee direction=right >"+name+"</marquee></h1>");  %>
	<%! int square(int x)
	{ return x*x;
	} %>
	<% out.print(square(2));%>
	<%= "<h1><marquee direction=left >"+square(4)+"</marquee></h1>" %>
</body>
</html>