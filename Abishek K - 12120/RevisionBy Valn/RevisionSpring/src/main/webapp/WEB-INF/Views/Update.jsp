<%@ page language="java" 
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
.card{
	height:730px;
	width:500px;
	margin-left:30%;
	margin-top:40px;
	padding:30px;
	margin-bottom:30px;
}
body{
background-color: #A7BEAE;
}
#noti{
align-items:center;
width:50%;
height:60px;
margin-left:30%;
margin-bottom:40px;
}
select{
width:100%;
border-radius: 4px;
}
</style>
</head>
<body>


	<div class="card">
		<h5 class="card-header bg-primary">Insertion Operation</h5>
		<div class="card-body ">
	   <div class="form-floating mb-3">
       <label for="floatingInput">ID</label>
       
       <form action="Fetch" modelAttribute="bean" method="post">
       <select class="form-select form-select-sm" aria-label=".form-select-sm example" name="eid">
       <option selected>Emp ID</option>
       <c:forEach items="${IdList}" var="id">
       <option value="${id}">${id}</option>
       </c:forEach>
       </select><br><br>
      <input type="submit" class="btn btn-warning" value="fetch" />
      </form>
      </div>
      
      <form action="Updation" method="post" modelAttribute="bean">
      
       <div class="form-floating mb-3">
        <label for="floatingInput">ID</label>
       <input type="text" class="form-control" id="rmid" placeholder="Employee ID" name="eid" value="${emp.eid}">
       
     </div>
     
     <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Name</label>
       <input type="text" class="form-control" id="rmtype" placeholder="Employee Name" name="ename" value="${emp.ename}">
       
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Employee Salary</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Employee Salary" name="esalary" value="${emp.esalary}" >
       
     </div>
    
     
       
     <br><br>
     
     <div class="form-floating">
      <input type="submit" value="Update" name="button" class="btn btn-success"  >
       
     </div>
     </form>
     
       </div>
     </div>
     

     <script>

        function validation(){
            console.log("abishek");

            var rmid = document.getElementById("rmid").value;
            var rmtype = document.getElementById( "rmtype").value;
            var  rmtariff = document.getElementById("rmtariff").value; 
            var rmdesc = document.getElementById( 'rmdesc').value;
            var rmoccup = document.getElementById( 'rmoccup').value;
           

                     

            
            if(rmtype=="" || rmtype==null){
                alert("Please fill the RoomType");
                return false;
            }
            else if(rmtariff=="" || rmtariff==null){
                alert("Please fill the RoomTariff");
                return false;
            }
            else if(rmdesc=="" || rmdesc ==null){
                alert("Please fill the  RoomDescription");
                return false;
            }
            else if(rmoccup=="" || rmoccup==null){
                alert("Please fill the RoomOccupancy");
                return false;
            }
            else{
        	document.loginform.submit(); 
        }
         
        
    }
     </script>
     
     
     <%
     
     String result = (String) request.getAttribute("Action");
     
     if(result!=null){
    	 
     if(result.equals("Success")){
    	 out.print("<div class=\"card-body bg-success\" id=\"noti\"><h3><font color=white>Insertion Operation is Successfully Done</font></h3></div>");
     }
     else{
    	 out.print("<div class=\"card-body bg-danger\" id=\"noti\"><h3><font color=white>Insertion Operation is Failure</font></h3></div>");
     }
     
     }
     %>
     
</body>
</html>