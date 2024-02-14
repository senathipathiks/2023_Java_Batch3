<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication jsp</title>
</head>
<body>
<%--Multiplication Table --%>

<%! int n=5; 
%>

<% for(int i=1;i<=10;i++){
	int y=i*n;
    out.println(i+"*"+n+"="+y +"<br/>");

	} 
    %>


</body>
</html>