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
		
		var lid=document.getElementById("lid").value;
		var lname=document.getElementById("lname").value;
		var lauthor=document.getElementById("lauthor").value;
		
		
		if(lid==""){
			alert("Lib id cannot be empty");
		}
		else if(lname==""){
			alert("Lib model cannot be empty");
		}
		else if(lauthor==""){
			alert("Lib Type cannot be empty");
		}
				
	}
    </script>
    
</head>
<body >

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Add Book Details </h4></div>
  <div class="card-body">
  
  <form  action="Insertion" method="post" class="container-fluid" modelAttribute="bean">
  
  <div class="container-fluid form-group">
  
    
    
  
    <label for="lname">Book Name:</label><br>
    <input type="text" id="lname" class="form-control" name="lname" style="width: 18rem"  placeholder="Enter Book name" required="required"><br>
	
	 <label for="lauthor">Book Author:</label><br>
    <input type="text" id="lauthor" class="form-control" name="lauthor" style="width: 18rem" placeholder="Enter Book author" required="required"><br>
    
    
    <input type="submit" id="but"  class="btn btn-primary pull-right" value="Add" name="button" style="width: 5rem" onmousedown="Validation()">
    
    
    </div>
  
</form>
    
  </div>
</div>


</body>
</html>