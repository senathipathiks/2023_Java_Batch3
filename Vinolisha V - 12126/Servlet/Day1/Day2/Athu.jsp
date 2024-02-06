<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AuthuServlet">
	
	<div class="container">
	
		<label for="username">Username</label>
		<input type="text" placeholder="Enter UserName" id="name" name="fname" required><br><br>
		
		<label for="Password">Password</label>
		<input type="password" placeholder="Enter The Password" id="pass" name="fpass" required><br><br>
		
		<button>Submit</button>
	
	</div>
	</form>
</body>
</html>