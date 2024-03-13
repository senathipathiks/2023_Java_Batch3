<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false" %>
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
    
    
</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Delete Employee Details </h4></div>
  <div class="card-body">
  
  <form  action="Deletion" class="container-fluid" modelAttribute="bean">
  
  <div class="container-fluid form-group">
  
    
    <label for="eid" class="form-control"><b>Employee Id:</b>
    <select name="eid" id="eid" style="width: 100px">
    <option selected="selected">Choose</option>
    <c:forEach items="${idList}" var="id">
    <option>${id}</option>
    </c:forEach>
    
    <input type="submit" id="but"  class="btn btn-danger pull-right" value="Delete" name="button" style="width: 5rem" onmousedown="Validation()">
    
    </select></label>
    </div>
  
</form>
    
  </div>
</div>


</body>
</html>