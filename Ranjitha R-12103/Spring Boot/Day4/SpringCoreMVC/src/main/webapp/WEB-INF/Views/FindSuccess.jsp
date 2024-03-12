
<%@page import="com.spring.bean.Library"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Find.jsp"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	color:black;
	align-content: center;
	font-family: monospace;
}
td{
color: white;
}
</style>
</head>
<body>
<center>
<% Library lb=(Library)request.getAttribute("bean");
out.write("<br><br><br>");
 
System.out.println(lb);
	out.write("<table border=2 align=center><font size=10px color=black>"
 
			+"<tr>"
			+"<th> Book Id </th>"
			+"<th> Book Name </th>"
			+"<th> Book Author </th>"
			
			+"</tr>"
			+"<tr>"
			+"<td>"+lb.getBookid()+"</td>"
			+"<td>"+lb.getBookname()+"</td>"
			+"<td>"+lb.getBookauthor()+"</td>"
		    
            +"</tr>"
			+"</font>");
	
	out.write("</table>");
 
%>

</body>
</html>