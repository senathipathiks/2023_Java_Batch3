<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<style>
body {
background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
height:70px;
	background-size: cover;
	background-position: 200%;
	background-repeat: no-repeat;
	background-size: 100%;
	background-position: 200%;
	align-items: center;
}

.card {

	
	padding: 0px;
	margin-top:10px;
	margin-left: 100px;
	padding-top: 0px;
}

.btn {
	color: purple;
}
</style>
</head>
<body>
	<div class="container">

		<form  class="form-inline">
			

			
				<div class="card" style="width: 10%;">
					<a href="Insert" class="btn btn- bg-info  " name="button"
						target="frame2">Insert</a>
				</div>
			<br>
				<div class="card" style="width: 10%;">
					<a href="Delete" class="btn btn- bg-info " name="button"
						target="frame2">Delete</a>
				</div>
				<br>
				<div class="card" style="width: 10%;">
					<a href="Update" class="btn btn- bg-info  " name="button"
						target="frame2">Update</a>
				</div>
				<br>
				<div class="card" style="width: 10%;">
					<a href="Find" class="btn btn- bg-info " name="button"
						target="frame2">View</a>
				</div>
	<br>
				<div class="card" style="width: 10%;">
					<a href="FindAll" class="btn btn- bg-info " name="button"
						target="frame2">Find All</a>
				</div>
				</form>

		</form>
	</div>
</body>
</html>
