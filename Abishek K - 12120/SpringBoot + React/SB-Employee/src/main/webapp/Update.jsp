<%@ page language="java" 
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>	
<%@ page isELIgnored="false" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
.card{
	height:930px;
	width:500px;
	margin-left:30%;
	margin-top:40px;
	padding:30px;
	margin-bottom:30px;
}
body{
background-color: #A7BEAE;
}
#noti{
align-items:center;
width:50%;
height:60px;
margin-left:30%;
margin-bottom:40px;
}
</style>
</head>
<body>


	<div class="card">
		<h5 class="card-header bg-primary">Insertion Operation</h5>
		<div class="card-body ">
		
	  
	 <form action="FetchEmployee" method="post">
	 
	 <div class="form-floating mb-3">
   <label for="floatingInput">Employee ID</label>
  <select class="form-select" aria-label="Default select example" style="height:30px; width: 100%" name="empId">
       
      <option selected>--Select ID--</option>
      <c:forEach items="${idList}" var="id" >
      <option>${id}</option>
      </c:forEach>
      </select>
  </div>
  <div class="form-floating">
      <input type="submit" value="Fetch" name="button" class="btn btn-warning"  >
       
     </div>
     <br>
    </form>    
        <form action="PerformUpdate" method="post" >
        <div class="form-floating mb-3">
        <label for="floatingInput">Employee ID</label>
       <input type="text" class="form-control" id="rmid" placeholder="ID" name="empId" required="required" value="${Emp.empId}"  readonly="readonly" >
       
     </div>
     
     <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Name</label>
       <input type="text" class="form-control" id="rmtype" placeholder="Name" name="empName" required="required" value="${Emp.empName}" >
       
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Salary</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Salary" name="empSalary" required="required" value="${Emp.empSalary}" >
       
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Department</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Department" name="empDeprt" required="required" value="${Emp.empDeprt}" >
       
     </div>
     
     <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Domain</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Domain" name="empDomain" required="required" value="${Emp.empDomain}" >
     </div>
      <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Ph.No</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Ph.NO" name="empPh" required="required" maxlength="10" minlength="8" value="${Emp.empPh}" >
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Blood Group</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Blood Group" name="empBlood" required="required" value="${Emp.empBlood}" >
     </div>
    
     
       
     <br>
     
     <div class="form-floating">
      <input type="submit" value="Update" name="button" class="btn btn-success"  >
       
     </div>
     </form>
       </div>
     </div>
     
     <br>
     
      <c:if test="${msg!=null}">
     
     <div class="card-body bg-success" id="noti"><h3><font color=white>${msg}</font></h3></div>
     </c:if>    
     
     
</body>
</html>