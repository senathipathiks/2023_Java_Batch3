<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
          background: #1d96ab;
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
          background-color: #1d96ab;
          color: white;
          padding: 15px 20px;
          border: none;
          cursor: pointer;
          width: 50%;
          opacity: 0.9;
        }
        
        .btn:hover {
          opacity: 1;
        }
        </style>
</head>
<body>
 <div class="mt-5">
        <form action="Searchh" modelAttribute="bean" style="max-width:500px;margin:auto">
         <Center><h2>Search Details</h2></Center> 
          <div class="input-container">
            <i class="fa fa-user icon"></i>
            <select class="input-field" name="sid">
            <option>Select ID & View Details</option>
					<c:forEach items="${idList}" var="id">
					
					<option>${id}</option>
					</c:forEach>
					</select>
          </div>
        
          <div>
        
          
          
          </div>
          
          <div class="d-flex gap-4">
          <button type="submit" class="btn" name="button" value="Search"><i class="fa fa-search icon "></i>Search</button>
          <button type="submit" class="btn" name="button" value="View All""><i class="fa fa-eye icon "></i>View All</button>
		  </div>
        </form>
        <%-- <table>
        <tr>
        <td>id</td>
        <td>name</td>
        <td>city</td>
        </tr>
        <tr>
        <td>${bean.sid}</td>
        <td>${bean.sname}</td>
        <td>${bean.scity}</td>
        
        </tr>
        </table> --%>
        </div>
</body>
</html>