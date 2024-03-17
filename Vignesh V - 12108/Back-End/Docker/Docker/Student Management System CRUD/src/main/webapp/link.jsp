<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Linking page</title>
</head>
<body>
	<form action="InsertServlet">
	<br><br><br>
	<br>
		<center>
			<font size="5px" color="orange">
				<a href="insert.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Insert</a>
				<a href="delete.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Delete</a>
				<a href="update.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Update</a>
				<a href="view.jsp" class="btn btn-primary btn-lg" name="button" target="frame2">Find</a>
			</font>
		</center>
	</form>
</body>
</html>