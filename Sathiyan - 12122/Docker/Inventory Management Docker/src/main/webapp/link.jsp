<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link href="styles.css" rel="stylesheet">
</head>
<body>
<div class="bg-image"></div>
	<form action="InsertServlet">
		<div class="bg-textlink">
				<a id="link" href="insert.jsp" class="btn btn-lg" name="button" target="frame2">Insert</a>
				<a id="link" href="delete.jsp" class="btn btn-lg" name="button" target="frame2">Delete</a>
				<a id="link" href="update.jsp" class="btn btn-lg" name="button" target="frame2">Update</a>
				<a id="link" href="view.jsp" class="btn btn-lg" name="button" target="frame2">Find</a>
		</div>
	</form>

</body>
</html>