<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC</title>
</head>
<body>
<h2>Submitted Student Information</h2>
<table style="font-size: 24px">
<tr><td>Name</td><td>:${stu.name}</td></tr>
<tr><td>Age</td><td>:${stu.age}</td></tr>
<tr><td>Gender</td><td>:${stu.gender}</td></tr>
</table>
</body>
</html>