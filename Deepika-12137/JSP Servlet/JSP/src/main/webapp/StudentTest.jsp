<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.dee.jspday1.Student"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<jsp:getProperty property="sid" name="obj"/>
<jsp:getProperty property="sname" name="obj"/>
<jsp:getProperty property="scity" name="obj"/>
</body>
</html>