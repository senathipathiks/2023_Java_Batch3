<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add book</title>
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
		
		var cid=document.getElementById("carid").value;
		var cmodel=document.getElementById("carmodel").value;
		var ctype=document.getElementById("cartype").value;
		var crate=document.getElementById("rate").value;
		var cseat=document.getElementById("capacity").value;
		
		if(cid==""){
			alert("Car id cannot be empty");
		}
		else if(cmodel==""){
			alert("Car model cannot be empty");
		}
		else if(ctype==""){
			alert("Car Type cannot be empty");
		}
		else if(crate==""){
			alert("Rate cannot be empty");
		}
		else if(cseat==""){
			alert("Seat cannot be empty")
		}
		
	}
    </script>
    
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Add Book</h4></div>
  <div class="card-body">
  
  <form  action="LibraryServletFile" method="post" class="container-fluid">
  
  <div class="container-fluid form-group">
  
    
    <label for="bname">Book name:</label><br>
    <input type="text" id="bname" class="form-control" name="bname" style="width: 18rem"  placeholder="Enter book name"><br>
	
	 <label for="bgen">Book genere:</label><br>
    <input type="text" id="bgen" class="form-control" name="bgen" style="width: 18rem" placeholder="Enter book genere"><br>
    
    
    
    <input type="submit" id="but"  class="btn btn-primary pull-right" value="Add" name="button" style="width: 5rem" onmousedown="Validation()">
    
    
    </div>
  
</form>
    
  </div>
</div>


</body>
</html>