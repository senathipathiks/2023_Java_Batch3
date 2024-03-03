<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
      
      
    ></script>
    
    
  <style>
  div .carousel-inner{
  
  box-shadow: 15px 20px 20px rgba(0,0,0,.3);
  }
  
 #pic{
 box-shadow: 15px 20px 20px rgba(0,0,0,.3);
 }
  
  </style>  
</head>
<body>
      <!-- Home Page -->
      <br><br>
      <section id="home" class="jumbotron jumbotron-fluid bg-light text-dark">
        <div class="container">
            <h1 class="display-4 fw-bold lh-1 mb-3">Welcome to the Student Gang!</h1>
            <p class="lead my-2"></p>
            <hr class="my-4" />
            <div class="row gx-5 gy-5">
                <div class="col-md-6 col-lg-4 d-none d-sm-block">   
                    <img src="https://wallpaperaccess.com/full/3645264.jpg" alt="" width="80%" height="auto" id="pic"/>
                </div>
                <div class="col-md-6 col-lg-8"> 
                    <h2 class="fw-bolder mb-2">About Us</h2>
                    <p class="mb-4
                    lead">The Student Gang ! is a web application that allows users to search for Students Details, add them to their details and manulate them.</p>
                 
                </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Advertaicement  Section -->
    <section class="py-5 bg-light">
        <div class="container p-0">
            <div class="row flex-center">
                <div class="card  w-75 shadow-sm">


    <div id="carouselExampleIndicators" class="carousel slide">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
          <div  class="carousel-item active">
            <img id="mySlides" src="https://wallpapercave.com/wp/wp4385848.jpg" class="d-block w-100" alt="...">
          </div>
          <div  class="carousel-item">
            <img id="mySlides" src="https://wallpapercave.com/wp/wp4385848.jpg" class="d-block w-100" alt="...">
          </div>
          <div  class="carousel-item">
            <img  id="mySlides"  src="https://wallpapercave.com/wp/wp4385848.jpg" class="d-block w-100" alt="...">
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
        <!-- aside  content-->
        <div class="d-flex align-items-center justify-content-between mb-4">
        <div class="w-100 ms-auto p-4">
            <h5 class="text-start text-muted fst-italic mb-4 ">Our Moto</h5> 
            <h5 class="text-start  text-primary fw-bold ">To Simplify the All the Student management System work, We do our Job try our level best !
               </div>
      </div>
    </div>
</div>
        </div>
    </section>
    <!--  Footer Section -->
    <footer class="bg-dark  bg-opacity-2 text-white py-2">
        <div class="container">
            <div class="flex-center flex-column">
                <p class="text-center form-control-lg ">&copy; Copyright 2024 - Prasanth Baskaran</p>
              
            </div>
        </div>
    </footer>
   <script type="text/javascript">
   var myIndex = 0;
   carousel();
    
   function carousel() {
     var i;
     var x = document.getElementsByClass("d-block w-100");
     for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
     }
     myIndex++;
     if (myIndex > x.length) {myIndex = 1}    
     x[myIndex-1].style.display = "block";  
     setTimeout(carousel, 1000); // Change image every 2 seconds
   }
   </script>
</body>
</html>