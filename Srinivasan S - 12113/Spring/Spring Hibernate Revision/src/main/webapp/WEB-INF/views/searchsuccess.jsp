<%@page import="com.revision.bean.Library"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Success</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<style >

#div1{
margin-bottom: 50%;
position: absolute;
left: 38%;}

table {
  border-collapse: collapse;
  
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
	
}	
</style>
</head>
<body>


<%="<br><div id=\"div1\" class=\"card card-body w-70 shadow p-3 mb-5 bg-white rounded\"><h4>Record founded Successfully</h4></div>" %>
<br><br><br><br><br><br>
<table   id=div1 class="card card-body shadow p-3 mb-5 bg-white rounded" align="center" border=1 box-shadow: 10px 10px 5px  >
<tr>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Author</th>
</tr>
<c:forEach items="${bean}" var="bean">
<tr>
<td>${bean.lid}</td>
<td>${bean.lname}</td>
<td>${bean.lauthor}</td>
</tr>

</c:forEach>
</table>

</body>
</html>
