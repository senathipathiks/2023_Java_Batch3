<!DOCTYPE html> 
<html> 
  
<head> 
    <title>Registration Form</title> 
    <link rel="stylesheet" 
          href="style.css"> 
</head> 
  
<body> 
    <div class="main"> 
         <form action="register.jsp">
            <label for="first">First Name:</label> 
            <input type="text" id="first" 
                   name="name" 
                   placeholder="Enter your first name"> 
             <br>
            <label for="last">Email:</label> 
            <input type="email" id="last" name="email" 
             placeholder="Enter your email id" >
            <br>
            <label for="password">Password:</label> 
            <input type="password" id="password" 
                   name="password"
                   placeholder="Enter your password" >
                <br>
                <button type="submit"> 
                  submit 
                  </button> 
            </div> 
         </form>    
</body> 
  
</html> 