<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Student</title>
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
 
 #lid{
 width: 105px;
 }
    </style>
    
    <script type="text/javascript">
    
function Validation() {
		
		var sid=document.getElementById("sid").value;
		
		
		
		if(sid==""){
			alert("Student id cannot be empty");
		}
		
				
	}
    </script>
    
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Search Book Details </h4></div>
  <div class="card-body">
  
  <form  action="Searches"  class="container-fluid" modelAttribute="bean">
  
  <div class="container-fluid form-group">
  
    <div class="form-group">
    
    <label for="lid"><b>Book Id:</b></label><br>
    
    
    <select name="lid" id="lid" >
    <c:forEach items="${Idlist}" var="id">
    <option>${id}</option>
    </c:forEach>
    </select>
    </div>
    <input type="submit" id="but"  class="btn btn-success pull-right" value="Search" name="button" style="width: 5rem" onmousedown="Validation()">
    
    
    
  </div>
</form>
    
  </div>
</div>


</body>
</html>