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
background-image: url('https://w.forfun.com/fetch/99/999169bfd8ecc7d22cceb9c5adb80141.jpeg');
background-size: cover;
margin-left: 30%;
margin-top: 10px;
font-weight: bold;
}
td{
padding: 10px 14px;
}
#card{
box-shadow: 8px 8px 10px 10px rgba(0,0,0,0.6);
}
</style>
</head>
<body>
<div class="card w-50 " id="card">
<div class="card-header text-center"><h5>Enter the Book Details to Update : </h5></div>
<div class="card-body ">
<form action="Controller" method="post">
<table style="border:none;">
<tr><td>Enter Book Id </td><td>: <input type="text" name="bookId" autocomplete="off" placeholder="Enter book id" required/> </td></tr>
<tr><td>Enter Book Name </td><td>: <input type="text" name="bookName" autocomplete="off" placeholder="Enter book name" required/> </td></tr>
<tr><td>Enter Author Name </td><td>: <input type="text" name="author" autocomplete="off" placeholder="Enter author name" required/> </td></tr>
<tr><td>Enter Publisher Name </td><td>: <input type="text" name="publisher" autocomplete="off" placeholder="Enter publisher name" required/> </td></tr>
<tr><td>Enter Price </td><td>: <input type="text" name="price" autocomplete="off" placeholder="Enter price" required/></td></tr>
<tr><td>Enter Edition </td><td>: <input type="text" name="edition" autocomplete="off" placeholder="Enter edition" required/> </td></tr>
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Update"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>