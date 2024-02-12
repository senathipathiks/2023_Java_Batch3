<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example2</title>
</head>
<body>

<%! int square(int x){ return x*x; }%>
<%= "Square of 3 :"+square(3)%>

</body>
</html>