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
out.println("<html>");
out.println("<body>");
out.println("<h1>Deepika Details</h1>");
out.println("<table border=1>");
out.println("<tr>");
out.println("<td>");
out.println("Number");
out.println("</td>");
out.println("<td>");
out.println("value");
out.println("</td>");
out.println("</tr>");
for (int i = 1; i <= 10; i++) {
out.println("<tr>");
	out.println("<td>");
	out.println(i +"x 5");
	out.println("</td>");
	out.println("<td>");
	out.println(i*5);
	out.println("</td>");
	out.println("</tr>");
}

out.println("</table>");
out.println("</body>");
out.println("</html>");

%>

</body>
</html>