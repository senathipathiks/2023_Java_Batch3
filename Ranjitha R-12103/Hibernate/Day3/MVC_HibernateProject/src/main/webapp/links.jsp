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
	
	background-color:teal;
}

#colr2 {
	background: linear-gradient(to right, #C0C0C0, #808080);
}

#txt {
	font: bold;
}
</style>

</head>
<body>
<form action="HibernateServlet" method="post">

		<center>
			<br> <font size="5px" color="orange"> <a
				href="Insert.jsp" class="btn btn-primary btn-lg" name="button"
				target="frame2" >Insert</a> <br>
			<br>
			<br> <a href="Update.jsp" class="btn btn-success btn-lg"
				name="button" target="frame2" >Update</a> <br>
			<br>
			<br> <a href="delete.jsp" class="btn btn-danger btn-lg"
				name="button" target="frame2" >Delete</a> <br>
			<br>
			<br> <a href="Find.jsp" class="btn btn-dark btn-lg"
				name="button" target="frame2" >Find</a> <br>
			</font>
		</center></form>
</body>
</html>