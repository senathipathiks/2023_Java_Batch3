<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style type="text/css">

 
        body {font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box;}
        
        .input-container {
          display: -ms-flexbox; /* IE10 */
          display: flex;
          width: 100%;
          margin-bottom: 15px;
        }
        
        .icon {
          padding: 10px;
          background: dodgerblue;
          color: white;
          min-width: 50px;
          text-align: center;
        }
        
        .input-field {
          width: 100%;
          padding: 10px;
          outline: none;
        }
        
        .input-field:focus {
          border: 2px solid dodgerblue;
        }
        
        /* Set a style for the submit button */
        .btn {
          background-color: dodgerblue;
          color: white;
          padding: 15px 20px;
          border: none;
          cursor: pointer;
          width: 50%;
          opacity: 0.9;
          margin-left: 25%;
        }
        
        .btn:hover {
          opacity: 1;
        }
        </style>

</head>
<body>
    
        <div class="">
        <form action="PayController" method="post" style="max-width:500px;margin:auto">
         <Center><h2>Enter The Details</h2></Center> 
          <div class="input-container">
            <i class="fa fa-id-card icon" ></i>
            <input class="input-field" type="text" placeholder="Enter Payroll Id" name="payRollID">
          </div>
        
          <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="Enter Employee Name" name="employeeName">
          </div>
          
          <div class="input-container">
            <i class="fa fa-id-card icon" ></i>
            <input class="input-field" placeholder="Enter Employee ID" name="empId">
          </div>
          <div class="input-container">
          
           <i class="bi bi-currency-rupee icon"></i>
            <input class="input-field" placeholder="Enter Basic Salary" name="basic">
          </div>
          <div class="input-container">
            <i class="bi bi-currency-rupee icon"></i>
            <input class="input-field" placeholder="Enter HRA" name="hra">
          </div>
          <div class="input-container">
            <i class="bi bi-currency-rupee icon"></i>
            <input class="input-field" placeholder="Enter DA" name="da">
          </div>
          <div class="input-container">
            <i class="bi bi-currency-rupee icon"></i>
            <input class="input-field" placeholder="Enter TA" name="ta">
          </div>
          <div class="input-container">
            <i class="bi bi-currency-rupee icon"></i>
            <input class="input-field" placeholder="Enter CTC" name="ctc">
          </div>
        
          <button type="submit" class="btn" name="button" value="Insert"><i class="fa fa-plus icon"></i>Add Details</button>
        </form>
        </div>
        
        </body>
</html>