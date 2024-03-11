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
</head>
<body>
<h1>FindAll Operations</h1>
<div class="card card-body"><table class="table table-dark table-hover">
<tr>
<td>Room ID</td>
<td>Room Type</td>
<td>Room Tariff</td>
<td>Room Description</td>
<td>Room Occupany</td>
</tr>

<c:forEach items="${all}" var="val">
			<tr>
			<td>${val.rmid}</td>
			<td>${val.rmtype}</td>
			<td>${val.rmtariff}</td>
			<td>${val.rmdesc}</td>
			<td>${val.rmoccup}</td>
			</tr>
			</c:forEach>
			</table>
			
</div>

</body>
</html>