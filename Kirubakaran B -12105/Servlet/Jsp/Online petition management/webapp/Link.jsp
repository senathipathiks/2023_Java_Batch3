<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<style>
	.search{
		width: 150px;
	}
</style>
<body class="">
	<div class="">
		<nav class="navbar navbar-expand-lg navbar-dark d-flex justify-content-around bg-dark">
  <div class="container">
  <a class="navbar-brand" href="#">Kiruba</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  </div>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="Home.jsp" target="frame2">Home</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="About.jsp" target="frame2">About</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="Insert.jsp" target="frame2">Insert</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="Delete.jsp" target="frame2">Delete</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="Update.jsp" target="frame2">Update</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="Find.jsp" target="frame2">Find</a>
      </li>
    </ul>
    <form action="" class="form my-2 my-lg-0 d-flex">
      <input class="form-control mr-sm-2 search" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
	</div>
</body>
</html>
