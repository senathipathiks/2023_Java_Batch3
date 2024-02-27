<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert </title>
</head>
<body>
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
    background-color:rgba(0,0,0,0.3);
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
    color: white;
    padding: 0 5px;
    margin: 0 5px;
}

</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<form action="Servlet" method="post">
<div class="bg-img"> <img src="https://patch.com/img/cdn20/users/44719/20220708/034933/styles/patch_image/public/jag-cz-movie-theater-retro-shutterstock-594132752___08145547348.jpg" alt=""></div>
    <div class="totalcontainer">
        <div class="bodycontainer">
            <div class="container1">
                
                    
                    <input class="inputbox" type="text" placeholder="Enter Movie  Name" name="name"><br>
                   
                    <input class="inputbox" type="text" placeholder="Enter ScreenNo" name="screenno"><br>
                
                    <input class="inputbox" type="text" placeholder="Enter Ticket Id" name="ticketid"><br>
               
                    <center><input class="submitbtn" type="submit" value="Insert" name="button"></center>
               
    		</div>
               
           </div>
	</div>
	</form>

</body>
</html>
</body>
</html>