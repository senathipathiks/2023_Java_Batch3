<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

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
    </style>
    
    <script type="text/javascript">
    
    function Validation() {
		
		var cid=document.getElementById("username").value;
		
		if(username==""){
			alert("Car id cannot be empty");
		}
    }
    </script>
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Login </h4></div>
  <div class="card-body">
  
  <form action="Registration.jsp" >
  
   <div class=" container-fluid form-group">
    
    <label for="username">Enter username:</label>
    <input type="text" class="form-control" id="username" name="username" placeholder="Enter  username"><br>
    
    
    <label for="password">Enter Password:</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Enter Password"><br>
    
    <input class="btn btn-success"  type="submit" value="login" name="button"  style="width: 5rem" onmousedown="Validation()">
     
    

</div>
  
</form>
    
  </div>
</div>

</body>
</html>