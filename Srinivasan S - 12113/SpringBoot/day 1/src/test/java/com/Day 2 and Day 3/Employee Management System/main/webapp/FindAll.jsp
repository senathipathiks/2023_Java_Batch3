  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.day2.bean.Employee" %>
     <%@ taglib prefix="c" uri="jakarta.tags.core"%>
	<%@ page isELIgnored="false" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find All</title>

<style >

body{
margin-left: -100px;
}

#div1{
margin-bottom: 50%;
position: absolute;
left: 18%;
top: 10%;
}	
 #card{
     width: 50%;
    
  position: absolute;
  top: 50%;
  left:10%;
  transform: translate(-50%, -50%)
    }
table {
 width: 80%;
  border-collapse: collapse;
  margin-left:-100px;
  padding-left: 10px;
}

th, td {
  text-align: left;
  padding: 8px2
}

tr:nth-child(even) {background-color: #f2f2f2;}

</style>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>	

<body>


<table   id=div1 class="card card-body shadow-lg p-3 mb-5 bg-white rounded"; border=3; box-shadow: 10px 10px 5px  >

<form action="Save" >

<tr>
<th><h3>Insert here</h3></th>
</tr>

<tr>

<td><input type="text" class="form-control"value="Auto Generative Id" readonly="readonly"></td>
<td><input type="text" class="form-control" name="ename"  placeholder="Enter name" ></td>
<td><input type="text" class="form-control" name="edesig" placeholder="Enter designation"></td>
<td><input type="text" class="form-control" name="ecity"  placeholder="Enter city" ></td>
<td><input type="text" class="form-control" name="esal"  placeholder="Enter salary" ></td>


<td>

	<input type="submit" id="but"  class="btn btn-success pull-right" value="Save" name="button" style="width: 5rem">
	
</td>

</tr> 

 </form>

<tr>

<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Designation</th>
<th>Employee City</th>
<th>Employee Salary</th>
<th>Update</th>	
<th>Delete</th>
</tr>
<c:forEach items="${Idlist}" var="Idlist" >

<form action="EditForm">
<tr>

<td><input type="text" class="form-control" name="eid" value="${Idlist.eid}" readonly="readonly"></td>
<td><input type="text" class="form-control" name="ename"  value="${Idlist.ename}" ></td>
<td><input type="text" class="form-control" name="edesig" value="${Idlist.edesig}"></td>
<td><input type="text" class="form-control" name="ecity" value="${Idlist.ecity}"></td>
<td><input type="text" class="form-control" name="esal" value="${Idlist.esal}"></td>

<td>

    <input type="submit" id="but"  class="btn btn-warning btn-sm pull-right" value="Edit" name="button" style="width: 5rem" onmousedown="Validation()">

</td>	
 </form>
    
    <td>
      <a href="Remove?eid=${Idlist.eid}"><input type="submit" value="Remove" class="btn btn-danger btn-sm pull-right"/></a>
    
    
	
	</td>	
</tr>

</c:forEach>


</table>

</body>
</html>