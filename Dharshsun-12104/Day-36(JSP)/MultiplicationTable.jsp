<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication table</title>
</head>
<body>
<%
out.print("<table border=1 style=\"text-align:center;\"><tr><th>Number</th><th>Multiplied by</th><th>Result</th></tr>");
for(int i=1;i<=10;i++){
	out.print("<tr><td>"+i+"</td><td>"+9+"</td><td>"+(i*9)+"</td><tr>");
}
out.print("</table>");
%>
</body>
</html>