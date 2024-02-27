<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<%@page import="sms.bean.Student,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous" />
</head>
<body>
	<div class="container">

		<div>
			<form action="ControllerServlet" method="get">

				<div class="vw-25">
					<input type="number" class="form-control" name="uid">
					<button type="submit" class="btn btn-primary" value="find"
						name="button">find</button>
					<a href="ControllerServlet?button=findAll"><button
							type="button" class="btn btn-primary">find All</button></a>
				</div>

			</form>
		</div>
	</div>
	<div class="conatiner">
		<%
		Student s = (Student) request.getAttribute("student");
		if (s != null) {
			System.out.println(s + " : student");
			out.println(" <div align=\"center\">" 
					+ "<caption><h2>List of Users</h2></caption>"
			+"<table class=\"table table-bordered\" cellpadding=\"5\">"
			 
					+ "<tr>" 
			+ "<th>ID</th>" 
					+ "<th>Name</th>" 
			+ "<th>City</th>"
			+ "<th>Operation1</th>" 
			+ "<th>Operation2</th>" 
			+ "</tr>" 
			+ "<tr>" 
			+ "<td>" + s.getId() 
			+ "</td>" 
			+ "<td>"
			+ s.getName() 
			+ "</td>" 
			+ "<td>" 
			+ s.getCity() 
			+ "</td>"

			+ "<td>" + "<a href=\"ControllerServlet?button=update&uid=" + s.getId() + "\" />Edit</a>" + "</td>" + "<td>"
			+ "<a href=\"ControllerServlet?button=delete&uid=" + s.getId() + " \" />Delete</a>" + "</td>" + "</tr>"
			+ "</table>" + "</div>");
		}
		%>
	</div>

	<div class="container" align="center">
		<%
		ArrayList<Student> ls = (ArrayList<Student>) request.getAttribute("students");
		if (ls != null) {
			System.out.println(ls + " : student");
			out.println(
					" <div align=\"center\">" 
							+ "<caption><h2>List of Users</h2></caption>"
					+"<table class=\"table table-bordered\" cellpadding=\"5\">"
					 
							+ "<tr>" 
					+ "<th>ID</th>" 
							+ "<th>Name</th>" 
					+ "<th>City</th>"
					+ "<th>Operation1</th>" 
					+ "<th>Operation2</th>" 
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
			+ sob.getCity() 
			+ "</td>"

			+ "<td>" + "<a class=\"btn btn-warning\" href=\"ControllerServlet?button=update&uid=" + sob.getId() + "\" />Edit</a>" + "</td>" + "<td>"
			+ "<a class=\"btn btn-danger\" href=\"ControllerServlet?button=delete&uid=" + sob.getId() + " \" />Delete</a>" + "</td>" + "</tr>"
			);
		}
			out.println("</table>" + "</div>");
		}
		%>
			
	</div>

</body>
</html>