<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int x=8,y=10;int i=1;
while(y>0){
out.println(i+"X"+x+"="+(i*x));
out.println();
y--;i++;
}
%>
</body>
</html>