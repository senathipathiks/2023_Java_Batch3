<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*,smsJspApp.bean.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<title>View Part</title>
<style type="text/css">
th, td {
	width: 130px;
	justify-content: 
}
</style>
</head>
<body class="bg-light">
	
	<div class="mt-2 container d-flex flex-column  justify-content-center  align-items-center">

		<h1 class="text-center">Insert Operation</h1>
		<form action="ControllerServlet" method="post">
			<table class="table table-bordered">
				<tr>
					<td>Student ID :</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>Student Name :</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>City :</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td colspan="2" class="text-center"><input
						class="btn btn-primary" type="submit" value="Insert" name="button" /></td>
				</tr>
			</table>
		</form>
		<!-- Showing result to the user whether data is inserted or not -->
		<%
		if (request.getAttribute("res") == "tru") {
			out.print("<span class=\"text-success\">inserted</span>");
			//request.setAttribute("button", "findAll");
			response.sendRedirect("ControllerServlet?button=findAll");

		} else if (request.getAttribute("res") == "fal")
			out.print("<span class=\"text-danger\">failure</span>");
		%>
	</div>
	<div id="fetchtoggle"
		class="mt-2 container d-flex flex-column  justify-content-center  align-items-center">
		<h1 class="text-center">Edit delete Operation</h1>
		<form action="ControllerServlet" method="post">
			<a href="<%=request.getContextPath()%>"></a>
			<table class="table table-bordered">
				<tr>
					<th>Student ID</th>
					<th>Student Name</th>
					<th>City</th>
					<th>Operation1</th>
					<th>Operation2</th>
				</tr>



				<c:forEach items="${stu}" var="stu">
					<tr>
						<td><input type="number" name="sid" readonly="readonly"
							value="${stu.id}" /></td>
						<td><input type="text" name="sname1" value="${stu.name}">
						</td>
						<td><input type="text" name="scity1" value="${stu.city}">
						</td>
						<td><input type="submit" name="edit" value="${stu.id}" /></td>
						<td><input type="submit" name="delete" value="${stu.id}" /></td>
					</tr>

				</c:forEach>

			</table>
		</form>
	</div>
</body>
</html>