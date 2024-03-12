<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
<style>
body {
	
	background-color:teal;
	font-family:monospace;
}

#colr2 {
	background: linear-gradient(to right, #C0C0C0, #808080);
}

#txt {
	padding-left: 90px;
	color: white;
}
#txt1{
padding-left: 100px;
color: white;
}
#txt2{
padding-left: 100px;
color: white;
}
</style>

</head>
<body>
<form action="Insertion" method="post">

		
			 <font size="5px" color="orange">
			 <a href="Home" name="Home" target="frame2" id="txt">Home</a>
			 
			 <a href="Insert"  name="Insert" target="frame2" id="txt1">Insert</a> 
			
			 <a href="Update" name="button" target="frame2" id="txt1" >Update</a>
			
			 <a href="Delete" name="Delete" target="frame2" id="txt1">Delete</a> 
			
			 <a href="Find" name="button" target="frame2" id="txt1" >Find</a>
			 
			 <a href="FindAll" name="button" target="frame2" id="txt1" >FindAll</a>
			 
			  <a href="About" name="button" target="frame2" id="txt2">About Us</a>
			  
			 
			 
			</font>
		</form>
</body>
</html>