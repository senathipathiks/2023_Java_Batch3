<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- This is my fist comment --%>
	<%! String name = ""; %>
	<%
	String name  = "Dharshsun"; //we cannot declare metohds inside scriptlet tags this is service so local.
	out.println("<h1> Welcome " +name +"</h1>"); //out is implicit object of JSP
	%>
	<%="<h1> welcome " + name  +"</h1>" %>
	<%! int square(int x){
		return x*x;
		}
		%>
		<% out.print(square(2));%>
	}
</body>
</html>