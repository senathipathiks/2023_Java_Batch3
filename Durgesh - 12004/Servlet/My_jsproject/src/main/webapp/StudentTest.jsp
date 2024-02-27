<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="odj" class="com.day2.jsp.Student"></jsp:useBean>

<jsp:setProperty property="*" name="odj"/>

<jsp:getProperty property="sid" name="odj"/>
<jsp:getProperty property="sname" name="odj"/>
<jsp:getProperty property="scity" name="odj"/>



</body>
</html>