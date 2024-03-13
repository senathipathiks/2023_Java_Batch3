<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>	
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    
    <style >
    #card{
     width: 40%;
    
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%)
    }
   ::placeholder {
  font-style:normal;
   
 } 
 
 #but{
 line-height: 25px;
     width: 18px;
     font-size: 12pt;
     font-family: tahoma;
     margin-top: 12px;
     margin-right: 50px;
     position:absolute;
     top:0;
     right:0;
 }
    </style>
    
    
</head>
<body >
<div class="container-fluid">
<div class="container-fluid col-sm-3 card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Add Employee Details </h4></div>
  <div class="card-body">
  
  <form  action="Insertion" class="container-fluid" modelAttribute="bean">
  
  <div class="container-fluid form-group">
  

    <label for="ename">Employee Name:</label><br>
    <input type="text" id="ename" class="form-control" name="ename" style="width: 18rem"  placeholder="Enter Name"  required="required"><br>
	
	 <label for="edesig">Employee Designation:</label><br>
    <input type="text" id="edesig" class="form-control" name="edesig" style="width: 18rem" placeholder="Enter Designation" required="required"><br>
    
    <label for="ecity">Employee City:</label><br>
    <input type="text" id="ecity" class="form-control" name="ecity" style="width: 18rem" placeholder="Enter City" required="required"><br>
    
    <label for="esal">Employee Salary:</label><br>
    <input type="text" id="esal" class="form-control" name="esal" style="width: 18rem" placeholder="Enter Salary" required="required"><br>
          
    <input type="submit" id="but"  class="btn btn-primary pull-right" value="Add" name="button" style="width: 5rem" onmousedown="Validation()">
    
    
    </div>
  
</form>
    
  </div>
</div>
</div>

</body>
</html>