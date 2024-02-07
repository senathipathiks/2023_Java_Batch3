<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Upload</title>
</head>
<body>
<form action="FileServlet">
<table>
 <tr><td>Upload File : </td><td><input type="file" name="file"></td></tr>
<tr><td>Over Write : <input type="checkbox" value="checked" name="box"/></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>