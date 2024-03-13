<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.day2.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
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
     height: 100%;	
    
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
     margin-top: 8px;
     margin-right: 50px;
     position:absolute;
     top:0;
     right:0;
 }
    </style>
    

</head>
<body>

<div class=" container-fluid card bg-light mb-3"  id="card">
  <h4 class="card-header">Update Employee Details</h4>
  <div class="card-body">
  
  <form  action="Fetch">
  
    <label for="eid" class="form-control"><b>Employee Id:</b>
    
    <select name="eid" id="eid" style="width: 100px">
    
    <option selected="selected">Choose</option>
    
    <c:forEach items="${idList}" var="id">
    <option>${id}</option>
    </c:forEach>
  
  </select>
  	<br><br>
    <input class="btn btn-secondary pull-right" type="submit" value="Fetch" name="button" id="fetch" />
  
  </label>
  </form>
  
  <br><br>	
   <form  action="Updation"  class="container-fluid" >
     
   
   <label for="eid"><b>Employee Id:</b></label><br>
    <input type="text" id="eid" class="form-control" name="eid" style="width: 18rem" readonly="readonly" placeholder="Enter Employee Id"  value="${emp.eid}"><br>
    
    
    <label for="ename">Employee Name:</label><br>
    <input type="text" id="ename" class="form-control" name="ename" style="width: 18rem"  placeholder="Enter Name" value="${emp.ename}"  required="required"><br>
	
	 <label for="edesig">Employee Designation:</label><br>
    <input type="text" id="edesig" class="form-control" name="edesig" style="width: 18rem" placeholder="Enter Designation" value="${emp.edesig}" required="required"><br>
    
    <label for="ecity">Employee City:</label><br>
    <input type="text" id="ecity" class="form-control" name="ecity" style="width: 18rem" placeholder="Enter City" value="${emp.ecity}" required="required"><br>
    
    <label for="esal">Employee Salary:</label><br>
    <input type="text" id="esal" class="form-control" name="esal" style="width: 18rem" placeholder="Enter Salary" value="${emp.esal}" required="required"><br>
          
    
    
    <input type="submit" id="but"  class="btn btn-warning" value="Update" name="button" style="width: 5rem" onmousedown="Validation()">
     
</form>
	</div>
  
  </div>


</body>
</html>