<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="view.jsp" %>
    <%@page import="com.hibernate.bean.Library" %>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

Library lib=(Library)request.getAttribute("lib");
System.out.println(lib);
	out.write("<font size=4px color=blue><table align =center border=5px>"
			+"<tr>"
			+"<th> Book Id </th>"
			+"<th> Book Title </th>"
			+"<th> Author </th>"
			
			+"</tr>"
			+"<tr>"
			+"<td>"+lib.getBookId()+"</td>"
			+"<td>"+lib.getBookName()+"</td>"
			+"<td>"+lib.getAuthor()+"</td>"
		    
            +"</tr>"
			+"</font>");
	
	out.write("</table>");

%>


</body>
</html>