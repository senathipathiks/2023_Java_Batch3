<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo Page</title>
</head>
<body>

	<%-- THIS IS A COMMENT TAG --%>



	<%!String Name = " Prem";

	public int square(int x) {
		return x * x;
	}%><%-- THIS IS USING DECLARATION TAG --%>



	<%
	String Name = "Parthaa";

	out.println(square(3));

	out.print("<h1>Welcome" + Name + "</h1>");
	%><%-- THIS IS USING SCRIPTLET TAG --%>


	<%="<h1>Welcome" + Name + " " + square(2) + "<h1>"%><%-- THIS IS USING Expression TAG --%>


</body>
</html>