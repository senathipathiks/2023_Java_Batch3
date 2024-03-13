<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-color:rgb(143, 188, 143);
background-size: cover;
font-size: 16px;
margin-left: 30%;
margin-top: 45px;
font-weight: bold;
margin-right: 30%;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div  class="card ">
<div class="card-header bg-success text-center"><h5>Insert Hotel Details: </h5></div>
<div class="card-body " style="background-color:orange" >
<form action="insertemployee" method="post" modelAttribute="bean">
<table >
<tr><td>Enter Employee Id </td><td><input type="text" name="empId" /></td></tr>
<tr><td>Enter Employee Name </td><td><input type="text" name="empName" /></td></tr>
<tr><td>Enter Employee Salary </td><td><input type="text" name="empSalary" /></td></tr>
<tr><td colspan="2" algin="right"><input type="submit" class="btn btn-success" value="Insert" name="button" /></td></tr>
</table>
<% String msg = (String)request.getAttribute("msg");
if(msg != null ){
	out.print("<h1 style='font-size:30px' class='bg-success text-center'>"+msg+"</h1>");
}
%>
</form>
</div>
</div>
</body>
</html>
