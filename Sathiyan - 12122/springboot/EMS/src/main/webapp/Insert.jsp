<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@  taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style type="text/css">
td {
	padding: 18px 36px;
}

input {
	height: 40px;
	width: 300px;
	border-radius: 10px;
	font-size: 24px;
}

.button {
	border: none;
	background-color: gray;
	color: black;
	font-size: 30px;
	margin-left: 300px
}

.button:hover {
	background-color: blue;
	color: red;
}
</style>
</head>
<body>
	<div class="container-fluid" id="home">
		<div class="container" id="homepage">
			<div class="row" id="overallContainer">
				<div class="col-md-6 col-lg-6 col-sm-6" id="image">
					<img
						src="https://static.vecteezy.com/system/resources/previews/013/923/543/original/blue-car-logo-png.png"
						class="img-fluid" alt=""><br>
				</div>
				<div class="col-md-6">
					<br>
					<br>
					<br>
					<form action="Insertion" class="main" id="forms">
						<br>
						<br>
						<br> <input type="text" name="eid" class="form-control form-control-md" placeholder="Employee ID" required="required" /><br> 
						<input type="text" name="ename" class="form-control form-control-md" placeholder="Employee Name" required="required" /><br> 
						<input type="text" name="esalary" class="form-control form-control-md" placeholder="Employee Salary" required="required" /> <br>
						<center>
							<input type="submit" class="btn btn-primary" name="button" value="Insert" id="submit_btn" />
						</center>
					</form>
					<br> 
					<br>
					<center>
						<h3>${Msg }</h3>
					</center>
				</div>
			</div>
		</div>
	</div>



</body>
</html>