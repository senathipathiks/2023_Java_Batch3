<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
	font-family: monospace;
	
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
	var bookid = document.getElementById("bookid").value;
	var bookname = document.getElementById("bookname").value;
	var bookauthor = document.getElementById("bookauthor").value;
	

	if (bookid == "") {
		alert("bookid cannot be empty");
	} else if (bookname == "") {
		alert("bookname cannot be empty");
	} else if (bookauthor == "") {
		alert("bookauthor cannot be empty");

}
}
</script>

</head>
<body>
	<br>
	<br>
	<form action="Updation" method="post" autocomplete="on">
		<font size="5px" color="black">
			<center>
				
					<h5 >
						<b>Update Book Details</b>
					</h5>
					<table border="3" color="black" align="center" id="tbl">
						<tr>
							<td id="txt">BookID:</td>
							<td><select type="text" name="bookid" id="bookid"
								required="required">
								<c:forEach items="${idList}" var="id">
								<option>${id }</option>
								</c:forEach>
								</select></td>
								
						</tr>
						<tr>
							<td id="txt">BookName:</td>
							<td><input type="text" name="bookname" id="bookname"
								required="required"></td>
						</tr>
						<tr>
							<td id="txt">BookAuthor:</td>
							<td><input type="text" name="bookauthor" id="bookauthor"
								required="required"></td>
						</tr>
						
						<tr>
							<td colspan="2"><center>
									<input type="submit" class="btn btn-success btn-lg btn-block"
										value="Update" name="button" onclick="Validation()" id="colr1"></td>
							</center>
						</tr>
					</table>
				
			</center>
		</font>
	</form>
</body>
</html>