<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial in table using table approach for printing factorial in table</title>
</head>
<body>
<%
	out.print("<table border=1 style=\"text-align:center\"><tr><th>Number</th><th>Value</th>");
int fact=1;
for(int i=1;i<=10;i++){
	fact*=i;
	out.print("<tr><td>"+i+"!</td><td>"+fact+"</td></tr>");
}
	out.print("</table>");
	%>
</body>
</html>