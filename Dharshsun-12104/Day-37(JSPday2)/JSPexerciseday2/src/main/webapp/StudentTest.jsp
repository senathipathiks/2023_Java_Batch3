<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentTest</title>
</head>
<body>
<jsp:useBean id="obj" class="com.java.Bean.Student"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/> gets all the properties<%--gets all the properties--%> 
<jsp:getProperty property="sid" name="obj"/>
<jsp:getProperty property="name" name="obj"/>
<jsp:getProperty property="city" name="obj"/>
</body>
</html>