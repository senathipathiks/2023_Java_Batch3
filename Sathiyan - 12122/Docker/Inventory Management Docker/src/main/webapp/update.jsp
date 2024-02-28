<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Update Page</title>
<link href="styles.css" rel="stylesheet">
</head>
<body>
<div class="bg-image"></div>
	<form action="InsertServlet" method="post">
		<div class="bg-text">
			<input id="inputbox" type="text" name="id" placeholder="Product ID"><br>
			<input id="inputbox" type="text" name="name" placeholder="Product Name"> <br>
			<input id="inputbox" type="text" name="stock" placeholder="Item in Stock"><br>
			<input id="inputbox" type="text" name="manufacturer" placeholder="Manufacturer Name"><br>
			<input id="inputbox" type="text" name="mfg" placeholder="MFG Date"><br>
			<input id="inputbox" type="text" name="price" placeholder="Price"><br>
			<input id="inputboxbtn" type="submit" class="btn btn-light btn-lg" value="Update" name="button">
		</div>
	</form>

</body>
</html>