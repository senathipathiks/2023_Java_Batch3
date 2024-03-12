<%-- <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="jakarta.tags.core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style type="text/css">
td{
height:40px;
}
input{
height :40px;
width:300px;
border-radius :20px
}
/* .button{

border:none;
background-color: green;
color:white;
font-weight:bold
} */
</style>
</head>
<body>
<div class="form-group">
<form action="PerfromInsert" method="post">
<div class="form-group">
<table width="10%" align="center" border="0">
<tr><td>Employee Id:</td><td><input type="text" name="empId" required="required" pattern={.4}/></td></tr>
<tr><td>Employee Name:</td><td><input type="text" name="empName" required="required" pattern={A-Z,a-z}/></td></tr>
<tr><td>Employee Salary:</td><td><input type="text" name="empSalary" required="required" pattern={0-9}/></td></tr>
<tr><td align="center"><input class="btn btn-primary" type="submit" value="InsertEmployee" name="emsAction" required="required"/></td></tr>
</table>

<center><b>${msg}</b></center>

</form>
</div>
<br>
</body>
</html>