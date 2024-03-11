<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>links</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid border-bottom vh-100 vw-100 d-flex flex-column justify-content-center  align-item-center">
		<h1 class="text-center">Student management System</h1><br>
		<div class="container d-flex flex-column justify-content-center  align-item-center">
			<table id="table-1">
		<tr>
			<td><a href="Insert.jsp" target="view" class="btn btn-primary">Insert</a></td>
			<td><a href="EMSController?emsAction=Update" target="view" class="btn btn-primary">Update</a></td>
			<td><a href="EMSController?emsAction=Delete" target="view" class="btn btn-primary">Delete</a></td>
			<td><a href="EMSController?emsAction=Find" target="view" class="btn btn-primary">Find</a></td>
			<td><a href="EMSController?emsAction=FindAll" target="view" class="btn btn-primary">Find All</a></td>
		</tr>
	</table>
		</div>
	</div>
</body>
</html>