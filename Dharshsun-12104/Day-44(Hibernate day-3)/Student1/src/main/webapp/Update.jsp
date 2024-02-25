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
background-image: url('https://i.pinimg.com/originals/00/08/06/0008069a050ade9ecf214d6ddd18021d.jpg');
background-size: cover;
font-size: 16px;
margin-left: 30%;
margin-top: 110px;
font-weight: bold;
}
td{
padding: 10px 14px;
}

</style>
</head>
<body>
<div class="card w-50 ">
<div class="card-header text-center"><h5>Enter the Student Details to Update : </h5></div>
<div class="card-body ">
<form action="StudentMain" method="post">
<table style="border:none;">
 <tr><td>Enter Student Id </td><td>: <input type="number" name="StudId" autocomplete="off" placeholder="Enter stud id"/> </td></tr>
<tr><td>Enter Student Name </td><td>: <input type="text" name="sname" autocomplete="off" placeholder="Enter stud name"/> </td></tr>
<tr><td>Enter city </td><td>: <input type="text" name="scity" autocomplete="off" placeholder="Enter dept"/></td></tr>
<!-- <tr><td>Enter DOB </td><td>: <input type="text" name="DOB" autocomplete="off" placeholder="Enter dept"/></td></tr>
<tr><td>Enter Attendance percent </td><td>: <input type="text" name="Atten_Percentage" autocomplete="off" placeholder="Enter dept"/></td></tr>
<tr><td>Enter Eligibility status </td><td>: <input type="text" name="Eligiblity_status" autocomplete="off" placeholder="Enter eligibility status"/></td></tr>
<tr><td>Enter no of subjects </td><td>: <input type="number" name="No_of_subjects" autocomplete="off" placeholder="Enter no of subjects"/> </td></tr> -->
<tr><td colspan="2" style="text-align: right;"><input type="submit"  class="btn btn-primary btn-md" name="button" value="Update"/> </td></tr>
</table>
</form>
</div>
</div>
</body>
</html>