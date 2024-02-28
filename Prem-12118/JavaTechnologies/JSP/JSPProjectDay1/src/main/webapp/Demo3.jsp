<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Task</title>
</head>
<body>



	<%
	int mul = 1;
	int order = 8;
	int n = 10;
	int i;

	for (i = 1; i <= n; i++) {
		mul = i * order;
		out.println("<p></p>");
		out.println("8" + "X" + i + "=" + mul + "\n");

	}
	%> //using script let tag the multiplication is achieved

</body>
</html>