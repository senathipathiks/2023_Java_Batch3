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
<style>
body{
background-image: url("https://wallpaperaccess.com/full/4707312.jpg");
background-repeat: no-repeat;
background-size: 100%;
}
table{
 color: black;
 font-weight: bold;
}
#btn1{
   margin-left: 45%;
}
table{
border: 4px solid ;
border-radius:20px;
box-shadow: 0 4px 12px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);

}
</style>

</head>
<body>
<br><br><br><br>
<form action="Deletion" modelAttribute="bean">
<font size="5px" color="purple">
<table border="3" align="center">
<tr>
<center><b>Delete Book Details</b></center><br>
</tr>
<tr>
<td>Book ID: </td>
<td>

<select name="bid" class="table-secondary">
<c:forEach items="${idList}" var="id">

<option>${id}</option>

</c:forEach>
</select>
</td>
</tr>
<tr>

<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="Delete" onmousedown="Validation()" name="button"></td>
</tr>

</table>
</font>
</form>
</body>
</html>