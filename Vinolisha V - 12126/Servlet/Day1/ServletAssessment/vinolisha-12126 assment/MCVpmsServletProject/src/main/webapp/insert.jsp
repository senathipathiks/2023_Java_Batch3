<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
	background-image: url("https://img.freepik.com/premium-photo/yellow-pencil-bright-blue-background_25381-200.jpg");
	background-repeat: no-repeat;
	background-size: cover !important;

	
	
}
td{
	padding:10px;
}
#card{
width: 60%;
}
input{
	margin-left:40px;
	border-radius: 5px;
	margin-bottom:5px;
}
#btn{
	width:100px;
}
table[id="new"]{
    width: 500px;
    background: rgb(2,0,36);
    background: linear-gradient(90deg, rgba(2,0,36,1) 10%, rgba(76,110,136,1) 55%, rgba(64,124,193,1) 93%);
    color: white;
    padding: 10px 20px 30px;
    font-size: 20px;  
    margin-left:450px;
    margin-top:20px;
    border-radius: 30px;
}
h5{
	margin-left: 100px;
}
#div{
 background: linear-gradient(135deg, #153677, #23012c);
    height:60px;
    width: 70%;
    margin-left:70px;
   

}
#btn{
margin-left:60px;
margin-right:50px;
height:50px;
width:200px;
border-radius:10px;

}
h4{
    width: 500px;
    background: rgb(2,0,36);
    background: linear-gradient(90deg, rgba(2,0,36,1) 10%, rgba(76,110,136,1) 55%, rgba(64,124,193,1) 93%);
    color: white;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-left:450px;
    margin-top:20px;
    border-radius: 30px;
    text-align:center;    
}
</style>
</head>
<body>



<form action="Insertservlet" method="post">

	<table style="border:none;" id="new">
	<tr><td><h5>INSERT PLAYROLL DETAILS</h5></td></tr>
		<tr><td>RollId<input type="number" name="id" autocomplete="on" placeholder="Enter rollid" required="required" style="float: right;"></td></tr>
		<tr><td>Employee Name<input type="text" name="name" autocomplete="on" placeholder="Enter name" required="required" style="float: right;"></td></tr>
		<tr><td>Employee EmpId<input type="number" name="empid" autocomplete="on" placeholder="Enter empid" required="required" style="float: right;"></td></tr>
		<tr><td>Basics<input type="text" name="basic" autocomplete="on" placeholder="Enter Basic" required="required" style="float: right;"></td></tr>
		<tr><td>House Rent<input type="text" name="rent" autocomplete="on" placeholder="Enter rent" required="required" style="float: right;"></td></tr>
		<tr><td>Dearness Allowance<input type="text" name="dearness" autocomplete="on" placeholder="Enter Dearness Allowance" required="required" style="float: right;"></td></tr>
		<tr><td>Traveling Allowance<input type="text" name="travel" autocomplete="on" placeholder="Enter Travelling Allowance" required="required" style="float: right;"></td></tr>
		<tr><td>Cost of Company<input type="text" name="cost" autocomplete="on" placeholder="Enter Cost Company" required="required" style="float: right;"></td></tr>
		<tr><td colspan="2" style="text-align: center;" id="div"><input type="submit" class="btn btn-primary btn-lg" id="btn" name="button" value="Insert"></td></tr>
		
		
	</table>
	</form>
	
	
</body>
</html>