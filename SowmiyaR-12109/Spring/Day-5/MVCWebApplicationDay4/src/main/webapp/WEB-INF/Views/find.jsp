<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image: url("https://t3.ftcdn.net/jpg/03/55/60/70/360_F_355607062_zYMS8jaz4SfoykpWz5oViRVKL32IabTP.jpg");
background-repeat: no-repeat;
background-size: cover;
}
.Table{
border:6px solid thin;
background-color: silver;
height:200px;
width:450px;
border-radius: 50px;
}
 
#button{
text-align: center;
}
td{
font-weight: bold;
}
 
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<br><br><br><br><center>
<form action="Find" method="post" modelAttribute="bean">
<font size="5px" color="black">
 
<table border="1" align="center">
<tr>
<td>Student Id: </td>
<td><select name="sid">
<c:forEach items="${idList}" var="id">
<option>${id}</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td colspan="2" id="button"><input type="submit" class="btn btn-info btn-lg" value="FIND" name="button">
</td>
</tr>
 
 
 </table>
 </font>
 </form>
 </center>
</body>
</html>