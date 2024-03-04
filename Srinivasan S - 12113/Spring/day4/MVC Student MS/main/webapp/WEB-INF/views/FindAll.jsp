<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All</title>

<style >

#div1{
margin-bottom: 50%;
position: absolute;
left: 38%;
top: 10%;
}	

table {
  border-collapse: collapse;
  
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}

</style>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<table   id=div1 class="card card-body shadow-lg p-3 mb-5 bg-white rounded"; border=3; box-shadow: 10px 10px 5px  >
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Student City</th>
</tr>
<c:forEach items="${beanlist}" var="bean">
<tr>
<td>${bean.getSid()}</td>
<td>${bean.getSname()}</td>
<td>${bean.getCity()}</td>
</tr>

</c:forEach>
</table>
</body>
</html>