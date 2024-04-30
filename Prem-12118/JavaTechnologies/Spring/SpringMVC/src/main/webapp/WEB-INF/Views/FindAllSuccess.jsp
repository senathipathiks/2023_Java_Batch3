<%@page import="org.apache.taglibs.standard.tei.ForEachTEI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.spring.bean.Student" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Students Details</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <style>
        body {
            padding: 20px;
        }

        h1 {
            color: green;
            font-size: 2em;
            text-align: center;
        }

        .table {
            margin-top: 20px;
        }

        .back-button {
            margin-top: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <br>
    <h1>
        <font color="Green">All Students Details</font>
    </h1>
    <br>

    <table class="table">
        <thead>
            <tr>
                <th scope="col">Student ID</th>
                <th scope="col">Student Name</th>
                <th scope="col">Student City</th>
            </tr>
        </thead>
        <tbody>
         
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.sid}</td>
                    <td>${student.sname}</td>
                    <td>${student.scity}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <div class="back-button">
        <a class="btn btn-primary btn-lg" href="find" role="button">Back to Find Students</a>
    </div>
</body>
</html>
