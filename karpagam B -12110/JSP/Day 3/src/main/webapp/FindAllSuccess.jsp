<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="view.jsp" %>
    <%@page import="com.sms.bean.Student" %>
    <%@page import="java.util.LinkedList" %>
     
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Student> stud=(LinkedList<Student>)request.getAttribute("bean");

	out.write("<br><br><br>");
                    	out.write("<font size=5px color=blue><table align =center border=2px dashed>"
    		    				+"<tr>"
    		    				+"<th> Stud Id </th>"
    		    				+"<th> Stud Name </th>"
    		    				+"<th> Stud City </th>"
    		    				+"</tr>");
                    	
             for(Student s:stud) 
                    		out.write( "<tr>"
		    				+"<td>"+s.getId()+"</td>"
		    				+"<td>"+s.getName()+"</td>"
		    				+"<td>"+s.getCity()+"</td>"
		    				+"</tr>");
                    	
                    	out.write("</table></font>");
                    	
%>
</body>
</html>