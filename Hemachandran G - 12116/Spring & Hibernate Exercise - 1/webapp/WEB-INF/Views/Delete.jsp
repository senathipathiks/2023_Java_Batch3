<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
<style type="text/css">
body{
text-align: center;
}
</style>
</head>
<body>
<br><br><br><br>
<form action="Deletion" >
<font size="5px" color="blue">
<table border="1" align="center">
<tr>
<td>Bike ID:</td>
<td><select name="sID">
<c:forEach items="${idList}" var ="id">

<option>${id } </option>

</c:forEach>
</select>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="Delete" name="button">
</tr>
</table>

</font>

</form>

</body>
</html>