<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="perform-addition">
		Enter number 1 <input type="text" name="n1"> <br>
		Enter number 2 <input type="text" name="n2"> <input type="submit" value="Addition">
	</form>
	
	<br>
	Addition : ${Sum}
</body>
</html>