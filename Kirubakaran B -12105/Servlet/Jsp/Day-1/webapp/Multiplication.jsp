<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!  int num1=2;
   int num2=4;%>
   
   <%  for (int i = 0; i<10; i++)
	   {
	   
	   out.println(i+" x 2 = ");
	   out.println(i*2);
	   out.println("<br>");
	   
	   }%>
</body>
</html>