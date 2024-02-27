<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--This is my first JSP page --%>

<%! 

int square(int x)
{
	return x*x;
}
String name="Vignesh";
%>




<% 

out.print(square(2));

out.print("<h1>Welcome"+ name +"</h1>");

out.print(square(3));

%>





<%= "<h1> Welcome " + name + "</h1>"%>



</body>
</html>