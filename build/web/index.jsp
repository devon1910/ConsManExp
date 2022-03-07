<%-- 
    Document   : index
    Created on : 09-Dec-2019, 15:32:03
    Author     : Ekpokpobe Davidson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
        <link href="bootstrap.css" rel="stylesheet" type="text/css">
        <style>
             body {
                background: url("Cons/Right.jpg") no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                font-family: 'Roboto', sans-serif;
            }

            .login-card {
                padding: 40px;
                width: 274px;
                background-color: #F7F7F7;
                margin: 0 auto 10px;
                border-radius: 4px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                overflow: hidden;
            }

            .login-card h1 {
                font-weight: 100;
                text-align: center;
                font-size: 2.3em;
                color:#CFB53B;
                
            }

            .login-card input[type=submit] {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                position: relative;
            }

            .login-card input[type=text], input[type=password] {
                height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 15px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                 border-radius: 7px; 
                padding: 0px 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
               
            }
            
             .login-card select[type=text], input[type=password] {
                height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 10px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                 border-radius: 7px; 
                padding: 0 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
               
            }

            .login-card input[type=text]:hover, input[type=password]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }
            
            .login-card select[type=text]:hover, select[type=password]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }

            .login {
                text-align: center;
                font-size: 14px;
                font-family: 'Arial', sans-serif;
                font-weight: 700;
                height: 36px;
                padding: 0 8px;
                /* border-radius: 3px; */
                /* -webkit-user-select: none;
                  user-select: none; */
            }

            .login-submit {
                /* border: 1px solid #3079ed; */
                border: 0px;
                color: #fff;
                text-shadow: 0 1px rgba(0,0,0,0.1); 
                background-color: #CFB53B;;
                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */
            }

            .login-submit:hover {
                /* border: 1px solid #2f5bb7; */
                border: 0px;
                text-shadow: 0 1px rgba(0,0,0,0.3);
                color: black;
                
                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */
            }

            .login-card a {
                text-decoration: none;
                color: #666;
                font-weight: 400;
                text-align: center;
                display: inline-block;
                opacity: 0.6;
                transition: opacity ease 0.5s;
            }

            .login-card a:hover {
                opacity: 1;
                
            }

            .login-help {
                width: 100%;
                text-align: center;
                font-size: 18px;
            }
            .login-help a
            {
                color: red;
            }
        </style>
    </head>
    <body>
        <br><br><br><br><br>
        <div class="login-card">
        <h1>Log-in</h1><br>
        <form action="inlog.jsp" method="POST" name="login">
                    <input type="text" name="usertxt" placeholder="username"/>
                    <input type="password" name="passtxt" placeholder="password"/>
             
                    <br><br>    
                     <input type="submit" name="login" class="login login-submit" value="login"/>
        </form><br>
       <div class="login-help">
           <p>Don't have an account?<br><br><a href="Registration.jsp">Sign Up</a></p>
            </div>
        </div>
        </body>
</html>
