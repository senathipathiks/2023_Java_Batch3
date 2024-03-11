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
  
 <form action="Deletion" modelAttribute="bean" method="post" name="loginform" onsubmit="return validation()"> 
   <div class="form-floating mb-3">
   <label for="floatingInput">Item-ID</label>
  <select class="form-select" aria-label="Default select example" style="height:30px; width: 100%" name="eid">
       
      <option selected>Select ID</option>
      <c:forEach items="${IdList}" var="id" >
      <option value="${id}">${id}</option>
      </c:forEach>
      </select>
  </div><br>
  <div class="form-floating">
 <input type="submit" value="Delete" name="button" class="btn btn-danger">
 </div>
  </form>
</div>

</div>

<%
     
     String result = (String) request.getAttribute("Action");
     
     if(result!=null){
    	 
     if(result.equals("Success")){
    	 out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Insertion Operation is Successfully Done</font></h3></div>");
     }
     else{
    	 out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>Insertion Operation is Failure</font></h3></div>");
     }
     
     }
     %>
</body>
</html>