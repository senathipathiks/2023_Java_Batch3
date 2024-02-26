<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="day2Assessment.bean.*,day2Assessment.controller.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<jsp:useBean id="u" class="day2Assessment.bean.User"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />
	<%
	int i = RegistrationDAO.insert(u);
	if(i > 0)
		out.println(" <div class=\"d-flex  justify-content-center align-items-center vh-100 form-control-lg\">"
				+ "<div class=\"card style=\"width: 40rem;\">"
		  +"<h5 class=\"card-header\">Message</h5>"
		  +"<div class=\"card-body\">"
		    +"<h5 class=\"card-title\">Registration Page</h5>"
		    +"<p class=\"card-text\">Your Details are saved successfully in a Backend !!!</p>"
		    +"<a href=\"index.jsp\" class=\"btn btn-primary\">Go Back</a>"
		 + "</div>"
		+"</div>"
		);
	%>
	
</body>
</html>