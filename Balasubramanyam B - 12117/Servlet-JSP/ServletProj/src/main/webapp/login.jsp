<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<title>Insert title here</title>

</head>
<body><div class="container">
<form action="Validation" >

        <div class="mb-6">
		<label for="username" class="form-label">UserName:</label>
		<input type="text" id="username"  class="form-control" name="name" required><br>
		</div>
		<div class="mb-6">
		<label for="password" class="form-label">Password:</label>
		<input type="password" id="password" class="form-control" name="password" required><br>
		</div>
		<input type="submit" class="btn btn-primary" value="submit">
		</form></div>
</body>  
</html>