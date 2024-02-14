<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.day1.Student"></jsp:useBean>

<jsp:setProperty property="*" name="obj"/>

<h1><jsp:getProperty property="sid" name="obj"/></h1>
<h1><jsp:getProperty property="name" name="obj"/></h1>

<h1><jsp:getProperty property="city" name="obj"/></h1>

</body>
</html>