<%@page import="com.spring.bean.Library"%>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="view.jsp" %>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
  border-collapse: collapse;
  
  
}
 
th, td {
  text-align: left;
  padding: 8px;
}
 
tr:nth-child(even) {background-color: #ececdf;</style>
</head>
<body>

<% Library l=(Library)request.getAttribute("bean");
out.write("<br><br><br>");

System.out.println(l);
	out.write("<table border=3 align=center><font size=5px color=red>"

			+"<tr>"
			+"<th> Book Id </th>"
			+"<th> Book Title </th>"
			+"<th> Author </th>"
			
			+"</tr>"
			+"<tr>"
			+"<td>"+l.getBid()+"</td>"
			+"<td>"+l.getBname()+"</td>"
			+"<td>"+l.getBuath()+"</td>"
		    
            +"</tr>"
			+"</font>");
	
	out.write("</table>");

%>


</body>
</html>