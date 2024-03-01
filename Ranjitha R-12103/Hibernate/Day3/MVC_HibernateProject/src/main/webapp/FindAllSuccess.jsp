<%@page import="com.Hibernate.bean.Student"%>
<%@page import="com.lbmdb.bean.library"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="Find.jsp"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	color: white;
	align-content: center;
}
</style>
</head>
<body>
<%
	LinkedList<Student> lb = (LinkedList<Student>) request.getAttribute("bean");
	out.write("<font size=3px color=black><table align =center border=1>" 
			+ "<tr>"
		    + "<th> SId </th>"
		    + "<th> SName </th>" 
		    + "<th> SDept </th>" 
		    +"<th> SAddress</th>"
		    + "</tr>" );

	for (Student lbm : lb)
		out.print("<tr>" 
				+ "<tr>"
			    + "<td>" +lbm.getSid()+ "</td>"
			    + "<td>"+ lbm.getSname() + "</td>"
			    + "<td>" +lbm.getSdept() + "</td>" 
			    +"<td>"+lbm.getAddress()+"</td>"
			      
		+ "</tr>");
	out.print("</table></font>");
	%>
</body>
</html>