<%@page import="com.Hibernate.bean.Student"%>
<%@page import="com.lbmdb.bean.library"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%@ include file="Find.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
color: white;
align-content: center;
}
</style>
</head>
<body>
<%

	Student lb = (Student) request.getAttribute("bean");
	out.write("<br><font size=3px color=black><table align =center border=1>" 
	+ "<tr>"
    + "<th> SId </th>"
    + "<th> SName </th>" 
    + "<th> SDept </th>" 
    +"<th> SAddress</th>"
    + "</tr>" 
    + "<tr>"
    + "<td>" +lb.getSid()+ "</td>"
    + "<td>"+ lb.getSname() + "</td>"
    + "<td>" +lb.getSdept() + "</td>" 
    +"<td>"+lb.getAddress()+"</td>"
     
    + "</tr>" 
    +"</font>");
	%>
</body>
</html>