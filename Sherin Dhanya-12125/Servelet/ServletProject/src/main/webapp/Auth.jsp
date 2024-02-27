<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AuthServlet" >
        
            <div class="container">

              <br>
               <label for="email">user</label>
              <input type="text" placeholder="Enter UserName" name="userr" id="email" required><br><br>
                    
              <label for="psw">pass</label>
              <input type="password" placeholder="Enter Password" name="psw" id="psw" required><br><br>
          
              <hr>
              
              <button type="submit" >Submit</button>
             
          
             </div>
          </form>
</body>
</html>