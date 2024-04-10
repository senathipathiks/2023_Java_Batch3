<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style type="text/css">
body{
background-image: url('https://media.licdn.com/dms/image/D4D12AQE4InJUdCby9g/article-cover_image-shrink_720_1280/0/1701464584710?e=2147483647&v=beta&t=kc8sbUtIDm6sl-g-_9HhJ7N1Ty9Md6aa3EYkJbAAWjg');
background-size: cover;
margin-left: 480px;
margin-top: 30px;
}
#form{
  border-radius: 5px;
  background-color: rgba(255,255,255);
  padding: 20px;
  width: 600px;
  height: auto;
}
#newbutt{
width: 150px;
margin-left: 250px;
border-radius: 5px;
}
#butt{
width: 150px;
}
</style>
</head>
<body>
<div id="form">
<form action="InsertPetition" method="post" class="row g-3" modelAttribute="beanclass">
<div class="text-center shadow p-3 bg-body rounded h2 text-primary">Enter Petition details to Insert</div>
<div class="row g-2">
  <div class="form-floating col-sm-6">
    <input type="text" class="form-control" name="category" placeholder="Category" autocomplete="off" required="required">
    <label for="category">Category</label>
</div>
  <div class="form-floating col-sm-6">
    <input type="text" class="form-control" name="description" placeholder="Description" autocomplete="off" required="required">
    <label for="description">Description</label>
  </div>
</div>
<div class="row g-2">
  <div class="form-floating col-sm-6">
    <input type="text" class="form-control" name="priority" placeholder="Priority" autocomplete="off" required="required">
    <label for="priority">Priority</label>
  </div>
  <div class="form-floating col-sm-6">
    <input type="text" class="form-control" name="raisedBy" placeholder="RaisedBy" autocomplete="off" required="required">
    <label for="raisedBy">Raised By</label>
  </div>
</div>
<div class="row g-2">
    <div class="form-floating col-sm-6">
    <input type="text" class="form-control" name="assignedTo" placeholder="AssignedTo" autocomplete="off" required="required">
    <label for="assignedTo">Assigned To</label>
  </div>
  <div class="form-floating col-sm-6">
    <input type="text" class="form-control" name="status" placeholder="Status" autocomplete="off" required="required">
    <label for="status">Status</label>
  </div>
  </div>
<% String msg = (String)request.getAttribute("msg");
	if(msg != null){
		if(msg.equals("success")){
			out.print("<div class='alert alert-success' role='alert'><i class='bi bi-check-circle'></i> Record Insert Successfully</div>");
		}else{
			out.print("<div class='alert alert-danger' role='alert'><i class='bi bi-exclamation-circle-fill'></i> Insertion Failure</div>");
		}
	}
		
%>
<div class="input-group">
<a href="back"><button type="button" class="btn btn-success" id="butt"><i class="bi bi-arrow-left"></i> Back</button></a>
<button type="submit" class="btn btn-success" name="button"  id="newbutt"><i class="bi bi-plus-square"></i> Insert</button>
 </div>
</form>
</div>
</body>
</html>