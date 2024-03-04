<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome MVC form handling</title>
</head>
<body>
<h2 style="margin-left: 35%">Submitted Student Information</h2>

<table style="position: absolute;left: 45%";border="2px">

<tr>
<td>Id: </td>
<td>${id}</td>
</tr>

<tr>
<td>Name: </td>
<td>${name}</td>
</tr>

<tr>
<td>Age: </td>
<td>${age}</td>
</tr>


</table>
</body>
</html>