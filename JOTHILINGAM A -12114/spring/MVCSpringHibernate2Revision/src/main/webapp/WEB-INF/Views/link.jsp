<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Link Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
background-image : url('https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.com%2Ffree-photos-vectors%2Fprofessional-background&psig=AOvVaw0X7wuoR2aVIFX0Md0bd9jY&ust=1708163077891000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCMjY_cDJr4QDFQAAAAAdAAAAABAD');
background-color: #343a40;
display: grid;
row-gap: 50px;
margin-top: 50px;
margin-left: 10px;
color: #fff;
}


.btn-primary {
background-color: #007bff;
border-color: #007bff;
color: #fff;
}

.btn-primary:hover {
background-color: #0056b3;
border-color: #0056b3;
}

</style>
</head>
<body>
<div class="text-center" style="width:90%;" ><a href="insert" class="btn btn-primary " name="button" target="operation">Insert</a></div>
<div  class ="text-center" style="width:90%;" ><a href="delete" class="btn btn-primary" name="button" target="operation">Delete</a></div>
<div class="text-center" style="width:90%;"><a href="update" class="btn btn-primary " name="button" target="operation">Update</a></div>
<div class="text-center" style="width:90%;"><a href="view" class="btn btn-primary" name="button" target="operation">Search</a></div>
<div class="text-center" style="width:90%;"><a href="viewall" class="btn btn-primary" name="button" target="operation">View All</a></div>


</body>

</html>