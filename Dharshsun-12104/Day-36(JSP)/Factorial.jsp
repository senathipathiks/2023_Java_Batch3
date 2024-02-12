<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial</title>
</head>
<body>
<%!
long fact(long a) {
			if (a <= 1)
			return 1;
			else {
			a = a * fact(a - 1);
			return a;
			}
			}
			%>
			<%
			out.print(fact(8));
			%>
</body>
</html>