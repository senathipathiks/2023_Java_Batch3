<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<br><br><br><br>
<form action="Find">
<font size="5px" color="green">
<table border="1" align="center">
<tr>
<td>Student ID: </td>
<td><select name="sid">
<c:forEach items="${idList1}" var="id">

<option>${id}</option>

</c:forEach>
</select>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn btn-primary btn-lg" value="Find" name="button"></td>

</tr>

</table>
</font>
</form>
</body>
</html>