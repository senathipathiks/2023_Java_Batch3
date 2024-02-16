<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Use bean</title>
</head>
<body>
<jsp:useBean id="stu" class="com.day2.Student"/>
<jsp:setProperty property="*" name="stu"/>
<jsp:getProperty property="stuId" name="stu"/>
<jsp:getProperty property="stuName" name="stu"/>
<jsp:getProperty property="stuCity" name="stu"/> 
</body>
</html>