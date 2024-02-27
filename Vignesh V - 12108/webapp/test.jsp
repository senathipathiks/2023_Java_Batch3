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
	String name = request.getParameter("name");
	String pwd = request.getParameter("pass");

	if (name.equals("vicky") && pwd.equals("vicky"))
		response.sendRedirect("loginsucess.jsp");

	else

		out.print("Login failure");
	%>

</body>
</html>