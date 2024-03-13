<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-color:rgb(143, 188, 143);
background-size: cover;
font-size: 16px;
margin-left: 20%;
margin-top: 20px;
font-weight: bold;
margin-right: 20%;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div  class="card">
<div class="card-header bg-success text-center"><h5>Update Coffee Shop Management System Details:</h5></div>
<div class="card-body" style="background-color:orange">
<form action="Updation" method="post" modelAttribute="bean">
<center>
<table style="border:none;">
<tr><td>Enter Shop Id </td><td> <select name="id"><c:forEach items="${idList}" var="id"><option>${id}</option>
</c:forEach>
</select><td><input class="btn btn-success btn-md" type='submit' value='Fetch' name="button"/> </td></tr>
<tr><td>Enter ShopName </td><td> <input type="text" name="ShopName" autocomplete="off" placeholder="Enter ShopName"/> </td></tr>
<tr><td>Enter Address  </td><td> <input type="text" name="Address" autocomplete="off" placeholder="Address "/></td><tr>
<tr ><td>Enter PhoneNo  </td><td> <input  type="text" name="PhoneNo" autocomplete="off" placeholder="Enter PhoneNo "/> </td></tr>
<tr><td>Enter E-mail  </td><td> <input type="text" name="Email" autocomplete="off" placeholder="Enter Email"/> </td></tr>
<tr><td>Enter Rating  </td><td> <input type="text" name="Rating" autocomplete="off" placeholder="Enter Rating "/></td><tr>
<tr><td>Enter Proprietor  </td><td> <input type="text" name="Proprietor" autocomplete="off" placeholder="Enter Proprietor "/></td>
<td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Update"/> </td></tr>
</table>
</center>
</form>
</div>
</div>
</body>
</html>
