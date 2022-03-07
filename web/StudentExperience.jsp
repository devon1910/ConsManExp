<%-- 
    Document   : StudentExperience
    Created on : 16-Dec-2019, 00:25:15
    Author     : inyere matthew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Student Stuffs</title>
        <style>
            body
            {
                background: url("Cons/Right.jpg") no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                font-family: 'Roboto', sans-serif;
            }
            .btn-primary
            {
                border-radius: 6px;
                background: #CFB53B;
            }
            .myform input[type=text]
            {
                border-radius: 6px;
                 height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 10px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                 border-radius: 20x; 
                padding: 0 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
            }
            .myform h1
            {
                 font-weight: 100;
                text-align: center;
                font-size: 2.3em;
                font-family: sans-serif;
                color:#CFB53B;
                
            }
            h2{color:#CFB53B;}
            .myform
            {
               
                 padding: 100px;
                width: 500px;
                background-color: #F7F7F7;
                margin: 20px auto;
                border-radius: 2px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                //overflow: hidden;
            }
            .btn-primary
            {
                border: 0px;
                color: #fff;
                text-shadow: 0 1px rgba(0,0,0,0.1); 
                background-color:#CFB53B;
            }
        </style>
    </head>
    <body>
        <div class="myform">
             <form name="TheForm" method="POST" action="inSearch.jsp">
           
                 <center><h1>Welcome to the Student Experience</h1></center><br>
            <h2>Hello <%=session.getAttribute("Uname")%></h2><br><br>
            <input type="text" name="search" placeholder="Search for themes">
            <input type="submit" value="Search" class="btn btn-primary">
        </form>
        </div>
    </body>
</html>
