<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    cursor: pointer;

}
body{
    height: 100vh;
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
  background: linear-gradient(90deg, rgba(2, 0, 36, 1) 0%,
		rgba(9, 90, 121, 1) 39%, rgba(0, 212, 255, 1) 100%) !important;
     background-position: 100%;
    background-repeat: no-repeat;
    background-size: 120%;
    
}
form{
    width: 25rem;
    height: 28rem;
    display: flex;
    flex-direction: column;
    background: rgba(255,255, 255, 0.06);
    box-shadow: 0 8px 32px 0 rgba(31,38, 135, .37);
    border-radius: 30px;
    border-left: 1px solid rgba(255,255, 255, .3);
    border-top: 1px solid rgba(255,255, 255, .3);
}
h1{
    font-size: 18px;
    
    text-align: center;
    color: white;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
    letter-spacing: 3px;
    margin-bottom: 5%;
    opacity: .7;

}
label{
    font-size: 20px;
    color: black;
    margin-left: 10%;
    opacity: .8;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
}
input{
    width: 80%;
    margin: 5% auto;
    margin-bottom: 8%;
    border: 5px;
    outline: auto;
    background: transparent;
    color:black;
    border-radius: 1px solid rgba(255,255,255,0.6);
    opacity: .8;
}
#button{
    width: 50%;
    margin: 3% auto;
    color: black;
    font-size: 15px;
    opacity: .7;
    background: rgba(255,255, 255, 0.06);
    padding-top:30px;
    padding: 10px 30px;
    border: 3px;
    outline: 3px;
    border-radius: 20px;
    background-color: gray;
    text-shadow: 2px 2px 4px rgba(255,255, 255, 0.06);
    box-shadow: 3px 3px 5pxrgba(31,38,135,.37) ;
    border-left: 1px solid rgba(255,255, 255, .3);
    border-top: 1px solid rgba(255,255, 255, .3);
}
a{
    font-size: 12px;
    text-align: center;
    color: black;
    opacity: .7;
    cursor: pointer;

}
a:hover{
    color: red;
}

    </style>
</head>
<body>
<body>
<br><br><br><br>
<form action="InsertServlet" >
<font size="5px" color="white">
<center>
<table border="1" class="btn">


<tr><td>Employee Id:</td>
<td><input type="text" name="sid" required></td>
</tr>

<tr>
<td>Employee Name:</td>
<td><input type="text" name="sname" required></td>
</tr>

<tr>
<td>Employee City:</td>
<td><input type="text" name="scity" required></td>
</tr>

<tr>
<td>Employee PhoneNumber:</td>
<td><input type="text" name="sphoneno" required></td>
</tr>

<tr>
<td>Employee Department:</td>
<td><input type="text" name="sdepartment" required></td>
</tr>
<tr>
<td colspan="2"><input type="submit" class="btn bg-info btn-lg active" value="Update" name="button" id="button">
</td>
</tr>
</center>

</table>
</font>
</form>

</body>
</html>