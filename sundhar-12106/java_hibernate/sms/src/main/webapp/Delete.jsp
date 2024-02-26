<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous" />
</head>
<body>
	<div class="container">
		<div class="row g-3 align-items-center">
			<div class="col-auto">
				<label for="uid" name="uid" class="col-form-label">enter ID</label>
			</div>
			<div class="col-auto">
				<input type="number" id="uid" name="uid" class="form-control">
			</div>
			<div class="col-auto">
				<input type="submit" id="sub-btn" name="button" name="delete" class="form-control btn btn-danger">
			</div>
		</div>
		<!-- Showing result to the user whether data is inserted or not -->
		<%
		if (request.getAttribute("res") == "tru") {
			out.print("<span class=\"text-success\">deleted Successfully</span>");
			//request.setAttribute("button", "findAll");
			//response.sendRedirect("ControllerServlet?button=findAll");

		} else if (request.getAttribute("res") == "fal")
			out.print("<span class=\"text-danger\">Deletion failure</span>");
		%>
	</div>
</body>
</html>