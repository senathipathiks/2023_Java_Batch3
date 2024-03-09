<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<style >
#div1{
position: absolute;
top: 50%;
left: 46%;
transform: translate(-50%, -50%)

}

/* body{
background-image:url("https://img.freepik.com/free-photo/abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner_1258-52630.jpg?size=626&ext=jpg&ga=GA1.1.87170709.1707955200&semt=ais");
backbackground-repeat: no-repeat;
background-size: 100%;
} */


</style>

</head>
<body>
<h2 style="font-style: italic;color: white;margin-left: 34rem;padding-top: 20px ;">Our Group of companies	</h2>
<div class="w3-content w3-section" style="max-width:500px" id="div1">
  <img class="mySlides" src="https://www.wardell-armstrong.com/wp-content/uploads/2022/12/OpenPit.jpg" style="width:120%">
  <img class="mySlides" src="https://www.arabnews.com/sites/default/files/styles/n_670_395/public/2023/07/10/3902021-1042942972.jpg?itok=nnzzxZux" style="width:120%;height: 70%">
  <img class="mySlides" src=https://images.moneycontrol.com/static-mcnews/2022/05/logistic.jpg?impolicy=website&width=1600&height=900" style="width:120%"; height: 70%">
   <img class="mySlides" src="https://5.imimg.com/data5/SELLER/Default/2023/4/299323027/VJ/DW/FD/28880772/old-iocl-petrol-pump-canopy-work-500x500.jpeg" style="width:120%"; height: 70%">
    <img class="mySlides" src="https://5.imimg.com/data5/SELLER/Default/2023/4/299323027/VJ/DW/FD/28880772/old-iocl-petrol-pump-canopy-work-500x500.jpeg" style="width:120%"; height: 70%">
  
    <img class="mySlides" src="https://img.etimg.com/thumb/width-640,height-480,imgsize-101780,resizemode-75,msid-97991084/industry/healthcare/biotech/healthcare/max-princeton-healthcare-among-11-entities-interested-in-sevenhills-hospital/hospital-new.jpg" style="width:100%">
</div>

<script>
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
 

</body>
</html>