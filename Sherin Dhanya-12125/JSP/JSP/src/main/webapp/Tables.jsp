<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int a=10;
for(int i=1;i<=10;i++) {
	out.println("<html>");
	out.println("<body>");
	out.println("<table border=1>");
	out.println("<tr>");
	out.println("<td>");
	out.print(i);
	out.println("</td>");
	out.println("<td>");
	out.print("x");
	out.println("</td>");
	out.println("<td>");
	out.print(a);
	out.println("</td>");
	out.println("<td>");
	out.print("=");
	out.println("</td>");
	out.println("<td>");
	out.print(i*a);
	out.println("</td>");
	out.println("</tr>");
	out.println("</table>");
	out.println("</body>");
	out.println("</html>");}
%>
</body>
</html>