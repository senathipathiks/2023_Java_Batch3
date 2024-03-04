<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
body{
	background-image: url("https://images.pexels.com/photos/5088008/pexels-photo-5088008.jpeg?cs=srgb&dl=pexels-olia-danilevich-5088008.jpg&fm=jpg");
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
    background-color: rgb(255,255,255,0.4);
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;  
    margin-left:450px;
    margin-top:70px;
    border-radius: 30px;
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
    background-color: rgb(255,255,255,0.6);   
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-left:450px;
    margin-top:20px;
    text-align:center;    
}
table{
    width: 500px;
    background: rgb(2,0,36);
    background-color: rgb(255,255,255,0.4);
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-left:450px;
    text-align:center;
    
    
}
h1{
	width: 500px;
    background-color: rgb(255,255,255,0.4);   
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-left:450px;
    margin-top:20px;
    border-radius: 10px;
    text-align:center;    
}
</style>
</head>
<body>



<form action="Insertion" modelAttribute="bean">

	<table style="border:none;" id="new">
	<tr><td><h5><center>INSERT DETAILS</center></h5></td></tr>
		
		<tr><td>Id<input type="text" name="sid" autocomplete="on" placeholder="Enter id" required="required" style="float: right;"></td></tr>
		<tr><td>Name<input type="text" name="sname" autocomplete="on" placeholder="Enter name" required="required" style="float: right;"></td></tr>
		<tr><td>City Name<input type="text" name="scity" autocomplete="on" placeholder="Enter address" required="required" style="float: right;"></td></tr>
		
		<tr><td colspan="2" style="text-align: center;" id="div"><input type="submit" class="btn btn-light btn-lg" id="btn" name="button" value="Insert"></td></tr>
		
		
	</table>
	</form>
	
	
</body>
</html>