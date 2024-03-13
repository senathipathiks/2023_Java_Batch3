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
	%>
	
	<jsp:forward page="loginsuccuss.jsp"></jsp:forward>
	
	<%
	} else if (!(a.equals("Bala"))) {
	%>
	
	<jsp:include page="login1.jsp"></jsp:include>
	
	<%
	out.print("<h1>Invalid name </h1>");
	} 
	else {
	%>
	
	<jsp:include page="login1.jsp"></jsp:include>
	
	<%
	out.print("<h1>Invalid password </h1>");
	}
	%>
</body>
</html>