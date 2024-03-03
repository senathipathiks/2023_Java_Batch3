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
    
 <style>
 
 div .card{
  
  height : 400px;
  width : 400px;
 
 }
 
 #btn{
 width: 100px
 }
 
 </style>   
</head>
<body>
<div class="mt-2 container d-flex flex-column  justify-content-center  align-items-center vh-100 col-md-5" style={height:" 400px"}>
 
		<div class="card ">
		<div id="insersion">
  <h3 class="card-header">Edit Students</h3>
  <div class="card-body">
   
  
		<form  action="Updation">
		<font size="5px">
		               
		               <fieldset class="form-group">
                            <label>Student Id</label> <select type="text"  class="form-control" name="id" required="required" title="Please select Enter a id " >
                            <c:forEach items="${idList}" var="id">
                            
                            <option>${id}</option>
                            </c:forEach>
                            </select>
                        </fieldset>
				
				
				       <fieldset class="form-group">
                            <label>Student Name</label> <input type="text"  class="form-control" name="name" required="required" title="Please Enter a name " />
                        </fieldset>


                        <fieldset class="form-group">
                            <label>Student Email</label> <input type="email"  class="form-control" name="email" required="required" title="Please Enter a Email" />
                        </fieldset>
                        
                         <fieldset class="form-group">
                            <label>Student Phone</label> <input type="text"  class="form-control" name="phone" required="required" title="Please Enter a phone" />
                        </fieldset>

                       
				 <fieldset class="form-group">
					<center>  <input
						class="btn btn-primary mt-5" id = "btn" type="submit" value="edit" name="button"  required /></center>
				 </fieldset>
			</font>
		</form>
		
    </div>
  </div>
</div>
		
			
		
		
	</div>
</body>
</html>