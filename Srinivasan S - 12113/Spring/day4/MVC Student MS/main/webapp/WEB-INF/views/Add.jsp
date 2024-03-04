<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
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
    
    <script type="text/javascript">
    
function Validation() {
		
		var sid=document.getElementById("sid").value;
		var sname=document.getElementById("sname").value;
		var city=document.getElementById("city").value;
		
		
		if(sid==""){
			alert("Car id cannot be empty");
		}
		else if(sname==""){
			alert("Car model cannot be empty");
		}
		else if(city==""){
			alert("Car Type cannot be empty");
		}
				
	}
    </script>
    
</head>
<body >

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Add </h4></div>
  <div class="card-body">
  
  <form  action="Insertion" method="post" class="container-fluid" modelAttribute="bean">
  
  <div class="container-fluid form-group">
  
    
    
  
    <label for="sname">Student Name:</label><br>
    <input type="text" id="sname" class="form-control" name="sname" style="width: 18rem"  placeholder="Enter Student name"><br>
	
	 <label for="city">Student City:</label><br>
    <input type="text" id="city" class="form-control" name="city" style="width: 18rem" placeholder="Enter Student city"><br>
    
    
    <input type="submit" id="but"  class="btn btn-primary pull-right" value="Add" name="button" style="width: 5rem" onmousedown="Validation()">
    
    
    </div>
  
</form>
    
  </div>
</div>


</body>
</html>