<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="obj" class="day2Jsp.bean.Student"/>
	<jsp:setProperty property="*" name="obj"/>
	
	<jsp:getProperty property="sid" name="obj"/>
	<jsp:getProperty property="name" name="obj"/>
	<jsp:getProperty property="city" name="obj"/>
</body>
</html>