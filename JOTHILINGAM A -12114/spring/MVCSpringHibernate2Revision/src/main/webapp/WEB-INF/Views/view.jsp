		<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Search Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style type="text/css">
    
        body {
            background-image: url('');
            background-size: cover;
            font-size: 16px;
            margin-left: 30%;
            margin-top: 110px;
            font-weight: bold;
        }
        input[type="text"] {
width: 100%;
padding: 12px 20px;
margin: 8px 0;
box-sizing: border-box;
border: 2px solid #ccc;
border-radius: 4px;
}
input[type="submit"] {

color: white;
padding: 11px 20px;
margin: 8px 0;
border: none;
border-radius: 4px;
cursor: pointer;
}

td {
     padding: 10px 14px;
   }
.card {
box-shadow: 4px 4px 8px 8px rgba(0,0,0,0.2);
transition: 0.3s;
border-radius: 5px;
background-color: #f8f9fa;
}
.card:hover {
box-shadow: 5px 8px 16px 9px rgba(0,0,0,0.2);
}
   
.form-group {
  display: flex;
  
  align-items: center;
}
.form-group > label {
  margin-right: 1rem;
  width: 4rem;
}
.icon {
  padding: 15px;
  background: black;
  color: white;
  min-width: 50px;
  text-align: center;
  }
  .form-group
{
 display: -ms-flexbox; 
  display: flex;
  width: 100%;
  margin-bottom: 10px;
}
.btn {
        margin: 20 50px;
}
    </style>
</head>
<body>
<div class="card w-50 ">
    <div class="card-header text-center"><h5>Enter the Book Id to Search : </h5></div>
    <div class="card-body ">
       
 <form action="Search" >
 <div class = form-group>
<label for="id">
<i class="fa fa-id-card icon"></i></label>
            </div>
            <input type="text" name="id" autocomplete="off" placeholder="ID"/>
            <button type="submit" class="btn btn-primary btn-md" name="button" value="view">
                <i class="fa fa-search "></i> Search
            </button>
     </form>
     
  <br>
         <form action="SearchAll" >
         <button type="submit" class="btn btn-primary btn-md" name="button" value="View All">
            <i class="fa fa-eye"></i> View All
            </button>
            </form>
    </div>
</div>
</body>
</html>
