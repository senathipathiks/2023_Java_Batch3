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
out.print("<table border=1>");
out.print("<tr>");
out.print("<td>");
out.print("Multiples");
out.print("</td>");

out.print("<td>");
out.print("Result");
out.print("</td>");
out.print("</tr>");

for (int i=1;i<11;i++) {
   out.println("<tr>");
   out.println("<td>");
   out.print(i+"X 8");
   out.println("</td>");
   out.println("<td>");
   out.print(i*8);
   out.println("</td>");
   out.println("</tr>");
}
%>
</body>
</html>