<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
body{
	background-image: url("https://img.freepik.com/premium-photo/yellow-pencil-bright-blue-background_25381-200.jpg");
	background-repeat: no-repeat;
	background-size: cover;
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
}
#btn{
	width:100px;
}
table[id="new"]{
    width: 500px;
    height:300px;
    margin: 250px auto;
    background: rgb(2,0,36);
    background: linear-gradient(90deg, rgba(2,0,36,1) 10%, rgba(76,110,136,1) 55%, rgba(64,124,193,1) 93%);
    color: white;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-top:50px;
    margin-left:450px;
    border-radius: 30px;
}
h5{
	margin-left: 100px;
}
#div{
 background: linear-gradient(135deg, #153677, #23012c);
    height:90px;
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
    border-radius: 30px;
    text-align:center;
    margin-top:-200px;
    
}

</style>
</head>
<body>
	
	<form action="Insertservlet" method="post">
	<table style="border:none;" id="new">
	<tr><td><h5>DELETE PLAYROLL DETAILS</h5>
	<tr><td>Enter Playroll Id<input type="number" name="rollId" autocomplete="on" placeholder="Enter Playroll id" required="required" style="float: right;"></td></tr>
	<tr><td colspan="2" style="text-align: center;" id="div"><input type="submit" class="btn btn-danger btn-lg" id="btn" name="button" value="Delete"></td></tr>

</table>
</form>



</body>
</html>