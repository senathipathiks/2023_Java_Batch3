<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%! int fact=1;
 public int factorial(int n){
 for(int i=1;i<n;i++){
	 fact=fact*i;
 }
 return fact;
 }
 %>
 <%out.print(factorial(5));%>
</body>
</html>