<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.revision.bean.Library"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>
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
		
		var eid=document.getElementById("lid").value;
		var ename=document.getElementById("lname").value;
		var edesig=document.getElementById("lauthor").value;
		
		
		if(lid==""){
			alert("Employee id cannot be empty");
		}
		else if(lname==""){
			alert("Employee name cannot be empty");
		}
		else if(lauthor==""){
			alert("Employee designation cannot be empty");
		}
		
		
	}
    </script>
    
</head>
<body class="container-fluid">

<div class=" container-fluid card bg-light mb-3"  id="card" style="max-width: 40rem;">
  <div class="card-header"><h4>Update Book Details</h4></div>
  <div class="card-body">
  
  <form  action="Fetch" method="post" class="container-fluid" modelAttribute="bean">
  
  <div class="container-fluid form-group">
  
    <label for="lid"><b>Book Id:</b></label><br>
    <select name="lid" class="input-field" aria-label="Default select example">
    
    <%
    List<Integer>idlist=(List<Integer>)request.getAttribute("Idlist");
    
    for(Integer i:idlist){
    	out.println("<option value='"+i+"'>"+i+"</option>");
    }
    %>
    </select>
  
  <input class="btn btn-secondary pull-right" type="submit" value="Fetch" name="button" />
  </form>
  <br><br>	
   <form  action="Updation" method="post" class="container-fluid" modelAttribute="bean">
   
  
   
   
   <label for="lid"><b>Book Id:</b></label><br>
    <input type="text" id="lid" class="form-control" name="lid" style="width: 18rem" readonly="readonly" placeholder="Enter Book Id"  value="${bean.lid}"><br>
    
    <label for="lname"><b>Book Name:</b></label><br>
    <input type="text" id="lname" class="form-control" name="lname" style="width: 18rem"  placeholder="Enter Book name" value="${bean.lname}"><br>
	
	 <label for="lauthor"><b>Book Author:</b></label><br>
    <input type="text" id="lauthor" class="form-control" name="lauthor" style="width: 18rem" placeholder="Enter Book author" value="${bean.lauthor}"><br>
    
    
    <input type="submit" id="but"  class="btn btn-warning pull-right" value="Update" name="button" style="width: 5rem" onmousedown="Validation()">
     
</form>

	</div>
    
  </div>
</div>


</body>
</html>