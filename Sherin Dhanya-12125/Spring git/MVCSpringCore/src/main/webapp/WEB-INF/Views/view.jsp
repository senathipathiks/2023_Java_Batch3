<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 <style>
*{
    margin: -141px;
 
    padding: 0;
    box-sizing: border-box;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    cursor: pointer;
    font-size: large;

}
body{
    height: 100vh;
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
  
    background-position: 100%;
    background-repeat: no-repeat;
    background-size: 120%;
background: rgb(238,174,202);
background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
   }
   
.text{
 font-size: 50px;
    text-align: center;
    color: white;
    text-shadow: 2px 2px 4px rgba(0,0,0,.2);
    letter-spacing: 3px;
    margin-bottom: 5%;
    padding-top:20px;
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
    width: 83%;
    margin: 24% auto;
   
    margin-bottom: 26%;
    margin-left:25%;
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
    border: 3px;
    padding: 10px 30px;
    
    outline: 3px;
    border-radius: 20px;
    text-shadow: 2px 2px 4px rgba(255,255, 255, 0.06);
    box-shadow: 3px 3px 5pxrgba(31,38,135,.37) ;
    border-left: 1px solid rgba(255,255, 255, .3);
    border-top: 1px solid rgba(255,255, 255, .3);
}
  


</style>
</head>
<body >
<br><br><br><br>
<form action="View"  >
<font size="5px" color="blue" class="text">

<table border="2" class="btn">
<tr><td>Student Id:</td>
<td><input type="number" name="id" ></td>
</tr>



<tr>
<td colspan="2"><input type="submit" class="btn bg-info btn-lg active" value="View" name="button" id="button" >

</td>
</tr>


</table>
</font>
</form>



</body>
</html>