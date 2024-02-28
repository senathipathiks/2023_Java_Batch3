<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Links</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<br>
	<br>
	<form action="InsertServlet" method="post">
		<br> <br> <br> <br>
		<center>
			<font>
				<button size="5px" color="orange">
					<a href="insert.jsp" class="btn-btn-primary btn-lg" name="button"
						target="frame2">Insert</a>
				</button>
				<br>
				<br>
				<button>
					<a href="delete.jsp" class="btn-btn-primary btn-lg" name="button"
						target="frame2">Delete</a>
				</button>
				<br>
				<br>
				
					<button> <a href="update.jsp" class="btn-btn-primary btn-lg"
					name="button" target="frame2">Update</a>
				</button>
				<br>
				<br>
				<button>
					<a href="view.jsp" class="btn-btn-primary btn-lg" name="button"
						target="frame2">Find</a>
				</button>
			</font>
		</center>
	</form>
</body>
</html>