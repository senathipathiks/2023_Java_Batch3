<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .bg-image{
            position: absolute;
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;
            width: 100%;
            height: 100%;
        }

        marquee{
            color: #355f6f;
            font-family: 'Times New Roman', Times, serif;
            font-size: 30px;
        }

        .links{
            position: relative;
            color: #355f6f;
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: space-evenly;
            font-size: 20px;
            padding-top: 5px;
            font-family: 'Times New Roman', Times, serif;

        }

        #linksbtn{
            color: #355f6f;
            border: 1px solid #355f6f;
        }


    </style>

</head>
<body>
        <div class="text"> <marquee>Employee Management System </marquee></div>
        <div class="links">
            <div><a id="linksbtn" href="insert" class="btn btn-lg" name="button" target="frame2">Insert</a></div>
            <div><a id="linksbtn" href="delete" class="btn btn-lg" name="button" target="frame2">Delete</a></div>
            <div><a id="linksbtn" href="deletebyname" class="btn btn-lg" name="button" target="frame2">Del by name</a></div>
            <div><a id="linksbtn" href="update" class="btn btn-lg" name="button" target="frame2">Update</a></div>
            <div><a id="linksbtn" href="find" class="btn btn-lg" name="button" target="frame2">View</a></div>
            <div><a id="linksbtn" href="findbyname" class="btn btn-lg" name="button" target="frame2">View by name</a></div>
            <div><a id="linksbtn" href="findall" class="btn btn-lg" name="button" target="frame2">View All</a></div>
        </div>
    
</body>
</html>