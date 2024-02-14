<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body{
background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(78,124,179,1) 100%);

}
</style>
</head>
<body class="bg-secondary">
<form action="InsertServlet" method="post">
<font size="4px" color="black"><br><br><br>
<table border="1" align ="center">
<thead>
<tr><th colspan="2" class="bg-success"><center>Delete Page</center></th>
</tr>
</thead>
<tr>
<td class="bg-info">Student Id:</td>
<td><input type="text" name="sid"></td>
</tr>
<tr>
<br>
<td colspan="2" class="text-center"
><input type="submit" class="btn btn-primary btn-md " name="button" value="Delete">

</tr>

</table>
</font>
</form>
</body>
</html>>