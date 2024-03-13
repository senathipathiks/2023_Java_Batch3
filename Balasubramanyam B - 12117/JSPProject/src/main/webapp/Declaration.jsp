<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Declaration Tag --%>
 <%!
 String a ="Balasubramanyam B";
 int b = 5;
 int sqr(int n){
	 return n*n*n;
 }
	 %>
	 
 <% out.print(a+" "+b); %>
 <% String c = request.getParameter("num");
 int d = Integer.parseInt(c);
 %>
 <%=sqr(d)%>
</body>
</html>