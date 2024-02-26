<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="view.jsp" %>
    <%@page import="com.lib.bean.Library" %>
    <%@page import="java.util.LinkedList" %>
     
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
LinkedList<Library> lib=(LinkedList<Library>)request.getAttribute("bean");

	out.write("<br><br><br>");
                    	out.write("<font size=3px color=black><table align=center  border: solid black 1px >"

    		    				+"<tr>"
    		    				+"<th> Book Id </th>"
    		    				+"<th> Book Title </th>"
    		    				+"<th> Author </th>"
    		    				+"<th> Due Date</th>"
    		    				
    		    				+"</tr>");
                    	
             for(Library i:lib) 
                    		out.write( "<tr>"
		    				+"<td>"+i.getId()+"</td>"
		    				+"<td>"+i.getTitle()+"</td>"
		    				+"<td>"+i.getAuthor()+"</td>"
				    		+"<td>"+i.getDate()+"</td>"
						    


		    				+"</tr>");
                    	
                    	out.write("</table></font>");
                    	
%>
</body>
</html>