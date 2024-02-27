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

int i, fact=1;
int n=5;


%>

<% for(i=1;i<=n;i++){
	fact=fact*i;
	
}out.print("Factorial of "+n+" is: "+fact);


%>


</body>
</html>