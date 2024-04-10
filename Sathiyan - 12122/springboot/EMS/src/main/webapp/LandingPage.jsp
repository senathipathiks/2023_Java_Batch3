<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        html, body {
            margin: 0;
            padding: 0;
            height: 100%;
        }

       #framecontainer {
            height: 100%;
            width: 100%;
        }

        #frame1, #frame2 {
            height: 15%;
            width: 100%;
            border: none;
            float: left;
            box-sizing: border-box;
        }

        #frame2 {
            height: 85%;
            width: 100%;
            border: none;
            float: left;
            box-sizing: border-box;
        }

        
    </style>
</head>
<body>
    <div id="framecontainer">
        <iframe id="frame1" src="Links"></iframe>
        <iframe id="frame2" src="InsertEmployee" name="frame2"></iframe>
    </div>
</body>
</html>