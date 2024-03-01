<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
body {
	background-color: teal;
}

h5 {
	text-shadow: 1px 2px;
}

#colr2 {
	background: linear-gradient(to right, #C0C0C0, #808080);
}

#txt {
	font: bold;
}
</style>
<script>
	function Validation() {
		var sid = document.getElementById("sid").value;
		if (sid == "") {
			alert("sid cannot be empty");
		}
	}
</script>
</head>
<body>
	<br>
	<br>
	<form action="HibernateServlet" method="post">
		<font size="5px" color="black">
			<center>
				<div class="card card-body card-center" style="width: 500px"
					id="colr2">
					<h5 class="card-title">
						<b>Delete Student Details</b>
					</h5>
					<table border="3" color="black" align="center">
						<tr>
							<td id="txt">SID:</td>
							<td><input type="text" name="sid" required="required"
								id="sid"></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit"
								class="btn btn-danger btn-lg btn-block" value="Delete"
								name="button" onclick="Validation()" id="colr1"></td>
						</tr>
					</table>
				</div>
			</center>
		</font>
	</form>
</body>
</html>