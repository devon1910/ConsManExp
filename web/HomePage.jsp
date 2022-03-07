<%-- 
    Document   : HomePage
    Created on : 23-Dec-2019, 21:00:29
    Author     : Ekpokpobe Davidson
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <style>
            .bod
            {
                width:60%;
                //margin:0 50px 0 auto;
                margin-left: 65px;
                /*                margin-left: 50px;
                                margin-right: 50px*/
            }
            .container
            {
                background: black;
                opacity: 0.65;
                width:100%;
              // position: fixed;
               margin-top: 0px;
              
            }
            .logo{
                width:200px;
                height:70px;
                float:left;
                color:#CFB53B;
                font-size: 20px;
                font-family: sans-serif;
                padding:10px 0 0 50px;

            }
            nav{
                width:70%;
                height:70px;
                float:right;
                text-align: right;
               // background: #fff;
                padding: 0 40px 0 0;
            }
            nav ul{
                padding-top: 23px;/*to change the position of the font/text*/
            }
            nav ul li{
                list-style: none;
                display: inline;
                padding: 20px 0px;
            }
            nav li a{
                color:#CFB53B;
                font-size: 19px;
                text-decoration: none;
                padding:23px 15px;
            }
            nav li a:hover{
                background: #000;
                color:white;
                transition: all 0.5s ease-in-out;
            }
            body
            {
                margin: 0px;
                 background: black;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
               // font-family: 'Roboto', sans-serif;
                
            }
            .btn-primary
            {
                border-radius: 6px;
            }
           
            .btn-primary
            {
                border: 0px;
                color: #fff;
                text-shadow: 0 1px rgba(0,0,0,0.1); 
                background-color: #4d90fe;
            }
            p,h2,h4
            {
                text-align: left;
                color:  white;
                word-wrap: break-word;
                text-justify: inter-word;
                margin: 0 0 0 0;
                font-size: 20px;
                
            }
            h6
            {
                text-align: center;
                margin: 130px 10px 0 0;
                font-size: 15px;
                color: white;
            }
            .header
            {
                
               // background: black;
               background: url("Cons/flex.jpg") no-repeat center center fixed;
            }
            #lower
            {
                width: 100%;
                padding: auto;
                background: black;
                height: 300px;    
            }
            #lower p
            {
                color: white;
                float: left;
            }
            #lowerr
            {
                width: 90%;
                margin: 40px auto;
                font-weight: 100px;
            }
            .bod h1
            {
                font-weight: 900;
                font-size: 400%;
                text-align: left;
                color:  white;
                word-wrap: break-word;
                text-justify: inter-word;
            }
           
            .btn-lg
            {
                background:#CFB53B;
                margin:20px 50px 20px 70px;
                width: 150px;
                height:70px;
                color:white;
            }
            .con input[type=button]
            {
                border: 5px solid white;
            }
            .con input[type=button]
            {
               // background: white;
                //color:grey;
                //transition: all 0.5s ease-in-out;
            }
            .container2
            {
                width:100%;
                max-width: 1200px;
                height:auto;
                overflow: auto;
                margin:0 auto 0 auto;
                background: black;
            }
            .box1{
                width:30%;
                height: 200px;
                background: #CFB53B;
                float: left;
                margin: 25px  1% 0 1%;
               // background-image: url("Cons/You.jpg");
            }
            .box2{
                width:30%;
                height: 200px;
                background:#CFB53B;
                float: left;
                margin: 25px  1% 0 1%;
            }
            .box3{
                width:30%;
                height: 200px;
               background: #CFB53B;
                float: left;
                margin: 25px  1% 0 1%;
            }
         
            #pic1
            {
                width: 100%;
            }
             #pic2
            {
                width: 100%;
            }
             #pic3
            {
                width: 100%;
            }
            
        </style>
       
    </head>
    
    <body>
        <% Date dt = new Date();
        %>
        <div class ="header">
		<div class ="container">
			<div class ="logo">ZIPPERZ <br>Construction</div>
			<nav>
				<ul>
					<li> <a href ="HomePage.jsp" class="">Home</a></li>
					<li> <a href ="index.jsp">Login</a></li>
					<li> <a href ="HomePage.jsp">Services</a></li>
					<li> <a href ="HomePage.jsp">Contact</a></li>
				</ul>
                        </nav>
	</div>
        
            <div class="con">
             
             <div class="bod">
                 <center><h1>Construction Manager Experience</h1></center><br>
            
            <h2>Welcome,<b>Guest</b>:Join our Great Team of solution providers to Frequently encountered Construction challenges</h2><br><br>
            <h4><label>Stats:</label> 200 members,500 challenges and solutions.</h4>
            <h4><label>Date:</label> <%=dt%></h4><br><br>
            <p> This software enables members to either register as Manager who can share their encounters in a construction site and proffer solutions to them
            or to Sign up as a student to search for the themes of different problems encountered in a construction site,the solutions to such problems and to
            Contact such people who can proffer solution to such problems</p><br><br>
               
             </div>
            <input type="button" value="About us" class="btn btn-lg">
        </div>
        </div>
            <div class ="container2">
                <div class ="box1">
                    <img style ="max-width:120%; max-height:100%; " src="Cons/p1.jpg" id="pic1">
                </div>
                <div class ="box2">
                    <img style ="max-width:100%; max-height:100%; " src="Cons/p2.jpg" id="pic2">
                </div>
                <div class ="box3">
                    <img style ="max-width:100%; max-height:100%; " src="Cons/p3.jpg" id="pic3">
                </div>
            </div>
            
            <div id="lower">
                <div id="lowerr"><p>  We are a Building and Civil. Engineering Company incorporated in Nigeria in the year 2010. We build on a culture of excellence, created and sustained by experience acquired tithe promoters over the years in Building, General Civil works, property development., telecommunication site construction, maintenance and management. </p></div>
                <br><br><br><br><br><br><h6>&copy2020 EkpokpobeDavidson</h6>
              
            </div>
            
    </body>
</html>
