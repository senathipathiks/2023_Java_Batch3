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
    color: black;
    }
    h3{
    font-style: italic;
    padding-left: 100px;
    border-radius: 3px;
    }
    #logo{
    width: 80px;
    height: 50px;
   	margin-left: 300px;
   	 border-radius: 20%;
    }
    </style>
</head>

<body>
	<div class="container-fluid">
	<nav class="navbar" style="background-color:white;">
  	<ul class="nav nav-pills" >
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="Home.jsp" target="frame1">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="Add.jsp" target="frame1">Insert</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="Search.jsp" target="frame1">Search</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="Update.jsp" target="frame1">Update</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="Delete.jsp" target="frame1">Delete</a>
  </li>
  
   <li class="nav-item">
   <h3 >Sri group of companies</h3>
  </li>
  <li class="nav-item">
  <img alt="logo" src="https://us.123rf.com/450wm/artbandung99/artbandung992006/artbandung99200600298/151511884-shield-letter-s-vector-logo-template.jpg" id="logo" />
  </li>
  
 
  </ul>
	</nav>
	</div>
</body>
</html>