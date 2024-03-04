<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-image: url('https://png.pngtree.com/background/20230425/original/pngtree-motorcycle-parked-near-a-street-picture-image_2478435.jpg');
background-size: cover;
font-size: 18px;
margin-left: 20%;
margin-top: 70px;
font-weight: bold;
}
td{
padding: 10px 0px 0px 45px;
}
#id{
width:250px;
}
#card{
margin-left: 130px;
font-size: 20px; 
}
</style>
</head>
<body>
<div class="card w-75 ">
<div class="card-header text-center"><h5>Select the Bike Id to search : </h5></div>
<div class="card-body "  id="card">
<form action="Search" method="post" modelAttribute="bean">
<table style="border:none;text-align: center;">
<tr><td>Select Id</td><td class="input-group">:
 <select class="form-select" id="id" name="bikeId">
  <option selected>Choose</option>
 <%ArrayList<Integer> ls = (ArrayList<Integer>)request.getAttribute("keys"); 
 for(Integer i : ls){
	 %>
	  <option value="<%=i%>"><%=i%></option>
<%	 
 }
 %>
 </select></td>
<td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Search"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>