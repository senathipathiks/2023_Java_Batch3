<%@page import="com.opms.bean.Petition"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style>
body{
background-image: url('https://media.licdn.com/dms/image/D4D12AQE4InJUdCby9g/article-cover_image-shrink_720_1280/0/1701464584710?e=2147483647&v=beta&t=kc8sbUtIDm6sl-g-_9HhJ7N1Ty9Md6aa3EYkJbAAWjg');
background-size: cover;
margin-left: 160px;
margin-top: 30px;
}
#display{
	border-radius: 5px;
  background-color: rgba(255,255,255);
  padding: 20px;
  width: 1200px;
  height: auto;
}
a{
padding-left: 10px;
}
</style>
</head>
<body>
<div id="display">
<% ArrayList<Petition> list = (ArrayList<Petition>)request.getAttribute("list");%>
<div class="text-center shadow p-3 bg-body rounded h3 mb-3">No of Record : <%=list.size()%></div>
<table class="table table-bordered table-hover text-center shadow">
 <thead>
    <tr class="table-primary">
      <th scope="col" >Petition Id</th>
      <th scope="col" >Category</th>
      <th scope="col" >Description</th>
      <th scope="col" >Priority</th>
      <th scope="col" >Raised By</th>
      <th scope="col" >Assigned To</th>
      <th scope="col" >Status</th>
      <th scope="col" class="col-3">Action</th>
    </tr>
  </thead>
 <tbody>
 <% 
  Petition v = (Petition)request.getAttribute("bean");
 
 for(Petition b : list){
	 if(v != null && v.getPetitionId()==b.getPetitionId()){
			out.print("<form action='SaveUpdate' method='post' modelAttribute='beanclass1'>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='petitionId' placeholder='petitionId' value='"+b.getPetitionId()+"'  readonly><label for='petitionId'>Petition Id</label></div></td>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='category' placeholder='Category' value='"+b.getCategory()+"' autocomplete='off'><label for='category'>Category</label></div></td>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='description' placeholder='Description'  value='"+b.getDescription()+"' autocomplete='off'><label for='description'>Description</label></div></td>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='priority' placeholder='Priority' value='"+b.getPriority()+"' autocomplete='off'><label for='priority'>Priority</label></div></td>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='raisedBy' placeholder='RaisedBy' value='"+b.getRaisedBy()+"' autocomplete='off'><label for='raisedBy'>Raised By</label></div></td>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='assignedTo' placeholder='Assigned To'  value='"+b.getAssignedTo()+"' autocomplete='off'><label for='assignedTo'>Assigned To</label></div></td>");
			out.print("<td><div class='form-floating'><input type='text' class='form-control' name='status' placeholder='Status' value='"+b.getStatus()+"' autocomplete='off'><label for='status'>Priority</label></div></td>");
			out.print("<td><button class='btn btn-success ms-2' type='submit' name='action' id='butt'><i class='bi bi-save'></i> save</button><a href='back'><button type='button' class='btn btn-success ' id='butt'><i class='bi bi-arrow-left'></i> Back</button></a></td></tr></form>");
	 }else{
	out.print("<tr><td>"+b.getPetitionId()+"</td><td>"+b.getCategory()+"</td><td>"+b.getDescription()+"</td><td>"+b.getPriority()+"</td><td>"+b.getRaisedBy()+"</td><td>"+b.getAssignedTo()+"</td><td>"+b.getStatus()+"</td><td><a href='findall?action=edit&vehicleId="+b.getPetitionId()+"' target='Operation'><button class='btn btn-primary'><i class='bi bi-pencil-square'></i> edit</button></a><a href='findall?action=delete&vehicleId="+b.getPetitionId()+"' target='Operation'><button class='btn btn-danger'><i class='bi bi-trash'></i>delete</button></a></td></tr>");
	 }
	 } 
	out.print("<form action='AddPetition' method='post' modelAttribute='beanclass2'>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='petitionId' placeholder='petitionId' disabled><label for='petitionId'>Petition Id</label></div></td>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='category' placeholder='Category' autocomplete='off'><label for='category'>Category</label></div></td>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='description' placeholder='Description' autocomplete='off'><label for='description'>Description</label></div></td>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='priority' placeholder='Priority' autocomplete='off'><label for='priority'>Priority</label></div></td>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='raisedBy' placeholder='RaisedBy' autocomplete='off'><label for='raisedBy'>Raised By</label></div></td>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='assignedTo' placeholder='Assigned To' autocomplete='off'><label for='assignedTo'>Assigned To</label></div></td>");
	out.print("<td><div class='form-floating'><input type='text' class='form-control' name='status' placeholder='Status'autocomplete='off'><label for='status'>Status</label></div></td>");
	out.print("<td><button class='btn btn-success ms-2' type='submit' name='action' id='butt'><i class='bi bi-plus-square'></i> add</button></td></tr></form>");
	 %>
 </tbody>
</table>
</div>
</body>
</html>