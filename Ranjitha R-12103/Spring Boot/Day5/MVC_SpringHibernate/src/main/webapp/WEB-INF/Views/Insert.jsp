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
		var sid = document.getElementById("sid").value;
		var sname = document.getElementById("sname").value;
		var scity = document.getElementById("scity").value;
		

		if (sid == "") {
			alert("sid cannot be empty");
		} else if (sname == "") {
			alert("sname cannot be empty");
		} else if (scity == "") {
			alert("scity cannot be empty");

	}
	}
</script>

</head>
<body>
<br>
	<br>
	<form action="InsertionStud" method="post" autocomplete="on" modelAttribute="bean">
		<font size="5px" color="black">
			<center>
				
					<h5 >
						<b>Insert Student Details</b>
					</h5>
					<table  align="center" id="tbl">
						<tr>
							<td id="txt">Student ID:</td>
							<td><input type="text" name="sid" id="sid"
								required="required" ></td>
						</tr>
						<tr>
							<td id="txt">Student Name:</td>
							<td><input type="text" name="sname" id="sname"
								required="required"></td>
						</tr>
						<tr>
							<td id="txt">Student City:</td>
							<td><input type="text" name="scity" id="scity"
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
	<%
	String msg=(String)request.getAttribute("msg");
	if(msg!=null ){
		out.println("<center><h3><b>"+msg+"<b><h3></center>");
	}
	
	%>
</body>
</html>