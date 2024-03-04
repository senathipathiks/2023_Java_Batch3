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

.mySlides{
	border-radius: 15px;
}

</style>

</head>
<body>
<h2 style="font-style: italic;color: black;margin-left: 37rem;padding-top: 20px ;">Our Institutions	</h2>
<div class="w3-content w3-section" style="max-width:500px" id="div1">
  <img class="mySlides" src="https://research.collegeboard.org/media/2022-02/iStock_000021255451_Large-780x585.jpg" style="width:120%";height: 70%">
  <img class="mySlides" src="https://c1.wallpaperflare.com/preview/467/281/148/university-kth-royal-institute-of-technology-brick-building.jpg" style="width:120%;height: 70%">
  <img class="mySlides" src="https://indiaeducationdiary.in/wp-content/uploads/2020/12/KTH-Borggarden_Jann-Lipka-870x579-1.jpg-1920x.jpg" style="width:120%"; height: 60%">
  <img class="mySlides" src="https://www.businessinsider.in/thumb/msid-76332000,width-700,height-525/Indian-Institute-of-Technology-IIT-Madras.jpg" style="width:120%"; height: 70%">
  <img class="mySlides" src="https://www.millenniumpost.in/h-upload/2023/03/15/1600x960_681837-23epbslead.jpg" style="width:120%"; height: 70%">
  <img class="mySlides" src="https://skilloutlook.com/wp-content/uploads/2020/12/Dayalbagh-20-Dec-2020-1.jpg" style="width:120%";height: 70%">
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