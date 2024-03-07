<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
color:black;
text-shadow:3px 3px blue;
align-items:center;
margin-right: 30px;
transform:rotate(45 deg);
transition:0.5s;
}

 body{
 background-image: url("https://t3.ftcdn.net/jpg/03/55/60/70/360_F_355607062_zYMS8jaz4SfoykpWz5oViRVKL32IabTP.jpg");
 background-repeat: no-repeat;
 background-size: cover;
 height: 60px;
 }
#home{
padding-left: 319px;
color:black;
text-decoration: none;
font-weight:900;
}
#home:hover{
color:red;
}

</style>
</head>
<body>

<h1><center><i>WELCOME TO STUDENT MANAGEMENT SYSTEM</i></center></h1>

<a href="home" target="frame2" id="home" >Home</a>
<a href="About.jsp" target="frame2"  id="home">About</a>
<a href="Contact.jsp" target="frame2"  id="home">ContactUs</a>
</body>
</html>