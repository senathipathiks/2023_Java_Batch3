<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="d-flex justify-content-center">
	<h2 style="margin-left:35%">Submitted Student Information</h2><br/>
	<table style="position:absolute;margin-left:40% ">
		<tr>
			<td>Name :</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Age :</td>

			<td>${age}</td>
		</tr>
	</table>
</body>
</html>