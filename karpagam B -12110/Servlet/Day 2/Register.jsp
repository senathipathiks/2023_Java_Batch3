<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<style>
        .container {font-family: Arial, Helvetica, sans-serif;
        border:4px solid black;
        position:absolute;
        left: 35%;
        top: 9%;
        text-align:center;
        padding: 2%;
        background-color: black;
        color: white;
        border-radius: 30px;
     }
        input [type=text] , input [type= password]{
            width: 80%;
            padding-top: 20%,20%;
            margin: 8px 0;
            display: inline-block;
            border: 2px solid #ccc;
            box-sizing: content-box;
            
        }
        button {
            background-color: #DC143C;
            color: white;
            padding: 10px 10px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 20%;
        }
        button:hover{
            opacity:0.9;;
        }
        a{
            text-decoration: none;

        }
        a:hover{
            color : red;
        }
       
        body{
            background-color:rgb(238, 211, 247);
        }
</style>
</head>
<body>
<form action="RegisterPageServlet" method="post">
        
            <div class="container">

              <center><i><h1 style="color:crimson">USER REGISTRATION</h1></i></center>
              <p><b>Please fill in this form to create an account ! </b></p>
              <hr><br>
               <label for="email">Username</label>
              <input type="text" placeholder="Enter UserName" name="user" id="email" required><br><br>
          
          
              <label for="email">Email</label>
              <input type="text" placeholder="Enter Email" name="email" id="email" required><br><br>
          
              <label for="psw">Password</label>
              <input type="password" placeholder="Enter Password" name="psw" id="psw" required><br><br>
          
              <hr>
              
              <button type="submit" >Register</button>
             
          
             </div>
          </form>

</body>
</html>