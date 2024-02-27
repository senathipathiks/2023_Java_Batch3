<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- This is my First jsp file --%>


<%!  int square (int x)
{
  return x * x;	
}
%>
<%
out.print (square(2));
%>
<% out.print(square(3)); %>

<%= square(10) %>


<%
 int i,fact =1;
for( i=1;i<=5;i++)
{
  fact = fact*1;	
}
out.print(fact);

%>



<%--<%! String name = "LOKI" ;--%>
<%-- 


out.print("<h1>  WELCOME TO THE PAGE "+name+" </h1>");
--%>

<%-- "<h1> WELCOME " + name +"</h1>"--%>
</body>
</html>