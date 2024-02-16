<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--create object as id and to set class --%>
<jsp:useBean id="obj" class="com.jsp.Day1.Student"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/><br/>
<jsp:getProperty property="sid" name="obj"/><br/>
<jsp:getProperty property="name" name="obj"/><br/>
<jsp:getProperty property="city" name="obj"/>

</body>
</html>.