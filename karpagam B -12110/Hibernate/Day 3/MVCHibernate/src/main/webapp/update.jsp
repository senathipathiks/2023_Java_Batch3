<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
table{
border: 4px solid ;
border-radius:20px;
box-shadow: 0 4px 12px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
</style></head>
<body>
<br>
<form action="LibraryMain" method="post">
<font size="5px" color="purple">
<table border="4px solid" align="center">
<tr>
<center><b>Update Book Details</b></center>
</tr>
<tr>
<td  >
Book ID:</td>
<td><input type="text"  class="table-secondary"  id="id2" name="bid"></td>
</tr>
<tr>
<td>Book Title:</td>
<td><input type="text" class="table-secondary" id="name2" name="bname"></td>
</tr>
<tr>
<td>Author Name:</td>
<td><input type="text" class="table-secondary" id="quant2"  name="bauth" ></td>
</tr>
<tr>


<center><td colspan="2" >
<input type="submit" class="btn btn-danger btn-lg" value="Update" onmousedown="Validation()" name="button"></td></center>
</tr>

</table>
</font>
</form>
</body>
</html>