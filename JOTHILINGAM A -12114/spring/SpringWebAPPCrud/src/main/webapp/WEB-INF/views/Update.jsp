<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/font-awesome.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">

 
        body {font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box;}
        
        .input-container {
          display: -ms-flexbox; /* IE10 */
          display: flex;
          width: 100%;
          margin-bottom: 15px;
        }
        
        .icon {
          padding: 10px;
          background: green;
          color: white;
          min-width: 50px;
          text-align: center;
        }
        
        .input-field {
          width: 100%;
          padding: 10px;
          outline: none;
        }
        
        .input-field:focus {
          border: 2px solid dodgerblue;
        }
        
        /* Set a style for the submit button */
        .btn {
          background-color: green;
          color: white;
          padding: 15px 20px;
          border: none;
          cursor: pointer;
          width: 50%;
          opacity: 0.9;
          margin-left: 25%;
        }
        
        .btn:hover {
          opacity: 1;
        }
        </style>
</head>
<body>
 <div class="mt-5">
        <form action="Updation" modelAttribute="bean" style="max-width:500px;margin:auto">
         <Center><h2>Update Details</h2></Center> 
          <div class="input-container">
            <i class="fa fa-id-card icon"></i>
           <select class="input-field" name="sid">
           			<option>Select ID you Want to Update</option>
					<c:forEach items="${idList}" var="id">
					<option>${id}</option>
					</c:forEach>
					</select>
          </div>
        
          <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="Enter Employee Name" name="sname">
          </div>
          
          <div class="input-container">
            <i class="fa fa-birthday-cake icon"></i>
            <input class="input-field"  placeholder="Enter Employee Age" name="scity">
          </div>
        
          <button type="submit" class="btn" name="button" value="Update"><i class="fa fa-edit icon"></i>Update</button>
        </form>
        </div>
</body>
</html>