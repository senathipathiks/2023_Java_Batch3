<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
<style>
h1 {
	color: maroon;
}
</style>
</head>
<body>
	<h1>
		<!-- Welcome to My Page!!!  -->
	<!--	<%=request.getParameter("name")%></h1> -->
		Welcome to My Page!!!
		<%=request.getAttribute("name")%></h1>
</body>
</html>