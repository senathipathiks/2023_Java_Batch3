<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
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
		var emailregex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		
		var eid=document.getElementById("empid").value;
		var ename=document.getElementById("empname").value;
		var eemail=document.getElementById("email").value;
		var ecity=document.getElementById("city").value;
		
		if(eid==""){
			alert("Employee id cannot be empty");
		}
		else if(ename==""){
			alert("Employee name cannot be empty");
		}
		else if(eemail==""||! eemail.match(emailregex)){
			alert("Enter valid email id");
		}
		else if(ecity==""){
			alert("City cannot be empty");
		}
		
	}
    </script>
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Update Employee</h4></div>
  <div class="card-body">
  
  <form action="EmployeeServletFile" method="post">
  
  <div class="form-group">
 	 <label for="empid">Employee Id:</label><br>
    <input type="text" class="form-control" id="empid" name="empid"  style="width: 18rem"><br>
  
    <label for="empnname">Employee Name:</label><br>
    <input type="text" class="form-control" id="empname" name="empname"  style="width: 18rem"><br>
	
	 <label for="email">Email:</label><br>
    <input type="email" class="form-control" id="email" name="email"  style="width: 18rem"><br>
    
    <label for="city">City:</label><br>
    <input type="text" class="form-control" id="city" name="city"  style="width: 18rem"><br>
    
    <input class="btn btn-warning" type="submit" value="Update" name="button"  style="width: 5rem"  onmousedown="Validation()">
    

 </div>
  
</form>
    
  </div>
</div>

</body>
</html>