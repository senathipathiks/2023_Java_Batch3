<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">
body{
background-image: url('https://png.pngtree.com/background/20230425/original/pngtree-motorcycle-parked-near-a-street-picture-image_2478435.jpg');
background-size: cover;
font-size: 16px;
margin-left: 30%;
margin-top: 10px;
font-weight: bold;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Bike Details to Update : </h5></div>
<div class="card-body ">
<form action="Update" method="post" modelAttribute="bean">
<table style="border:none;">
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
 </select></td></tr>
<tr><td>Enter Brand Name</td><td>: <input type="text" name="brandName" autocomplete="off" placeholder="Enter brand name" required/> </td></tr>
<tr><td>Enter Engine capacity</td><td>: <input type="text" name="engineCapacity" autocomplete="off" placeholder="Enter engine capacity " required/> </td></tr>
<tr><td>Enter Mileage</td><td>: <input type="text" name="mileage" autocomplete="off" placeholder="Enter mileage" required/></td></tr>
<tr><td>Enter Max Speed</td><td>: <input type="text" name="maxSpeed" autocomplete="off" placeholder="Enter max speed" required/></td></tr>
<tr><td>Enter Price</td><td>: <input type="text" name="price" autocomplete="off" placeholder="Enter price" required/></td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Update" /> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>