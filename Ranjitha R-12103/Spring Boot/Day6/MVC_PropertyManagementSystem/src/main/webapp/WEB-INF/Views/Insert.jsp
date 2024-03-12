<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
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
 body{
    
    font-family: monospace;
    background-image: url("https://img.freepik.com/free-photo/abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner_1258-52393.jpg");
    
    }
#tbl {
	border: 2px solid black;
	padding-top: 10px;
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

input {
	width: 300px;
}
td,b{
color: white;
}
</style>

<script type="text/javascript">
	function Validation() {
		var PropId = document.getElementById("PropId").value;
		var PropName = document.getElementById("PropName").value;
		var PropType = document.getElementById("PropType").value;
		var City = document.getElementById("City").value;
		var Country = document.getElementById("Country").value;
		var YearOfPurchase = document.getElementById("YearOfPurchase").value;
		var Seller = document.getElementById("Seller").value;

		if (PropId == "") {
			alert("PropId cannot be empty");
		} else if (PropName == "") {
			alert("PropName cannot be empty");
		} else if (PropType == "") {
			alert("PropType cannot be empty");

		} else if (City == "") {
			alert("City cannot be empty");

		} else if (Country == "") {
			alert("Country cannot be empty");

		} else if (YearOfPurchase == "") {
			alert("YearOfPurchase cannot be empty");

		} else if (Seller == "") {
			alert("Seller cannot be empty");

		}
	}
</script>

</head>
<body>
	<br>
	<br>
	<form action="InsertionProp" method="post" autocomplete="on"
		modelAttribute="bean">
		<font size="5px" color="black">
			<center>

				<h5>
					<b color="white">Insert Property Details</b>
				</h5>
				<table align="center" id="tbl" color="white">
					<tr>
						<td id="txt">Property ID:</td>
						<td><input type="text" name="PropId" id="PropId"
							required="required"></td>
					</tr>
					<tr>
						<td id="txt">Property Name:</td>
						<td><input type="text" name="PropName" id="PropName"
							required="required"></td>
					</tr>
					<tr>
						<td id="txt">Property Type:</td>
						<td><input type="text" name="PropType" id="PropType"
							required="required"></td>
					</tr>
					<tr>
						<td id="txt">City:</td>
						<td><input type="text" name="City" id="City"
							required="required"></td>
					</tr>
					<tr>
						<td id="txt">Country:</td>
						<td><input type="text" name="Country" id="Country"
							required="required"></td>
					</tr>
					<tr>
						<td id="txt">YearOfPurchase:</td>
						<td><input type="text" name="YearOfPurchase"
							id="YearOfPurchase" required="required"></td>
					</tr>
					<tr>
						<td id="txt">Seller:</td>
						<td><input type="text" name="Seller" id="Seller"
							required="required"></td>
					</tr>

					<tr>
						<td colspan="2"><center>
								<br> <input type="submit" class="btn btn-primary btn-lg "
									value="Insert" name="button" onclick="Validation()" id="colr1"></td>
						</center>
					</tr>
				</table>

			</center>
		</font>
	</form>
	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null) {
		out.println("<center><h3><b>" + msg + "<b><h3></center>");
	}
	%>
</body>
</html>