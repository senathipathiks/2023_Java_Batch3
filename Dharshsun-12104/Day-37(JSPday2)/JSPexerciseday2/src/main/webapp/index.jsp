<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom tags title</title>
</head>
<body>
<%@ taglib uri="WEB-INF/mytags.tld" prefix="m" %>  
Current Date and Time is: <m:today/>  
</body>
</html>