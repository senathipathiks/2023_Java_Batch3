<%@page import="com.ems.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-color: #EDEADE;

  font-size: 16px;
  margin-left: 30%;
  margin-top: 110px;
  font-weight: bold;
  opacity: 0.9;
}

body:hover {
  opacity: 9.0;
}

.card {
  border: none;
  border-radius: 10px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  background-color: rgba(255, 255, 255, 0.8);
  padding: 20px;
  margin-top: 50px;
}

.card-header {
  background-color: #007bff;
  color: white;
  border-radius: 5px 5px 0 0;
  padding: 10px;
  margin-bottom: 20px;
}

.card-body {
  padding: 0;
}

table {
  width: 100%;
  border-collapse: collapse;
}

th,
td {
  padding: 10px;
  border-bottom: 1px solid #ddd;
}

th {
  font-weight: bold;
  text-align: left;
}

input[type="text"] {
  width: 100%;
  padding: 10px;
  border: none;
  border-radius: 5px;
  box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.1);
  font-size: 16px;
  margin-bottom: 10px;
}

input[type="submit"] {
  background-color:#E41B17;
  color: white;
  border: none;
  border-radius: 5px;
  padding: 10px 20px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

input[type="submit"]:hover {
  background-color: #8B0000;
}
</style>
</head>
<body>

<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Employee Details to Delete : </h5></div>
<div class="card-body ">
<form action="FindEmployeeByName" >
 <table style="border:none; width: 100%;">

<tr>

<td style="padding: 10px; vertical-align: top;">
<table style="width: 100%;">
<tr>
<td style="padding: 5px;"><label>Enter Employee ID:</label></td>
<td >
<select class="form-control" name="ename"  required="required"> 
<option value="">select Name to View Details</option>
<c:forEach var="id" items="${nameList}">

<option value="${id}">${id}</option>

</c:forEach>
</select>
</td>
</tr>

<td colspan="2" style="text-align: right; padding: 10px;">
<input type="submit"  class="btn btn-primary btn-md" name="button" value="Find"/>
</td>
</tr>
</table>
</form>


<c:if test="${emp != null}">
<table>
<th>Employee ID</th>
<th>Employee Name</th>
<th>Employee Salary</th>
<tbody>
<c:forEach var="emp" items="${emp}">
<tr>
<td>${emp.getEid()}</td>	
<td>${emp.getEname()}</td>
<td>${emp.getEsalary()}</td>
</tr>
</c:forEach>

</tbody>
</table>
</c:if>



</div>
</div>
</body>
</html>

