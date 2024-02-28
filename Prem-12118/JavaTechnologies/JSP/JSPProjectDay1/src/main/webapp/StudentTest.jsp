<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>
	<jsp:useBean id="Bean" class="com.jsp.day1.Student"></jsp:useBean>
	<jsp:setProperty property="*" name="Bean" />
	<jsp:getProperty property="id" name="Bean" />
	<jsp:getProperty property="name" name="Bean" />
	<jsp:getProperty property="city" name="Bean" />
</body>
</html>