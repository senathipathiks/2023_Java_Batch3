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
	 	String a = request.getParameter("name");
		String b = request.getParameter("pwd");
		if (a.equals("Bala") && b.equals("12345")) {
	 		response.sendRedirect("loginsuccuss.jsp");
	 	} else {
	 		out.print("Login failure");
		}
	%>
</body>
</html>