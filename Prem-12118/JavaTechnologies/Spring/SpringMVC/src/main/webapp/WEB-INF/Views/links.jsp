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
<style>
body {
	background-color: #f8f9fa;
}

form {
	max-width: 400px;
	margin: 0 auto;
	text-align:center;'
}

.custom-button {
	margin: 10px 0;
}

h6 {
	font-size: 1.5rem;
	font-weight: bold;
	font-family: 'Times New Roman', Times, serif;
	color: black;
	text-align: justify;
	margin-bottom: 20px;
}
</style>
<script>

    function redirectToInsertPage() {
        parent.frames['frame2'].location.href = 'insert';
    }
    
    function redirectToDeletePage() {
        parent.frames['frame2'].location.href = 'delete';
    }
    function redirectToUpdatePage() {
        parent.frames['frame2'].location.href = 'update';
    }
    function redirectToFindPage() {
        parent.frames['frame2'].location.href = 'find';
    }
    function redirectToFindAllPage() {
        parent.frames['frame2'].location.href = 'FindAll';
    }
</script>
</head>
<body>
	<br>
	<br>
	<h6>&nbsp;&nbsp;&nbsp;Use the below options</h6>
	<br>
	<form action="links" method="post">
   
	 	<input type="button" value="Insert Student" class="btn btn-primary btn-lg custom-button"onclick="redirectToInsertPage()">		 
 			<br> <br>
		<input type="button" value="Delete Student" class="btn btn-danger btn-lg custom-button"onclick="redirectToDeletePage()">
			<br> <br>
		<input type="button" value="Update Student" class="btn btn-success btn-lg custom-button"onclick="redirectToUpdatePage()">
			<br> <br>
		<input type="button" value="Find Student" class="btn btn-warning btn-lg custom-button"onclick="redirectToFindPage()"> 
		 <br> <br>
		<input type="button" value="Find All Students" class="btn btn-warning btn-lg custom-button"onclick="redirectToFindAllPage()"> 
		 
	</form>
</body>
</html>
