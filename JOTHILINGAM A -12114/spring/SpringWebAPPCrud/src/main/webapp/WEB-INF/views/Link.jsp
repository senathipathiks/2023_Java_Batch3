<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Link Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
#btn {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #04AA6D;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

#btn:hover {background-color: #3e8e41}

#btn:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
</head>
<body>
<div  ><a href="Insert.jsp" id="btn" name="button" target="frame2" >Insert</a></div>
<div " ><a href="Delete.jsp" class="btn btn-primary" name="button" target="frame2">Delete</a></div>
<div class="card card-body text-center " style="width:90%;"><a href="Update.jsp" class="btn btn-primary " name="button" target="frame2">Update</a></div>
<div class="card card-body text-center " style="width:90%;"><a href="Search.jsp" class="btn btn-primary" name="button" target="frame2">Search</a></div>
</body>
</html>