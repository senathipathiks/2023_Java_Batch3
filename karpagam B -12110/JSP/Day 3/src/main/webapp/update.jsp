<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Insert title here</title>
<style>
body{
background-image: url("https://th.bing.com/th/id/OIP.5SPJAnkBHZrMyCvhHJ41HgHaEo?rs=1&pid=ImgDetMain");
background-repeat: no-repeat;
background-size: 100%;
}
table{
 color: black;
 font-weight: bold;
}
#btn1{
   margin-left: 45%;
}
table{
border: 4px solid ;
border-radius:20px;
box-shadow: 0 4px 12px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);

}
</style>
<script type="text/javascript">
function Validation() {
	
	var id=document.getElementById("id1").value;
	var name=document.getElementById("name").value;
	var city=document.getElementById("city").value;
	
	if(id==""){
		alert("Student id must to update the record");
	}
	else if(name==""){
		alert("Student name cannot be empty");
	}
	
	else if(city==""){
		alert("Student city cannot be empty");
	}
	else if(id.length<3){
		alert("Student Id length is greater than 3");

	}
	
}
</script>
</head>
<body>
<br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="purple">
<table border="3" align="center">
<tr>
<center><b>Update Student Details</b></center><br>
</tr>
<tr>
<td>Student ID: </td>
<td><input type="text" class="table-secondary" id="id1" name="sid" required></td>
</tr>
<tr>
<td>Student Name: </td>
<td><input type="text" class="table-secondary" id="name" name="sname" required></td>
</tr>
<tr>
<td>Student city: </td>
<td><input type="text" class="table-secondary" id="city" name="scity" required></td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="Update" onmousedown="Validation()" name="button"></td>
</tr>

</table>
</font>

</form>


</body>
</html>