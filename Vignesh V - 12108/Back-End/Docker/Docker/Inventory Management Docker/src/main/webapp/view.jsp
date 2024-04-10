<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
<link rel="stylesheet" href=styles.css>
</head>
<body>
<div class="bg-image"></div>
	<form action="InsertServlet" method="post">
		<div class="bg-text">
			<input id="inputbox" type="text" name="id" placeholder="Product ID"><br>
			<input id="inputboxbtn" type="submit" class="btn btn-light btn-lg" value="Find" name="button">
			<input id="inputboxbtn" type="submit" class="btn btn-light btn-lg" value="Find All" name="button">
		</div>
	</form>

</body>
</html>