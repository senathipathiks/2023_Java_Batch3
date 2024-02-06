<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Auth Jsp</title>
</head>
<body>
<form action="AuthServlet" >
        
            <div class="container">

              <br>
               <label for="email">Username</label>
              <input type="text" placeholder="Enter UserName" name="user" id="email" required><br><br>
                    
              <label for="psw">Password</label>
              <input type="password" placeholder="Enter Password" name="psw" id="psw" required><br><br>
          
              <hr>
              
              <button type="submit" >Submit</button>
             
          
             </div>
          </form>

</body>
</html>