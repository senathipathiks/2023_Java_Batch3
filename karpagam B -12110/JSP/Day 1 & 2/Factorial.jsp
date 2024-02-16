<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Factorial</title>
</head>
<body>
<%--Factorial of a number --%>

<%! int n=5; 
    int fact=1;
%>

<% for(int i=1;i<=n;i++){
	fact=fact*i;
	} 
    out.println("Factorial of 5 is:"+fact);
    %>


</body>
</html>