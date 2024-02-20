<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
    <title>Management system</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            transition: all 0.5s ease;
            -webkit-transition: all 0.5s ease;
        }
        .container {
            padding: 20px;
            width: 500px;
            margin: 20px auto;
            background-color: #f1f1f1;
        }
        .container h2 {
            text-align: center;
        }
        fieldset {
            border: 1px solid #d4d4d4;
            padding: 20px 10px;
            margin-bottom: 10px;
            border-radius: 8px;
        }
        .input-field {
            display: flex;
            margin-bottom: 15px;
        }
        label {
            margin-right: 25px;
            margin-top: 5px;
            width: 30%;
            text-align: right;
            font-weight: bold;
        }
        .icon {
            background: #fcfcfa;
            color: black;
            min-width: 40px;
            border: 2px solid #e2e2e2;
            border-right: none;
            text-align: center;
            padding: 7px;
        }
        .inputs {
            padding: 3px 10px;
            border: 2px solid #e2e2e2;
            width: 70%;
        }
        input[type="radio"] {
            margin-right: 8px;
        }
        .textarea {
            padding: 8px;
            border: 2px solid #e2e2e2;
        }
        .textarea-icon {
            padding-top: 14px;
        }
        .button1 {
            text-align: center;
        }
        .submit {
            color: white;
            background: #ee9a25;
            padding: 9px 25px;
            margin-right: 10px;
            border: none;
            border-radius: 5px;
            box-shadow: 0 0 5px #c9c9c9;
        }
        .submit:hover {
            background: #d1871e;
        }
        
    </style>
</head>
<body>
    <div class="container">
        <h2>Insert page</h2>
        <form action="PetiController" method="post">
            <fieldset>
             <div class="input-field">
                    <label>Petition ID</label>
                    <i class="fa-solid fa-id-card icon"></i>
                    
                    <input type="text" class="inputs" name="pid">
                </div>
                <div class="input-field">
                    <label>Category </label>
                    <i class="fa-solid fa-award icon"></i>
                    <input type="text" class="inputs" name="category">
                </div>
                
                
                <div class="input-field">
                    <label>Desc</label>
                    <i class="fa fa-list icon"></i>
                    <input type="text" class="inputs" name="desc">
                       
                </div>
                 <div class="input-field">
                    <label>Priority</label>
                   <i class="fa-solid fa-clock icon"></i>
                    <input type="text" class="inputs" name="priority">
                       
                </div>
                 <div class="input-field">
                    <label>RaisedBy </label>
                  <i class="fa-solid fa-hand-point-up icon"></i>
                   
                    <input type="text" class="inputs" name="raised">
                       
                </div>
                 <div class="input-field">
                    <label>AssignedTo </label>
                    <i class="fa-solid fa-right-to-bracket icon"></i>
                    <input type="text" class="inputs" name="assingned">
                       
                </div>
                 <div class="input-field">
                    <label>Status  </label>
                    <i class="fa-solid fa-chart-simple icon"></i>
                    <input type="text" class="inputs" name="status">
                       
                </div>
            </fieldset>
            <div class="button1">
            <input type="submit" class="submit" name="button" value="Insert">
                
            
            </div>
        </form>
    </div>
</body>
</html>


