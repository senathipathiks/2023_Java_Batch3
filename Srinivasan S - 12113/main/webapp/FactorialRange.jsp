<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
int num=10;
int fact=1;
%>

<%
for(int i=1;i<=num;i++){
	fact=fact*i;
}
out.println(fact);
%>
</body>
</html>