<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FInd</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<div
		class="mt-5 d-flex flex-column flex-wrap justify-content-center  align-items-center">
		<h1 class="text-center">Fetch operations</h1>
		<form action="InsertServlet" method="post" class="form-control">
			<table>
			<tr>
			<td>Student ID : </td>
			<td> <input type="text" name="id"> </td>
			</tr>
				<tr>
					
					<td><input class="btn btn-primary" type="submit" name="button"
						value="Find"></td>
					<td><input class="btn btn-warning" type="submit" name="button"
						value="Find All"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>