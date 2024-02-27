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
	background: rgb(2, 0, 36);
	background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(9, 90, 121, 1) 39%, rgba(0, 212, 255, 1) 100%) !important;
	background-size: cover;
	background-position: 200%;
	background-repeat: no-repeat;
	background-size: 100%;
	background-position: 200%;
}

.card {
	background-color: grey;
	box-shadow: 5px 5px 4px 4px olive;
}

.btn {
	color: purple;
}
</style>
</head>
<body>
	<div class="container">

		<form  class="d-flex flex-column justify-content-center">
			<br> <br> <br>

			
				<div class="card card-body text-center " style="width: 90%;">
					<a href="insert1.jsp" class="btn btn- bg-info  " name="button"
						target="frame2">Insert</a>
				</div>
				<br>
				<div class="card card-body text-center " style="width: 90%;">
					<a href="delete1.jsp" class="btn btn- bg-info " name="button"
						target="frame2">Delete</a>
				</div>
				<br>
				<div class="card card-body text-center " style="width: 90%;">
					<a href="update1.jsp" class="btn btn- bg-info  " name="button"
						target="frame2">Update</a>
				</div>
				<br>
				<div class="card card-body text-center " style="width: 90%;">
					<a href="find1.jsp" class="btn btn- bg-info " name="button"
						target="frame2">Search</a>
				</div>

				</form>

		</form>
	</div>
</body>
</html>
