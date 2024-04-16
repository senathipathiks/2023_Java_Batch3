<%@page import="com.spring.bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
body{
background-image: url('');
background-size: cover;
font-size: 16px;
margin: 0;
display: flex;
justify-content: center;
align-items: center;
height: 100vh;
font-weight: bold;
background-color: #f8f9fa;
}
.input-icon {
  position: relative;
  margin-bottom: 1rem;
}
.input-icon > i {
  position: absolute;
  left: 0.5rem;
  top: 0.35rem;
  color: #495057;
}
.input-icon > input {
  padding-left: 2rem;
  border-radius: 0.25rem;
  border: 2px solid #495057;
}
.form-group {
  display: flex;
  align-items: center;
  margin-bottom: 1.5rem;
}
.form-group > label {
  margin-right: 1rem;
  width: 4rem;
}
.icon {
  padding: 10px;
  background: black;
  color: white;
  min-width: 50px;
  text-align: center;
}
.form-group {
  display: -ms-flexbox; 
  display: flex;
  width: 100%;
  margin-bottom: 15px;
}
.card {
box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
transition: 0.3s;
border-radius: 15px;
}
.card:hover {
box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}
.card-header {
 /*  background-color: #495057; */
  color: black;
  border-top-left-radius: 15px;
  border-top-right-radius: 15px;
}
.btn-primary {
 
  border: none;
  transition: 0.3s;
}
.btn-primary:hover {
  background-color: #343a40;
}
</style>
</head>
<body>

<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Book Details to Update : </h5></div>

  


<div class="card-body ">

<form action="Updation" modelAttribute="bean">
	
<div class="form-group">
    <label for="bookId">
    <i class="fa fa-id-card icon"></i></label>
    <input type="text" id="bookId" name="id" autocomplete="off" placeholder="Book ID" value="${emp.id}" class="form-control"/>
</div> 	
	
	
<div class="form-group">
    <label for="bookName"><i class="fa fa-book icon"></i></label>
    <input type="text"  name="name" autocomplete="off" placeholder="Book Name" class="form-control" value="${emp.name}" />
</div>


<div class="form-group">
    <label for="author"><i class="fa fa-pencil icon"></i></label>
    <input type="text"  name="city" autocomplete="off" placeholder="Author Name" value="${emp.city}" class="form-control"/>
</div>


<div class="form-group" style="text-align: right;">
  <button type="submit"  class="btn btn-primary btn-md " name="button" value="Update"> <i class="fa fa-refresh" ></i> Update
            </button>
</div>

</form>
<form action="fetch" modelAttribute="bean" >
       <select class="form-select form-select-sm" aria-label=".form-select-sm example" name="id">
       <option selected>Emp ID</option>
       <c:forEach items="${idlist}" var="id">
       <option value="${id}">${id}</option>
       </c:forEach>
       </select><br>
       <div class="form-group" style="text-align: right;">
      <input type="submit" class="btn btn-warning" value="fetch" /><i class="fa-solid fa-hand-holding" ></i>
      </div>
      </form>
      </div>
	
</div>
</div>


</body>
</html>
