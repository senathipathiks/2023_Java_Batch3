<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style type="text/css">
body{

	background-color:#DCB0FF;
}
#title{
font-family: sans-serif;
color: #563594;
text-align: center;
font-size: 12px;
}
 
a{
text-decoration: none;
color: black;
font-weight: 600;
font-family: sans-serif;
padding: 5px;
border-radius: 10px;
transition: 0.2s;
}
 
a:hover{
background-color: #87CEEB;
color: white;
 
}
 
#collection{
display: flex;
flex-direction: row;
background-color: white;
justify-content: space-around;
width: 450px;
height: 30px;
align-items: center;
border-radius: 15px;
 
}
 
#content{
display: flex;
justify-content: center;
}
</style>
</head>
<body>
<div id = "title">
	<h1>Online Ticket Management System</h1>
	</div>
	<div id = "content">
	<div id = "collection">
	
	
	<div><a href="Insert" target="Operation">INSERT</a></div>
	<div><a href="Delete" target="Operation">DELETE</a></div>
	<div><a href="Update" target="Operation">UPDATE</a></div>
	<div><a href="find" target="Operation">FIND</a></div>
	<div><a href="findAll" target="Operation">FINDAll</a></div>
</div>	
</div>

</body>
</html>