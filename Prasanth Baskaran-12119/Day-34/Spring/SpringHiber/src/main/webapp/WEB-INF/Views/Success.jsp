<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>\
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
</head>
<body>
<div class="d-flex  justify-content-center align-items-center vh-100 form-control-lg">
<div class="card style="width: 40rem;">
  <h5 class="card-header">Message</h5>
  <div class="card-body">
    <h5 class="card-title">Registration Page</h5>
    <p class="card-text">Your Details are saved successfully in a Backend !!!</p>
     <p class="card-text"><b><u>Your Details Are Below</u></b></p>
     <p class="card-text"><b>UserName :</b>${log.name}</p>
     <p class="card-text"><b>Email :</b>${log.email}</p>
     <p class="card-text"><b>Password :</b>${log.password}</p>
    <a href="index.jsp" class="btn btn-primary">Go Back</a>
  </div>
</div>
</div>
</body>
</html>