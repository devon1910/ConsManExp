<%-- 
    Document   : Registration
    Created on : 09-Dec-2019, 18:01:14
    Author     : inyere matthew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
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
            .btn-success
            {
                margin-top: 20px;
            }
            .login-card {
                padding: 40px;
                width: 400px;
                background-color: #F7F7F7;
                margin: 0 auto 10px;
                border-radius: 2px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                overflow: hidden;
            }

            .login-card h1 {
                font-weight: 100;
                text-align: center;
                font-size: 2.3em;
                color:  #CFB53B;
                
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
            .login-card input[placeholder=firstname]
            {
                color: gray;  
            }
             .login-card input[placeholder=lastname]
            {
                color: gray;  
            }
             .login-card input[placeholder=username]
            {
                color: gray;  
            }
             .login-card input[placeholder=password]
            {
                color: gray;  
            }
             .login-card input[placeholder=confirmPassword]
            {
                color: gray;  
            }
             .login-card input[placeholder=email]
            {
                color: gray;  
            }
             .login-card input[placeholder=phoneNo]
            {
                color: gray;  
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
                /* border-radius: 2px; */
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
                background-color:  #CFB53B;
                
                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */
            }

            .login-submit:hover {
                /* border: 1px solid #2f5bb7; */
                border: 0px;
                color: black;
               // text-shadow: 0 1px rgba(0,0,0,0.3);
                //background-color: #357ae8;
                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */
            }
        </style>
    </head>
    <body>
        <br><br><br><br>
        <div class="login-card">
           
        <h1>Sign Up</h1>
        <br><br>
        <form action="inReg.jsp" method="POST" name="form" class="form-inline">
                
                   <input type="text" name="firstname" placeholder="firstname"/>
                   <input type="text" name="lstname" placeholder="lastname"/>
                   <input type="text" name="usename" placeholder="username"/>
                   <input type="password" name="pastxt" placeholder="password"/>
                   <input type="password" name="conpass" placeholder="confirmPassword"/>
                   <input type="text" name="email" placeholder="email"/>
                   <input type="text" name="phnumb" placeholder="phoneNo"/>
                    Register As:
                    <select name="regtype">
                            <option>Manager</option>
                            <option >Student</option>    
                            <option>Administrator</option>
                    </select>
                        <br><br>
                        <input type="submit" value="Sign up" class="login login-submit">
                        
        </form><br><br>
                 
        </div>
    </body>
</html>
