<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
	body{
	background-image: url("https://www.google.com/url?sa=i&url=https%3A%2F%2Fcommunications.catholic.edu%2Fmagazine%2Fwinter-2021%2Ffaculty-essay.html&psig=AOvVaw1lCql-k91WXRuaanrAMRgm&ust=1707629909420000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCMiP6LOHoIQDFQAAAAAdAAAAABAE");
	background-image: url("b2.jpg");
	background-repeat: no-repeat;
	background-position: absolute;
	background-size: 1300px;
	}
	</style>
</head>
<body>
<br>
	<br>
	<br>
	<br>
	<form action="InsertServlet" method="post">
		<font size="5px" color="white">
			<table border="1" align="center">
				<tr>
					<td>Student ID:</td>
					<td><input type="text" name="sid"></td>
				</tr>
				<tr>
					<td>Student Name:</td>
					<td><input type="text" name="sname"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input type="text" name="scity"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit"
						class="btn btn-secondary btn-lg" value="Update" name="button"></td>
				</tr>
			</table>
		</font>
	</form>
</body>
</html>