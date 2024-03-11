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
</head>
<body>
<div class="card" id="card1">
  <h5 class="card-header bg-primary">Delete Operation</h5>
  <div class="card-body ">
  
 <form action="Deletion" modelAttribute="bean" method="post" name="loginform" onsubmit="return validation()"> 
   <div class="form-floating mb-3">
   <label for="floatingInput">Item-ID</label>
  <select class="form-select" aria-label="Default select example" name="itID">
       
      <option selected>Select RoomID</option>
      <c:forEach items="${idlist}" var="id" >
      <option>${id}</option>
      </c:forEach>
      </select>
  </div>
  
  
  
  <br><br>
  <div class="form-floating">
 <input type="submit" value="Delete" name="button" class="btn btn-danger">
 </div>
  </form>
</div>

</div>
</body>
</html>