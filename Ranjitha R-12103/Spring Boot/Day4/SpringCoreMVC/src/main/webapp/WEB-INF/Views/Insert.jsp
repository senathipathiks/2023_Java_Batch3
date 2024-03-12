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
	font-family:monospace;
	
}
#tbl{
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
input{
width: 300px;
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
	<form action="Insertion" method="post" autocomplete="on">
		<font size="5px" color="black">
			<center>
				
					<h5 >
						<b>Insert Book Details</b>
					</h5>
					<table  align="center" id="tbl">
						<tr>
							<td id="txt">BookID:</td>
							<td><input type="text" name="bookid" id="bookid"
								required="required" ></td>
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
							<td colspan="2"><center><br>
									<input type="submit" class="btn btn-primary btn-lg "
										value="Insert" name="button" onclick="Validation()" id="colr1"></td>
							</center>
						</tr>
					</table>
				
			</center>
		</font>
	</form>
</body>
</html>