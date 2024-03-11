<%@ page language="java" 
	pageEncoding="ISO-8859-1"%>
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
</style>
</head>
<body>


	<div class="card">
		<h5 class="card-header bg-primary">Insertion Operation</h5>
		<div class="card-body ">
		
	 <form action="Insertion" modelAttribute="bean" name="loginform" method="post" onsubmit="return validation()"> 
        
        <div class="form-floating mb-3">
        <label for="floatingInput">ID</label>
       <input type="text" class="form-control" id="rmid" placeholder="ID" name="petid" >
       
     </div>
     
     <div class="form-floating mb-3">
       <label for="floatingPassword">Category</label>
       <input type="text" class="form-control" id="rmtype" placeholder="Category" name="category">
       
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Description</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Description" name="desc">
       
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Priority</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Priority" name="priority">
       
     </div>
     
     <div class="form-floating mb-3">
       <label for="floatingPassword">RaisedBy</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="RaisedBy" name="raisedby">
     </div>
      <div class="form-floating mb-3">
       <label for="floatingPassword">AssignedTo</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="AssignedTo" name="assignedto">
     </div>
     <div class="form-floating mb-3">
       <label for="floatingPassword">Status</label>
       <input type="text" class="form-control" id="rmtariff" placeholder="Status" name="status">
     </div>
    
     
       
     <br><br>
     
     <div class="form-floating">
      <input type="submit" value="Insert" name="button" class="btn btn-success"  >
       
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