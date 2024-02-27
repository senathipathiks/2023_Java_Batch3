<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.OCMS.bean.Ocms" %>
<%@page import="java.util.LinkedList"%>
<!DOCTYPE html>
<html>
<head>
<style>
	.header{
    display: flex;
    flex: 2;
    flex-direction: row;
    justify-content: space-between;
}

img{
    background-repeat:no-repeat;
    background-size:cover; 
    height: 100%;
    width: 100%;
}

.bg-img{
    background-image:url('');
    background-repeat:no-repeat;
    background-size:cover;
    filter: blur(5px);
    height: 100%;
    width: 100%;
    position: absolute;
}

.totalcontainer{
    position: relative;
}

div{
    color: whitesmoke;
    font-weight: bolder;
    font-size: 26px;
}
.menu{
    display: flex;
    flex: 1;
    flex-direction: row;
    justify-content: space-between;
    margin-left: 30px;
    margin-right: 30px;
    align-items: center;
    
}

.empty{
    display: flex;
    flex: 1;
}

#link{
    text-decoration: none;
    color: whitesmoke;
    font-size: 26px;
}

.bodycontainer{
    display: flex;
    justify-content: center;
    height: 100%;
    
}

.container1{
    background-color:rgba(120,153,173,0.7);
    display: flex;
    justify-content: center;
    flex-direction: column;
    border-radius: 10px;
    padding: 15px 10px;
    width: 30%;
    margin-top: 10%;
}

.inputbox{
    background-color: transparent;
    width: 95%;
    height: 30px;
    border: 2px solid black;
    border-radius: 20px;
    margin: 5px;
}

.submitbtn{
    background-color:rgba(120,153,173,0.7);
    width: 100px;
    border:1px black solid;
    border-radius: 10px;
    padding: 10px;
    cursor: pointer;
    
}

.submitbtn:hover{
    background-color:transparent;
    width: 100px;
    border:1px black solid;
    border-radius: 10px;
    padding: 10px;
}

::placeholder{
    color: black;
    padding: 0 5px;
    margin: 0 5px;
}
	

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Servlet" method="post">
<div class="bg-img"> <img src="https://c4.wallpaperflare.com/wallpaper/595/197/79/landscape-deer-sun-pine-trees-wallpaper-preview.jpg" alt=""></div>
    <div class="totalcontainer">
        <div class="bodycontainer">
            <div class="container1">



<%

Ocms course=(Ocms)request.getAttribute("bean");


out.write("<br><br><br>");
out.write("<font size=5px color=black> <table align=center border=1> "
		+"<th> Course ID </th>"
		+"<th> Course name </th>"
		+"<th> Course TYpe </th>"
		+"<th> Course Duration</th>"
		+"<th> Course Fee</th>"
		+"</tr>"
		+"<tr>"
		+"<td>"+course.getCourseID()+"</td>"
		+"<td>"+course.getCourseName()+"</td>"
		+"<td>"+course.getCourseType()+"</td>"
		+"<td>"+course.getCourseDuration()+"</td>"
		+"<td>"+course.getCourseFee()+"</td>"
		); %>
</div>
</div>
</div>
</form>
</body>
</html>



