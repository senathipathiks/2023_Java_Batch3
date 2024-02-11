<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
text-align: center;
margin-top: 100px;
background-image: url('https://img.freepik.com/free-vector/soft-blue-color-watercolor-texture-background_1055-17697.jpg?size=626&ext=jpg&ga=GA1.1.1448711260.1706659200&semt=ais');
background-size: cover;
}
table{
font-size: 24px;
background-color: gray;
padding: 10px 14px;
}
tr{
padding:10px 14px;
}
td{
padding:5px;
}
#insert{
text-align:right;
}

</style>
</head>
<body>
<form action="InsertServlet" method="post">
<h3>Enter Student Details to Insert : </h3><br>
<table border="1" align="center">
<tr><td>Student Id </td><td>: <input type="text" name="stuId" ></td></tr>
<tr><td>Student Name</td><td>: <input type="text" name="stuName" ></td></tr>
<tr><td>Student City</td><td>: <input type="text" name="stuCity" ></td></tr>
<tr><td colspan="2" id="insert"><input type="submit" class="btn btn-primary btn-lg" value="Insert" name="button" /></td>
</table>
</form>
</body>
</html>