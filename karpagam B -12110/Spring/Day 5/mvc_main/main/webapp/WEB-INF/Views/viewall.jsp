<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-image: url("https://wallpaperaccess.com/full/4707312.jpg");
background-repeat: no-repeat;
background-size: 100%;
}
table {
  border-collapse: collapse;
  
  
}
 
th, td {
  text-align: left;
  padding: 8px;
}
 
tr:nth-child(even) {background-color: #bcbc8f;


</style>
</head>
<body>
<center><h1><font color="cadetblue">Record fetched sucessfully !!</font></h1></center><br><br>
<font size="5px" color="black">
<table border="2" align="center">
<tr>
<th>Book Id</th>
<th>Book Title</th>
<th>Author Name</th>
</tr>
<c:forEach items="${beanlist}" var="bean">
<tr>
<td>${bean.getBid()}</td>
<td>${bean.getBname()}</td>
<td>${bean.getBuath()}</td>
</tr>
</c:forEach>
</table>



</font>

</body>
</html>