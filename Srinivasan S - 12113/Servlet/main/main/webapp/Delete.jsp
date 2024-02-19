<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>

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
    
    </style>
    
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Add Employee</h4></div>
  <div class="card-body">
  
  <form action="EmployeeServletFile" method="post">
  
  <div class="form-group">
  
   
    <label for="empid">Employee Id:</label>
    <input type="text" class="form-control" id="empid" name="empid" ><br>
    
    <input class="btn btn-danger" type="submit" value="Delete" name="button">
    

</div>
  
</form>
    
  </div>
</div>
</body>
</html>