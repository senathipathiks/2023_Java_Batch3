<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page import="com.spring.bean.Student" %> 
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title> <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" ></script>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
    
    

</head>

<style>
body{
            
             font-family: Verdana, Geneva, Tahoma, sans-serif;
}
</style>

<body>

<%    Student sb =  (Student)request.getAttribute("b"); 


if (sb != null ){
	

			 out.println(
				  " <div align=\"center\">"
				  +"<center>"
								+ "<caption><h2>List of Students</h2></caption>"
						+"<table class=\"table table-bordered table-hover table-striped w-75 border bg-white shadow px-5 pb-5 rounded\" cellpadding=\"5\">"
						
								+ "<tr>"
						+ "<th>ID</th>"
								+ "<th>Name</th>"
						+ "<th>Email</th>"
						+ "<th>Phone</th>"
						
						+ "</tr>"
						);
				
				out.println(" "
				+ "<tr>"
				+ "<td>" +sb.getId()
				+ "</td>"
				+ "<td>"
				+ sb.getName()
				+ "</td>"
				+ "<td>"
				+ sb.getEmail()
				+ "</td>"
						+ "<td>"
						+ sb.getPhone()
						+ "</td>"
	                    
				
				);
			
				out.println("</table>" + "</div>"+"</center>");
			}
		    %>
		    <center><a href="Home.jsp" target="frame2" class="btn btn-success signin">Go to Home</a></center>
		    

</body>
</html>