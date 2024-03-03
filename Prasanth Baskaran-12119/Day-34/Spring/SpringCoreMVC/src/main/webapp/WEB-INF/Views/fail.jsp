 <%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Deletion Failure</title>
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    />
    <style>
      body {
        background-color: #f8f9fa;
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        height: 100vh;
        margin: 0;
        padding: 0;
      }

      .container {
        margin-top: 50px;
      }

      .jumbotron h1 {
        color: red;
        font-size: 2em;
      }
    </style>
  </head>
  <body>
    <br />
    <br />
    
    <%
		 
		    
		    if ( request.getAttribute("res") == "fal") {
		    	%>
    
    <div class="container">
      <div class="jumbotron">
        <h1 class="display-4">Insertion Failed</h1>
        <p class="lead">
          There was an error during the Insertion process. Please check and try
          again.
        </p>
        <hr class="my-4" />
        <a class="btn btn-primary btn-lg" href="insert.jsp" role="button" target="frame2"
          >Back to Insert Page</a >
          
          <%}
    
		    else if ( request.getAttribute("res") == "del") {%>
		    
		    <div class="container">
      <div class="jumbotron">
        <h1 class="display-4">Deletion Failed</h1>
        <p class="lead">
          There was an error during the Deletion process. Please check and try
          again.
        </p>
        <hr class="my-4" />
        <a class="btn btn-primary btn-lg" href="delete.jsp" role="button" target="frame2"
          >Back to Delete Page</a >
          
           <%} 
    
else if ( request.getAttribute("res") == "up") { %>
		    
		    <div class="container">
      <div class="jumbotron">
        <h1 class="display-4">Update Failed</h1>
        <p class="lead">
          There was an error during the update process. Please check and try
          again.
        </p>
        <hr class="my-4" />
        <a class="btn btn-primary btn-lg" href="Edit.jsp" role="button" target="frame2"
          >Back to Update Page</a >
           <%}
else if ( request.getAttribute("res") == "fnd") { %>

<div class="container">
<div class="jumbotron">
<h1 class="display-4">Searching is Failed</h1>
<p class="lead">
There was an error during the search process. Please check and try
again.
</p>
<hr class="my-4" />
<a class="btn btn-primary btn-lg" href="list.jsp" role="button" target="frame2"
>Back to Search Page</a >
           
        <%} 
        
else if ( request.getAttribute("res") == "lis") { %>

<div class="container">
<div class="jumbotron">
<h1 class="display-4">List  is Failed</h1>
<p class="lead">
There was an error during the list all process. Please check and try
again.
</p>
<hr class="my-4" />
<a class="btn btn-primary btn-lg" href="list.jsp" role="button" target="frame2"
>Back to List All Page</a >
        
      <% }  %>  
      </div>
    </div>
  </body>
</html>
