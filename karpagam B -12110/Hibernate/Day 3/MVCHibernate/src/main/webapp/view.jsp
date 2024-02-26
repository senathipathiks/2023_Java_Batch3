
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
background-image: url("https://wallpaperaccess.com/full/4707312.jpg");
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
<script>
function Validation() {
	
	var id=document.getElementById("id1").value;
	
	if(id==""){
		alert("Item id is must...to Find a Record");
	}
	
	else if(id.length<3){
		alert("Item  Id length must be greater than 3");

	}
}
</script>
</head>
<body>
<br><br><br>
<form action="LibraryMain" method="post">
<font size="5px" color="purple">
<table border="3" align="center">
<tr>
<center><b>Fetch Book Details</b></center>
</tr>
<tr>
<td>Book ID: </td>
<td><input type="text" class="table-secondary" name="bid" ></td>
</tr>
<tr>
<td colspan="3"><input type="submit" class="btn btn-success btn-lg" onmousedown="Validation()" value="Find" name="button">

</tr>

</table>
</font>

</form>


</body>
</html>