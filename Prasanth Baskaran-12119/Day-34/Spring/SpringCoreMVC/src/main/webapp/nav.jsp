<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Management System</title>

    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" ></script>
  </head>
<style>

@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap');

  *{
    margin: 0%;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
  }
  #navbar{
    position: sticky;
    top: 0%;
    left: 0;
    z-index: 100%;
    padding: .5rem 5rem;
    box-shadow: 5px 5px 20px rgb(0,0,0,.5);
    background: black;
  }
 .navbar .navbar-brand{
    font-size: 25px;
    font-weight: 500;
    color: #29f700 !important;

  }
  #navbarSupportedContent a{

    color: #fff;
    border-bottom: 2px solid transparent;

  }
  #navbarSupportedContent a:hover{
    border-bottom: 2px solid #29f700;
  }
  #navbarSupportedContent  button{
    background: #29f700;
    width: 5rem;
    border-radius: 10px;
  }

</style>
  <body>
  <form action="Student" >
    <nav class="navbar navbar-expand-lg navbar-dark" id="navbar">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Student Management System</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-expanded="false" >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mx-auto">
              <li class="nav-item">
                <a class="nav-link" href="Home.jsp" target="frame2">Home</a>
              </li>

              <li class="nav-item">
                <a class="nav-link " name="button" value="insert" href="insert" target="frame2">Insert</a>
              </li>

              <li class="nav-item">
                <a class="nav-link " name="button" value="delete" href="delete" target="frame2">Delete</a>
              </li>

              <li class="nav-item">
                <a class="nav-link " name="button" value="edit" href="Edit" target="frame2">Edit</a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link " name="button"  target="frame2" value="listAll" href="listAll" target="frame2">List All</a>
              </li>
              
              <li class="nav-item">
                <a class="nav-link " name="button" value="list" target="frame2" href="search" target="frame2">List</a>
              </li>
              
               </ul>
            
               <button class="btn p-2 my-lg-0 my-2" >Sign In</button>
        </div>
      </nav>

</form>
  </body>
</html>
