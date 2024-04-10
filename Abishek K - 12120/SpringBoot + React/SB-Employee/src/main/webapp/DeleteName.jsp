<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	height:270px;
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
<div class="card" id="card1">
  <h5 class="card-header bg-primary">Delete Operation</h5>
  <div class="card-body ">
  
 <form action="PerformDeleteName"  method="post" > 
   <div class="form-floating mb-3">
   <label for="floatingInput">Employee Name</label>
  <select class="form-select" aria-label="Default select example" style="height:30px; width: 100%" name="empName">
       
      <option selected>---Select Name---</option>
      <c:forEach items="${nameList}" var="name" >
      <option value="${name}">${name}</option>
      </c:forEach>
      </select>
  </div><br>
  <div class="form-floating">
 <input type="submit" value="Delete" name="button" class="btn btn-danger">
 </div>
  </form>
</div>

</div>

<c:if test="${msg!=null}">
 <div class="card-body bg-success" id="noti"><h3><font color=white>${msg}</font></h3></div>
</c:if>

</body>
</html>