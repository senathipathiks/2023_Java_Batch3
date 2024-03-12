<%@page import="com.spring.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
table{
align-content: center;
padding-left: 13px;
padding-top: 20px;
width: 1000px;
color: ;
background-color: silver;
}
body{
background-color: ;
align-items: center;
background-color: teal;

}
th{
color: maroon;
}
#btn{
width: 200px;
}
input{
border: none;
background-color: silver;
}
</style>
</head>
<body><br><br><center>
	<table border="3" cellspacing="0" cellpadding="0">
	<h3>Find All Student Details</h3>
		<tr>
			<th>Student Id</th>
			<th>Student Name</th>
			<th>Student City</th>
			<th>Action</th>
		</tr>
		<% ArrayList<Student> list=(ArrayList<Student>)request.getAttribute("list");
		Student stud1=(Student)request.getAttribute("bean");
		for(Student stud:list){
			
				out.println("<form action='doEdit' method='post' modelAttribute='bean'>");
				
				out.print("<tr>");
				out.print("<td><input type=\"text\" name=\"sid\" value=\""+stud.getSid()+"\" readonly ></td>");
				out.print("<td><input type=\"text\" name=\"sname\" value=\""+stud.getSname()+"\" ></td>");
				out.print("<td><input type=\"text\" name=\"scity\" value=\""+stud.getScity()+"\"  ></td>");
				out.print("<td><a class='btn btn-warning' value='Edit&Save'>Edit&Save</a><a class='btn btn-danger' value='delete' href='deletenow?bean="+stud.getSid()+" '>Delete</a></td>");
				out.print("</tr></form>");
				}
		
		out.print("<form action=\"doAdd\" method=\"post\" modelAttribute=\"bean\">");
	    out.print("<tr>");
	    out.print("<td><input type=\"text\" name=\"sid\"></td>");
	    out.print("<td><input type=\"text\" name=\"sname\"></td>");
	    out.print("<td><input type=\"text\" name=\"scity\" ></td>");
	    out.print("<td><a class='btn btn-success' value='add'>Add </a></td>");
	    out.print("</tr></form>");

%>



	</table></center>
</body>
</html>