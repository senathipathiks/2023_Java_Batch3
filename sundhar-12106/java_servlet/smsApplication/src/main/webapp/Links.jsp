<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sidebar</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div class="container d-flex justify-content-center  align-items-center vh-100">
		<ul
			class="list-unstyled btn-group d-flex flex-column align-item-center justify-content-center gap-3">
			<a href="Insert.jsp" target="frame2"><li><button class="btn btn-primary btn">Insert</button></li></a>
			<a href="Update.jsp" target="frame2"><li><button class="btn btn-primary btn">Update</button></li></a>
			<a href="Delete.jsp" target="frame2"><li><button class="btn btn-primary btn">Delete</button></li></a>
			<a href="Fetch.jsp" target="frame2"><li><button class="btn btn-primary btn">fetch</button></li></a>
		</ul>
	</div>
</body>
</html>