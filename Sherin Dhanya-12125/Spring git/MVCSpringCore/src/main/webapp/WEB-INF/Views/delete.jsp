<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 <style>
*{
    margin: 7px;
    margin-left:5px;
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
form{
    width: 21rem;
    height: 22rem;
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
    
    margin-bottom: 55%;
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
    margin-left:25%;
    border: 5px;
    outline: auto;
    background: transparent;
    color:black;
    border-radius: 1px solid rgba(255,255,255,0.6);
    opacity: .8;
}
#button{
    width: 80%;
    margin: 3% auto;
    color: black;
    font-size: 15px;
    opacity: .7;
    background: rgba(255,255, 255, 0.06);
    padding-top:100px;
    padding: 10px 30px;
    margin-left: 20px;
    border: 3px;
    outline: 3px;
    border-radius: 20px;
    background-color: red;
    text-shadow: 2px 2px 4px rgba(255,255, 255, 0.06);
    box-shadow: 3px 3px 5pxrgba(31,38,135,.37) ;
    border-left: 1px solid rgba(255,255, 255, .3);
    border-top: 1px solid rgba(255,255, 255, .3);
}

</style>
</head>



<body >

<form action="Deletion" method="post">
<font size="5px" color="white">
<center>
<table border="1" class="btn">
<tr>
<td>Student Id:</td>
<td><select  type="text" name="id">
<c:forEach items="${idList}" var="id">
<option>${id}</option>
</c:forEach>
</select>

</td>
</tr>


<br>
<tr>
<td colspan="2"><input type="submit" class="btn bg-info btn-lg active" value="Delete" name="button" id="button" >
</td>
</tr>
</center>

</table>
</font>
</form>



</body>
</html>