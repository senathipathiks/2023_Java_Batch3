<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Test</title>
</head>
<body>

<jsp:useBean id="stud" class="com.jsp.day1.Student"></jsp:useBean>
<jsp:setProperty property="*" name="stud"/>
<jsp:getProperty property="sid" name="stud"/>
<jsp:getProperty property="name" name="stud"/>
<jsp:getProperty property="city" name="stud"/>

</body>
</html>