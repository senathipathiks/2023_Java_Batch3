<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
}
#btn{
	width:100px;
}
table[id="new"]{
    width: 500px;
    background: rgb(2,0,36);
    background-color: rgb(255,255,255,0.4);
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-top:100px;
    margin-left:450px;
    border-radius: 30px;
}
table{
    width: 600px;
    background: rgb(2,0,36);
    background-color: rgb(255,255,255,0.4);
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-left:400px;
    margin-top:10px;
    border-radius: 10px;
    
   
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
    background-color: rgb(255,255,255,0.4);   
    color: black;
    padding: 10px 20px 30px;
    font-size: 20px;
    margin-left:450px;
    margin-top:20px;
    border-radius: 30px;
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

	<form action="View" method="post" modelAttribute="bean">
	<table style="border:none;" id="new">
	<tr><td><h5><center>VIEW DETAILS</center></h5></td></tr>
			<tr><td>Enter Id
			<select type="number" name="sid" autocomplete="on" placeholder="Enter id" required="required" style="float: right; width:70%; border-radius:10px;">
	
	<c:forEach items="${idList}" var="id">
	<option>${id}</option>
	</c:forEach>
	</select>
	</td>
	</tr>	
	<tr><td colspan="2" style="text-align: center;" id="div"><input type="submit" class="btn btn-light btn-lg" id="btn" name="button" value="View"></td></tr>
	</table>
</form>
</div>
</body>
</html>