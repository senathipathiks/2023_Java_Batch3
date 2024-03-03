<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.spring.bean.Student" %> 
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" ></script>
</head>
<Style>

body{
            
    font-family: Verdana, Geneva, Tahoma, sans-serif;
}
</Style>
<body>

<%  ArrayList<Student> ls = (ArrayList<Student>) request.getAttribute("idList"); 

 if (ls != null) {
	System.out.println(ls + " : student");
	
	out.println(
			" <div align=\"center\">"
					+ "<caption><h2>List of Students</h2></caption>"
			+"<table class=\"table table-bordered table-hover table-striped w-75 border bg-white shadow px-5 pb-5 rounded\" cellpadding=\"5\">"
			
					+ "<tr>"
			+ "<th>ID</th>"
					+ "<th>Name</th>"
			+ "<th>Email</th>"
			+ "<th>Phone</th>"
			+ "</tr>"
			);
	for(Student sob : ls){
	out.println(" "
	+ "<tr>"
	+ "<td>" + sob.getId()
	+ "</td>"
	+ "<td>"
	+ sob.getName()
	+ "</td>"
	+ "<td>"
	+ sob.getEmail()
	+ "</td>"
	
    + "<td>"
    + sob.getPhone()
    + "</td>"

	
	);
}
	out.println("</table>" + "</div>");
}


%>
 <center><a href="Home.jsp" target="frame2" class="btn btn-success signin">Go to Home</a></center>
</body>
</html>