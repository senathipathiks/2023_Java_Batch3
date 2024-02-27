<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.mms.bean.Mms" %>
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
    background-color:rgba(0,0,0,0.1);
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
    border: 2px solid white;
    border-radius: 20px;
    margin: 5px;
    color: white;
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

Mms stud=(Mms)request.getAttribute("bean");


out.write("<br><br><br>");
out.write("<font size=5px color=white> <table align=center border=1> "
		+"<tr>"
		+"<th> Movie Name </th>"
		+"<th> Screen No </th>"
		+"<th> Ticket Id </th>"
		+"</tr>"
		+"<tr>"
		+"<td>"+stud.getMovieName()+"</td>"
		+"<td>"+stud.getScreenNo()+"</td>"
		+"<td>"+stud.getTicketId()+"</td>"
		); %>
		
</div>
</div>
</div>
</form>
</body>
</html>