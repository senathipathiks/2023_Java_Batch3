<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
text-align: center;
margin-top: 100px;
}
table{
font-size: 24px;
background-color: gray;
padding: 5px 10px;
}
tr{
padding:10px 14px;
}
td{
padding:5px;
}
#insert2{
text-align: right;}
</style>
</head>
<body>
<form action="DeleteServlet" method="post">
<h3>Enter Student Id To Delete :</h3><br>
<table border="1" align="center">
<tr><td>Student Id </td><td>: <input type="text" name="stuId" /></td></tr>
<tr><td id="insert2"><input type="submit" class="btn btn-primary btn-lg" value="Delete" name="button" /></td></tr>
</table></form>
</body>
</html>