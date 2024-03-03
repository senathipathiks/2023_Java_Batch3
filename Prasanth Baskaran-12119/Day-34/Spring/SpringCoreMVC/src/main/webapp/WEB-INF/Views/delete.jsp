<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.spring.controller.StudentController" %>    
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student management system</title>
<link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
    
    <style type="text/css">
    
     div .card{
  
  height : 200px;
  width : 400px;
 
 }
    
    </style>
</head>
<body>



<div class="mt-2 container d-flex flex-column  justify-content-center  align-items-center vh-100">
 
		<div class="card">
  <h3 class="card-header text-align-center">Delete Students</h3>
  <div class="card-body">
   
  
		<form  action="Deletion" modelAttribute="bean">
		<font size="5px">
			
				
				<fieldset class="form-group">
                            <label>Student Id</label> <select   class="form-control" name="id" required="required" title="select Enter a name " >
                            <c:forEach items="${idList}" var="id">
                            
                            <option>${id}</option>
                            </c:forEach>
                            </select>
                        </fieldset>
				
				<center>
					<input
						class="btn btn-primary mt-3" type="submit" value="delete" name="button" /></td>
				</center>
			</font>
		</form>
		
   
  </div>
</div>
		
		
	</div>
</body>
</html>