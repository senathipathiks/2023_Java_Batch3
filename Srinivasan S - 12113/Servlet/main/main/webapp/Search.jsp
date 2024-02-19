<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>

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
    
    <script type="text/javascript">
    
    function Validation() {
		
		
		var eid=document.getElementById("empid").value;
		
		
		if(eid==""){
			alert("Employee id cannot be empty");
		}
		
		
		
	}
    </script>
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Search Employee</h4></div>
  <div class="card-body">
  
  <form action="EmployeeServletFile" method="post">
  
  <div class="form-group">
    <label for="empid">Employee Id:</label>
    <input type="text" id="empId" class="form-control" name="empId"  style="width: 18rem" ><br>
    
    <input class="btn btn-success" id="empid" type="submit" value="Search" name="button"  style="width: 5rem" onmousedown="Validation()">
     <input class="btn btn-success" id="empid" type="submit" value="FindAll" name="button"  style="width: 5rem" >
    

</div>
  
</form>
    
  </div>
</div>

</body>
</html>