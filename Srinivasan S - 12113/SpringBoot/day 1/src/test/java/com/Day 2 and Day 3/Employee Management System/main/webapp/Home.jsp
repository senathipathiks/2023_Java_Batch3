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
  <img class="mySlides" src="https://c4.wallpaperflare.com/wallpaper/148/392/948/1920x1080-px-books-interior-design-interiors-knowledge-library-shelves-anime-pokemon-hd-art-wallpaper-preview.jpg" style="width:120%";height: 70%">
  <img class="mySlides" src="https://e0.pxfuel.com/wallpapers/481/181/desktop-wallpaper-library-background-library-laptop.jpg" style="width:120%;height: 70%">
  <img class="mySlides" src="https://png.pngtree.com/background/20230424/original/pngtree-large-library-filled-with-books-picture-image_2458791.jpg" style="width:120%"; height: 60%">
  <img class="mySlides" src="https://w0.peakpx.com/wallpaper/960/362/HD-wallpaper-library-background-beautiful-library-book.jpg" style="width:120%"; height: 70%">
  <img class="mySlides" src="https://images.pexels.com/photos/2041540/pexels-photo-2041540.jpeg?cs=srgb&dl=pexels-rafael-cosquiere-2041540.jpg&fm=jpg" style="width:120%"; height: 70%">
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