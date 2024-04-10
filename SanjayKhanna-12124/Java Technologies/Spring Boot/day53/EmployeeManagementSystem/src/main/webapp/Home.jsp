<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style>
body{
background-image: url('https://watermark.lovepik.com/photo/50101/5995.jpg_wh1200.jpg');
background-size: cover;
margin-left: 160px;
margin-top: 30px;
}
#display{
	border-radius: 5px;
  background-color: rgba(255,255,255);
  padding: 20px;
  width: 1200px;
  height: auto;
}
a{
padding-left: 10px;
}
</style>
</head>
<body>
<div id="display">
<div class="text-center shadow p-3 bg-body rounded h3 mb-3">No of Record : ${EmpList.size()}</div>
<table class="table table-bordered table-hover text-center shadow">
 <thead>
    <tr class="table-primary">
      <th scope="col" class="col-3">Employee Id</th>
      <th scope="col" class="col-3">Employee Name</th>
      <th scope="col" class="col-3">Employee Salary</th>
      <th scope="col" class="col-3">Action</th>
    </tr>
  </thead>
 <tbody>
 <c:forEach items="${EmpList}" var="emp">
 <c:choose>
 <c:when test="${bean != null && bean.empId == emp.empId }">
 <form action='SaveUpdate' method='post'>
 <tr>
 <td><div class='form-floating'><input type='text' class='form-control' name='empId' placeholder='EmployeeId' value='${emp.empId}'readonly><label for='empId'>Employee Id</label></div></td>
 <td><div class='form-floating'><input type='text' class='form-control' name='empName' placeholder='EmployeeName' value='${emp.empName}' autocomplete='off'><label for='empName'>Employee Name</label></div></td>
 <td><div class='form-floating'><input type='text' class='form-control' name='empSalary' placeholder='EmployeeSalary'  value='${emp.empSalary}' autocomplete='off'><label for='empSalary'>Employee Salary</label></div></td>
 <td><button class='btn btn-success ms-2' type='submit' name='action' id='butt'><i class='bi bi-save'></i> save</button><a href='back'><button type='button' class='btn btn-success ' id='butt'><i class='bi bi-arrow-left'></i> Back</button></a></td>
 </tr>
 </form>
 </c:when>
 <c:when test="${emp != null }">
 <tr><td>${emp.empId}</td><td>${emp.empName}</td><td>${emp.empSalary}</td><td><a href='findall?action=edit&empId=${emp.empId}' target='Operation'><button class='btn btn-primary'><i class='bi bi-pencil-square'></i> edit</button></a><a href='findall?action=delete&empId=${emp.empId}' target='Operation'><button class='btn btn-danger'><i class='bi bi-trash'></i>delete</button></a></td></tr>
 </c:when>
 </c:choose>
</c:forEach>
 <form action='AddEmployee' method='post'>
 <tr>
 <td><div class='form-floating'><input type='text' class='form-control' name='empId' placeholder='EmployeeId' autocomplete='off' required="required"><label for='empId'>Employee Id</label></div></td>
 <td><div class='form-floating'><input type='text' class='form-control' name='empName' placeholder='EmployeeName'  autocomplete='off'  required="required"><label for='empName'>Employee Name</label></div></td>
 <td><div class='form-floating'><input type='text' class='form-control' name='empSalary' placeholder='EmployeeSalary'  autocomplete='off'  required="required"><label for='empSalary'>Employee Salary</label></div></td>
 <td><button type="submit" class="btn btn-success" name="button" id="newbutt"><i class="bi bi-plus-square"></i> Insert</button></td>
 </tr>
 </form>
 
 </tbody>
</table>
</div>
</body>
</html>