<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="sms.bean.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find page</title>
</head>
<body>
	<div class="container">

		<div>
			<form action="ControllerServlet" method="get">

				<input type="number" name="uid">
				<button type="submit" value="find" name="button">find</button>

			</form>
		</div>
	</div>
	<div class="conatiner">
		<%
		Student s = (Student) request.getAttribute("student");
		if (s != null) {
			System.out.println(s + " : student");
			out.println(" <div align=\"center\">+" + 
			"<table border=\"1\" cellpadding=\"5\">"
			+ "<caption><h2>List of Users</h2></caption>" 
			+ "<tr>" 
			+ "<th>ID</th>" 
			+ "<th>Name</th>" 
			+ "<th>City</th>"
			+ "<th>Operation1</th>" 
			+ "<th>Operation2</th>" 
			+ "</tr>" + "<tr>" 
			+ "<td>" + s.getId() + "</td>" 
			+ "<td>"
			+ s.getName() + "</td>" 
			+ "<td>" + s.getCity() + "</td>"

			+ "<td>" + "<a href=\"ControllerServlet?button=update&uid=" + s.getId() + "\" />Edit</a>" 
			+ "</td>" 
			+ "<td>"+ "<a href=\"ControllerServlet?button=delete&uid=" + s.getId() + " \" />Delete</a>" 
			+ "</td>" + "</tr>" + "</table>" + "</div>");
		}
		%>
	</div>

</body>
</html>