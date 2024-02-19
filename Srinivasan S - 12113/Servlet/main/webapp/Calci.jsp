<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script> 

<style type="text/css">
body{
position: absolute;
left: 40%;
top:25%;
border: solid  2px;
background-color: gray;
}
form{
margin: 25px; 25px; 25px; 25px;

}
}
#tb1,#tb2{
font-style:oblique;
font-size: medium;

}

#b1,#b2,#b3{

margin:8px;
}
</style>
</head>
<body  className="container-fluid  ">
<form action="AddorMult" method="post">
Enter Num 1:<input  id=tb1 name=n1 type="text" placeholder="Num 1"><br><br>
Enter Num 2:<input id=tb2 name=n2 type="text" placeholder="Num 2"><br><br>
<button class="btn btn-md btn-success" id="b1" name="b1" value="btn1">Add</button>
<button class="btn btn-md btn-success"  id="b2" name="b1" value="btn2">Subtract</button>
<button class="btn btn-md btn-success"  id="b3" name="b1" value="btn3">Multiply</button>
</form>
</body>
</html>