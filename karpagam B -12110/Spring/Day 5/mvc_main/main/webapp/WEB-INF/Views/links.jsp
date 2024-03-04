<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    
    <style >
    .nav-link{
    color: white;
    }
    h3{
    font-style: italic;
    padding-left: 50px;
    border-radius: 3px;
    margin-left: 60px;
    color: black;
    }
    #logo{
    width: 90px;
    height: 50px;
   	margin-left: 150px;
   	 border-radius: 20%;
    }
    button{
    margin-left:5px;
    }
    </style>
</head>
 
<body>
	<nav class="navbar" style="background-color:white;">
  	<ul class="nav nav-pills" >
  <li class="nav-item">
    <a  aria-current="page" href="Home" target="frame2"><button class="btn btn-dark">HOME</button></a>
  </li>
  <li class="nav-item">
    <a  href="Insert" target="frame2"><button class="btn btn-info" ><b>INSERT</b></button></a>
  </li>
  <li class="nav-item">
    <a href="Delete" target="frame2"><button class="btn btn-info"><b>DELETE</b></button></a>
  </li>
  <li class="nav-item">
    <a  href="Update" target="frame2"><button class="btn btn-info"><b>UPDATE</b></button></a>
  </li>
  <li class="nav-item">
    <a  href="View" target="frame2"><button class="btn btn-info"><b>FIND</b></button></a>
  </li>
  <li class="nav-item">
    <a  href="FindAll" target="frame2"><button class="btn btn-info" ><b>FIND ALL</b></button></a>
  </li>
  
   <li class="nav-item">
   <h3 ><i>LIBRARY MANAGEMENT SYSTEM</i></h3>
  </li>
  <li class="nav-item">
  <img alt="logo" src="https://icon-library.com/images/inventory-management-icon/inventory-management-icon-11.jpg" id="logo" />
  </li>
  
 
  </ul>
	</nav>
	</div>
</body>
</html>