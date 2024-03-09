<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
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
		
		var eid=document.getElementById("eid").value;
		
		if(eid==""){
			alert("Employee id cannot be empty");
		}
		
		
		
	}
    </script>
    
</head>
<body class="container-fluid">

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Search Employee Details</h4></div>
  <div class="card-body">
  
  <form  action="EmployeeServletFile" method="post" class="container-fluid">
  
  <div class="container-fluid form-group">
  
    
    <label for="eid"><b>Employee Id:</b></label><br>
    <select name="eid" class="form-select" aria-label="Default select example">
    <%
    List<Integer> idlist=(List<Integer>)request.getAttribute("Idlist");
    System.out.println(idlist +"");
    for(Integer i : idlist){
    	out.println("<option value='"+i+"'>"+i+"</option>");
    }
    %>
    </select>
    
    <input type="submit" id="but"  class="btn btn-success pull-right" value="Search" name="button" style="width: 5rem" onmousedown="Validation()">
    
    1
    
    </div>
  
</form>
    
  </div>
</div>


</body>
</html>