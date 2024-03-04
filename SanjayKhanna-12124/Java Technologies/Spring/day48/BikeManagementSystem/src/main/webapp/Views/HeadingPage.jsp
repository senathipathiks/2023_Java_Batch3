<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body{
background-image: url('https://t3.ftcdn.net/jpg/04/55/54/78/360_F_455547830_4JmGf5juUAVAMlLutLjVSbNvKvlaKnDO.jpg');
background-size: cover;
}
#title{
box-shadow: 5px 5px 5px 5px rgba(0,0,0,0.5);
text-align:center;
font-size: 36px;
font-weight: bold;
margin-left: 400px;
margin-top: 10px;
}
#links{
margin-top: 33px;
}
li{
margin-left: 10px;
}
#form{
margin-left: 700px;
width: 300px;
}
</style>
</head>
<body>
<div class="card card-body w-50" id="title">Bike Management System</div>
<nav class="navbar navbar-expand-lg navbar-light bg-light" id="links">
<div class="container-fulid">
 <div class="collapse navbar-collapse">
 <ul class="navbar-nav">
 		<li class="nav-item">
          <a class="nav-link active" href="<%=request.getContextPath()%>/home" target="Operation"><button class="btn btn-outline-success" >Home</button></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/insert" target="Operation"><button class="btn btn-outline-success" >Insert</button></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/update" target="Operation"><button class="btn btn-outline-success" >Update</button></a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/search" target="Operation"><button class="btn btn-outline-success" >Search</button></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/delete" target="Operation"><button class="btn btn-outline-danger" >Delete</button></a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/deleteAll" target="Operation"><button class="btn btn-outline-danger">DeleteAll</button></a>
        </li>
 </ul>
 </div>
</div>
</nav>
</body>
</html>