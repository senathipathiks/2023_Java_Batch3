<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>   	        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body {
	background-color: #A7BEAE;
}
#hide{
display:none;
}
</style>
</head>
<body>
<h1>FindAll Operation</h1>

<div class='card card-body' id='output'>
<form action="AddEmployee" method="post" >
<input type="submit" value="AddEmployee" class="btn btn-success" >
</form>
<br>
<h5 class='card-header bg-primary'>Record</h5>
<table class='table table-dark table-hover'>
<tr>
<td><b>Employee ID</b></td>
<td><b>Employee Name</b></td>
<td><b>Employee Salary</b></td>
<td><b>Employee Department</b></td>
<td><b>Employee Domain</b></td>
<td><b>Employee MobileNo.</b></td>
<td><b>Employee Blood Group</b></td>
<td><b>Action</b></td>
<td><b>Delete</b></td>
</tr>

<c:if test="${ msg == 'FindAll' }">

<c:forEach items="${EmpList}" var="emp">
<tr>
<form action="Edit" method="post">
<td id="hide" ><input type="text" name="empId" value="${emp.empId}"></td>
<td>${emp.empId }</td>
<td>${emp.empName }</td>
<td>${emp.empSalary }</td>
<td>${emp.empDeprt }</td>
<td>${emp.empDomain }</td>
<td>${emp.empPh }</td>
<td>${emp.empBlood }</td>
<td><input type="submit" value="Edit" class="btn btn-warning" ></td>
</form>
<form action="Remove" method="post">
<td id="hide" ><input type="text" name="empId" value="${emp.empId}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger" ></td>
</form>
</tr>
</c:forEach>
</c:if>



<c:if test="${msg == 'Edit' }">

<c:forEach items="${EmpList}" var="emp">
<tr>
<form action="Save" method="post">
<td id="hide" ><input type="text" name="empId" value="${emp.empId}"></td>
<td>${emp.empId }</td>

<c:if test="${id == emp.empId }">
<td><input type="text" name="empName" value="${emp.empName }" ></td>
<td><input type="text" name="empSalary" value="${emp.empSalary }" ></td>
<td><input type="text" name="empDeprt" value="${emp.empDeprt }" ></td>
<td><input type="text" name="empDomain" value="${emp.empDomain }" ></td>
<td><input type="text" name="empPh" value="${emp.empPh }" ></td>
<td><input type="text" name="empBlood" value="${emp.empBlood }" ></td>
<td><input type="submit" value="Save" class="btn btn-primary" ></td>
</form>

</c:if>

<c:if test="${id != emp.empId }">
<td>${emp.empName }</td>
<td>${emp.empSalary }</td>
<td>${emp.empDeprt }</td>
<td>${emp.empDomain }</td>
<td>${emp.empPh }</td>
<td>${emp.empBlood }</td>
<td><input type="submit" value="Edit" class="btn btn-warning" ></td>
</form>
<form action="Remove" method="post">
<td id="hide" ><input type="text" name="empId" value="${emp.empId}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger" ></td>
</form>
</c:if>
</tr>
</c:forEach>




</c:if>

<c:if test="${ msg == 'Insert' }">

<c:forEach items="${EmpList}" var="emp">
<tr>
<form action="Edit" method="post">
<td id="hide" ><input type="text" name="empId" value="${emp.empId}"></td>
<td>${emp.empId }</td>
<td>${emp.empName }</td>
<td>${emp.empSalary }</td>
<td>${emp.empDeprt }</td>
<td>${emp.empDomain }</td>
<td>${emp.empPh }</td>
<td>${emp.empBlood }</td>
<td><input type="submit" value="Edit" class="btn btn-warning" ></td>
</form>
<form action="Remove" method="post">
<td id="hide" ><input type="text" name="empId" value="${emp.empId}"></td>
<td><input type="submit" value="Remove" class="btn btn-danger" ></td>
</form>
</tr>
</c:forEach>

<tr>
<form action="InsertValue" method="post" >
<td><input type="text" name="empId" value="${emp.empId}"></td>
<td><input type="text" name="empName" value="${emp.empName }" ></td>
<td><input type="text" name="empSalary" value="${emp.empSalary }" ></td>
<td><input type="text" name="empDeprt" value="${emp.empDeprt }" ></td>
<td><input type="text" name="empDomain" value="${emp.empDomain }" ></td>
<td><input type="text" name="empPh" value="${emp.empPh }" ></td>
<td><input type="text" name="empBlood" value="${emp.empBlood }" ></td>
<td><input type="submit" value="Insert" class="btn btn-success" ></td>
</form>
</tr>
</c:if>

</table>
</div>
</body>
</html>