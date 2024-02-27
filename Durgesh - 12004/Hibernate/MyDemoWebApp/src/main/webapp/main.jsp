<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" 
      crossorigin="anonymous">
      
      <style>
      #body {
       align-content: center;
       justify-content: center;
       align-items: center;
      }
      #card {
      background-color: lightblue;
      color: darkblue;
      border: solid;
      border-width: 5px;
      border-color: darkblue;
      margin-top: 250px;
            }
      </style>
      
      
</head>
<body id= "body">

<center>
<div class = "card w-50" id= "card">

<form action="regis.jsp">

<table>
<tr><h4>Registration Form</h4> </tr>
<tr>
<td><label>Username : </label> </td>
<td><label><input type="text" name = "uname"> </label> </td>
</tr>

<tr>
<td><label>Password : </label> </td>
<td><label><input type="password" name = "passw"> </label> </td>
</tr>

<tr> 
<td> 
<input type="submit" value="Submit" name= "button">
</td>
</tr>

</table>
</form>
</div>
</center>

</body>
</html>