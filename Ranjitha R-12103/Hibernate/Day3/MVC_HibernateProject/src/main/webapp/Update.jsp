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

<script type="text/javascript">
	function Validation() {
		var sid = document.getElementById("sid").value;
		var sname = document.getElementById("sname").value;
		var sdept = document.getElementById("sdept").value;
		var address = document.getElementById("address").value;

		if (sid == "") {
			alert("sid cannot be empty");
		} else if (sname == "") {
			alert("sname cannot be empty");
		} else if (sdept == "") {
			alert("sdept cannot be empty");
		} else if (address == "") {
			alert("address cannot be empty");
		}
	}
</script>

</head>
<body>
	<br>
	<br>
	<form action="HibernateServlet" method="post" autocomplete="on">
		<font size="5px" color="black">
			<center>
				<div class="card card-body card-center" style="width: 500px"
					id="colr2">
					<h5 class="card-title">
						<b>Update Student Details</b>
					</h5>
					<table border="3" color="black" align="center" id="tbl">
						<tr>
							<td id="txt">SID:</td>
							<td><input type="text" name="sid" id="sid"
								required="required"></td>
						</tr>
						<tr>
							<td id="txt">SName:</td>
							<td><input type="text" name="sname" id="sname"
								required="required"></td>
						</tr>
						<tr>
							<td id="txt">SDept:</td>
							<td><input type="text" name="sdept" id="sdept"
								required="required"></td>
						</tr>
						<tr>
							<td id="txt">SAddress:</td>
							<td><input type="text" name="address" id="address"
								required="required"></td>
						</tr>

						<tr>
							<td colspan="2"><center>
									<input type="submit" class="btn btn-success btn-lg btn-block"
										value="Update" name="button" onclick="Validation()" id="colr1"></td>
							</center>
						</tr>
					</table>
				</div>
			</center>
		</font>
	</form>
</body>
</html>