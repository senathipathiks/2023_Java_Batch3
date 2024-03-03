<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.spring.bean.Student" %> 
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
    
   <style type="text/css">
   
#products h1{
    font-size: 50px;
    letter-spacing: 2px;
    font-weight: 700;
}

#products img{

    width: 200px;
    height: 200px;
}
.card{
    width: 250px;
    height: 300px;
    background:#e5e5e5 !important;
    border :none !important;
    box-shadow: 15px 20px 20px rgba(0,0,0,.3);
    inset: 4px 4px 10px #fff;
    border-radius: 20px !important;
    overflow: hidden;
    justify-content: center;
    align-items: center;
    margin: 20px 60px;
   
}

img {
  margin-top: 40px !important;
}

body{
            
             font-family: Verdana, Geneva, Tahoma, sans-serif;
}
   </style>
</head>
<body>

	<!-- Showing result to the user whether data is inserted or not -->
		
		<div class="d-flex  justify-content-center align-items-center vh-100 shadow-lg form-control-lg">
		
		    <%
		    
		 
		    
		  
		    
		    
		    if ( request.getAttribute("b")=="insert") {
		    	%>

		    	 
		    	
		    	 <section id="products">
                <div class="container m-5">
            <h1 class="text-center my-4">Insert Page</h1>
            <div class="row">
                <div class="col-lg-4 col-md-4 col-12">
                    <div class="card" >
                        <img src="https://img.freepik.com/free-photo/rag-doll-word-success_1156-188.jpg?size=626&ext=jpg&ga=GA1.1.1700460183.1708646400&semt=ais" height="40px" class="card-img-top mt-2" alt="...">
                        <div class="card-body text-center">
                          <h5 class="card-title">SuccessFully Value Inserted</h5>
                          <a href="Home.jsp" target="frame2" class="btn btn-success signin">Go to Home</a>
                        </div>
                      </div>
                      </div>
                      </div>
                      </div>
                      </section>
		    	 
				<% 
		    	 
				
	 
			} else if (request.getAttribute("b")=="delete"){
				%>
				 <section id="products">
                <div class="container m-5">
            <h1 class="text-center my-4">Delete Page</h1>
            <div class="row">
                <div class="col-lg-4 col-md-4 col-12">
                    <div class="card" >
                        <img src="https://img.freepik.com/free-photo/rag-doll-word-success_1156-188.jpg?size=626&ext=jpg&ga=GA1.1.1700460183.1708646400&semt=ais" height="40px" class="card-img-top mt-2" alt="...">
                        <div class="card-body text-center">
                          <h5 class="card-title">SuccessFully Value Deleted</h5>
                          <a href="Home.jsp" target="frame2" class="btn btn-success signin">Go to Home</a>
                        </div>
                      </div>
                      </div>
                      </div>
                      </div>
                      </section>
				 <%
				//out.print("<span class='text-success'>Successfully Value Deleted</span>");
		    
		      
		    
		    
			} else if (request.getAttribute("b") == "update"){
				%>
				 <section id="products">
                <div class="container m-5">
            <h1 class="text-center my-4">Updated Page</h1>
            <div class="row">
                <div class="col-lg-4 col-md-4 col-12">
                    <div class="card" >
                        <img src="https://img.freepik.com/free-photo/rag-doll-word-success_1156-188.jpg?size=626&ext=jpg&ga=GA1.1.1700460183.1708646400&semt=ais" height="40px" class="card-img-top mt-2" alt="...">
                        <div class="card-body text-center">
                          <h5 class="card-title">SuccessFully Value Updated</h5>
                          <a href="Home.jsp" target="frame2" class="btn btn-success signin">Go to Home</a>
                        </div>
                      </div>
                      </div>
                      </div>
                      </div>
                      </section><%
						    
		      
		    
		    
			}  
			
				
				
				%></p>  
		    
		    
		
			
			  
			
				
		  </div>	
		</div>
		</div>


</body>
</html>