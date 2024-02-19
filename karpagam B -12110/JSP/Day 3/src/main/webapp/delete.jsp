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
	
	if(id==""){
		alert("Student id is must...to delete a Record");
	}
	
	else if(id.length<3){
		alert("Student Id length is greater than 3");

	}
	
}
</script>
</head>
<body>
<br><br><br><br>
<form action="InsertServlet" method="post">
<font size="5px" color="purple">
<table border="3" align="center">
<tr>
<center><b>Delete Student Details</b></center><br>
</tr>
<tr>
<td>Student ID: </td>
<td><input type="text" name="sid" id="id1" class="table-secondary" ></td>
</tr>
<tr>

<td colspan="2"><input type="submit" class="btn btn-danger btn-lg" value="Delete" onmousedown="Validation()" name="button"></td>
</tr>

</table>
</font>
</form>
</body>
</html>