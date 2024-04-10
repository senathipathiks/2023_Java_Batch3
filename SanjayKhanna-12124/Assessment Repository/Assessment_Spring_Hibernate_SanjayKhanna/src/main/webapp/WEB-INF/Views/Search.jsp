<%@page import="com.opms.bean.Petition"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style type="text/css">
body{
background-image: url('https://media.licdn.com/dms/image/D4D12AQE4InJUdCby9g/article-cover_image-shrink_720_1280/0/1701464584710?e=2147483647&v=beta&t=kc8sbUtIDm6sl-g-_9HhJ7N1Ty9Md6aa3EYkJbAAWjg');
background-size: cover;
margin-left: 480px;
margin-top: 50px;
}
#form{
  border-radius: 5px;
  background-color: rgba(255,255,255);
  padding: 20px;
  width: 600px;
  height: auto;
}
#butt{
width: 150px;
margin-left: 400px;
}
</style>
</head>
<body>
<div id="form" class="row g-3">
<form action="SearchPetition" method="post" modelAttribute="beanclass">
<div class="text-center shadow p-2 bg-body rounded h3 text-primary mb-3">Search Here...</div>
<div class="input-group input-group-lg ">
  <span class="input-group-text col-5">Select Petition Id</span>
  <select class="form-select col-4" name="petitionId">
   <option selected value="0">Choose</option>
   <% ArrayList<Integer> list = (ArrayList<Integer>)request.getAttribute("keys");
 	for(Integer i : list){
	 %>
	 <option value="<%=i%>"><%=i%></option>
	 <%}%>
  </select>
  <button type="submit" class="btn btn-success  col-3" name="button"><i class="bi bi-search"></i> Search</button>
</div>
</form>
<% String msg = (String)request.getAttribute("msg");
	if(msg != null){
		if(msg.equals("success")){
			Petition v =(Petition)request.getAttribute("bean");
			out.print("<div class='alert alert-success' role='alert'><i class='bi bi-check-circle'></i> Record Found Successfully</div>");
			out.print("<table class='table'><tr class='table-primary'><th>Petition Id</th><th>Category</th><th>Description</th><th>Priority</th><th>Raised By</th><th>Assigned To</th><th>Status</th></tr>");
			out.print("<tr><td>"+v.getPetitionId()+"</td><td>"+v.getCategory()+"</td><td>"+v.getDescription()+"</td><td>"+v.getPriority()+"</td><td>"+v.getRaisedBy()+"</td><td>"+v.getAssignedTo()+"</td><td>"+v.getStatus()+"</td></tr></table>");
		}else{
			out.print("<div class='alert alert-danger' role='alert'><i class='bi bi-exclamation-circle-fill'></i> Search not found</div>");
		}
	}
		
%>
<a href="back"><button type="button" class="btn btn-success" id="butt"><i class="bi bi-arrow-left"></i> Back</button></a>
</div>
</body>
</html>