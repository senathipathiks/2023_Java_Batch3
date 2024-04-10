<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="insert.jsp" %>
    <%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
/* String msg = (String) request.getAttribute("msg");
if(msg!=null && msg.equals("success"))
{
	out.print("<h1>Insertion Success</h1>");
}
else
{
	out.print("<h1>Insertion Failure</h1>");
} */
out.print("<h1> <font color=blue> Insertion done successfully </h1>");

%>

</body>
</html>