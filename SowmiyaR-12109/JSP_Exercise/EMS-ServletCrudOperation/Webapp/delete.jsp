<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
<style>

 body{
  background-repeat: no-repeat;
 background-size: cover;
  padding-left: 310px;
 }
 .Table{
border:6px solid thin;
background-color: silver;
}
 #delete{
 text-align: center;
 }
h5{
color:black;
text-shadow: 1px 2px silver;
}
#id{
background-color: transparent;

}
</style>
</head>
<body>
<br><br><br><br>
<div id="id" style="width:70%">
<h5 ><i><center>DELETE EMPLOYEE DETAILS</center></i></h5>
<form action="InsertServletEmp" method="post">
<font size="5px" color="black">
<table border="4" align="center" class="Table">
<tr>
<td><h4> Employee ID</h4></td>
<td><input type="text" name="id" required></td>
</tr>
<tr id="delete">
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="DELETE" name="button">
</tr>
</div>
</table>

</font>

</form>

</body>
</html>