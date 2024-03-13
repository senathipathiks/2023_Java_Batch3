<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A JSP page in tomcat docker container</title>
</head>
<body>
This is inside the docker. The server date & time is <%= new Date().toString() %>
</body>
</html>
%>