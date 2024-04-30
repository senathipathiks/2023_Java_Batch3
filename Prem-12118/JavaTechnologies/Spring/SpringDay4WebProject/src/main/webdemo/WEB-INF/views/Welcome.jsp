<%@taglib uri="http://www.springframework.org/tags" prefix="form" %>
  <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h1>Submitted Student Information</h1>
<table>
<tr>
<td>Name:</td>
<td>${name}</td>
</tr>
<tr>
<td>Age:</td>
<td>${age}</td>
</tr>
<tr>
<td>City:</td>
<td>${city}</td>
</tr>
</table>
</body>
</html>