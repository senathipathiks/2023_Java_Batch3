<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        .reg{
            text-align: center;
            margin-top: 10px;
        }

        body{
            background-color: #eee;
            display: flex;
            font-family: sans-serif;
        }
         .container{
            margin-top: 17px;
            margin-left: 450px;
           max-width: 50px;
         }
         form{
            width: 400px;
            height: 550px;
            padding: 20px;
            background: white;
            border-radius: 4px;
            box-shadow: 0 5px 16px rgba(0, 0, 0, 3)
         }
         .form-control{
            padding-top:15px;
         }
         .form-group{
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            padding: 5px 20px;
            display: inline-block;
            width: 100%;
            box-sizing: border-box;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 2)
         }
         .form-group:hover{
            opacity: .8;
         }
         .check{
            font-family: Verdana, Geneva, Tahoma, sans-serif;
            margin-top: 15px;
         }

         .btn{
            text-align: center;
            width: 140px;
            outline: none;
            background-color: rgb(19, 91, 173);
            margin-top: 20px;
            margin-left: 150px;
            color: white;
            font-size: 20px;
            text-transform: uppercase;
            border-radius: 4px;
            cursor: pointer;
            box-shadow: 0 5px 10px rgba(0, 0, 0, 2)
         }
         .btn:hover{
            opacity: .7;
         }
         a{
            
            color: red;
         }
         .new{
            margin-top: 0px;
         }
    </style>
</head>
<body>
	
	<div class="container" >
        <form action="RegistractionForm" method="Post">
            <h1 class="reg">Registration Form</h1>

            <div class="form-control">
                <label for="user name">User Name</label>
                <input type="text" class="form-group" placeholder="First Name" name="fname" required><br><br>
                <input type="text" class="form-group" placeholder="Last Name" name="fname1" required>
            </div>

            <div class="form-control">
                <td><label for="Phone Number">Phone Number</label></td>
                <input type="number" class="form-group" placeholder="phone no" name="fpno" required> 
            </div>
            
                 <div class="form-control">
                <td><label for="Email">Email</label></td>
                <input type="email"class="form-group" placeholder="Email" name="fmail" required> 
            </div>


           <div class="form-control">
                <label for="password">Password</label>
                <input type="password" class="form-group" placeholder="Enter Password" name="pass" required>
           </div>

         

            <div class="check">
                <label>
                <input type="checkbox" checked="checked" name="remember">I Agree this 
                </label>
                
                <button class="btn">Register</button>
                </a>
                </div>
                </form>
               
          </div>

               
	
</body>
</html>