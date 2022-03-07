<%-- 
    Document   : ManagerExperience
    Created on : 16-Dec-2019, 00:24:42
    Author     : Inyere Matthew
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Experience</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <style>
            
            body{
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
            .ManExpCard
            {
                padding: 40px;
                width: 400px;
                background-color: #F7F7F7;
                margin: 0 auto 10px;
                border-radius: 2px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                overflow: hidden;
            }
            .ManExpCard h1
            {
                font-weight: 100;
                text-align: center;
                font-size: 2.3em;
                font-family: sans-serif;
                color:  #CFB53B;
            }
            .ManExpCard input[type=submit] {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                position: relative;
            }

            .ManExpCard input[type=text]{
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
            
/*             .ManExpCard select[type=text]{
                height: 44px;
                font-size: 16px;
                width: 100%;
                margin-bottom: 10px;
                -webkit-appearance: none;
                background: #fff;
                border: 1px solid #d9d9d9;
                border-top: 1px solid #c0c0c0;
                 border-radius: 2px; 
                padding: 0 8px;
                box-sizing: border-box;
                -moz-box-sizing: border-box;
            }*/

            .ManExpCard input[type=text]:hover{
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }
            
/*            .ManExpCard select[type=text]:hover {
                border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }*/
            .ManExpCard textarea:hover
            {
                 border: 1px solid #b9b9b9;
                border-top: 1px solid #a0a0a0;
                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);
            }
            .ManExpCard textarea
            {
                 height: 100px;
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
            
            .btn {
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

            .btn-success{
                /* border: 1px solid #3079ed; */
                border: 0px;
                color: #fff;
                text-shadow: 0 1px rgba(0,0,0,0.1); 
               background-color:  #CFB53B;
                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */
            }
            .btn-success:hover {
                /* border: 1px solid #2f5bb7; */
                border: 0px;
                text-shadow: 0 1px rgba(0,0,0,0.3);
                color: black;
                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */
            }
            .ManExpCard label
            {
               font-family: sans-serif;         
            }
        </style>
        
      
           
    </head>
    <body>
       
        <br><br><br>
        <div class="ManExpCard">
        <h1>Welcome <%=session.getAttribute("Uname")%></h1><br><br>
        <form action="inMan.jsp" method="POST" name="Exp">
     <div class="input-group">
  <select class="custom" id="inputGroupSelect04" aria-label="Example select with button addon">
    <option selected>Choose...</option>
                <option>Gwarimpa,Abuja</option>
                <option>Warri,Delta</option>
                <option>Aba,Onitsha</option>
                <option>Ota,Ogun</option>
                <option>Port-Harcourt,Rivers</option>
                <option>Benin,Edo</option>
                <option>Ogunu,Delta</option>
                <option>Bonny,Rivers</option>
                <option>Lekki,Lagos</option>
                <option>Surulere,Lagos</option>
                <option>Abeokuta,Ogun</option>
                <option>Uyo,Akwa-ibom</option>
                <option>Festac,Lagos</option>
                <option>Garki,Abuja</option>
  </select>

</div>
            <br><br>
            <label></label><input type="text" name="themee" size="28" placeholder="Theme of the problem"><br><br>
            <label></label><textarea name="descriptionn" rows="7" cols="30" placeholder="Description of Challenges"></textarea><br><br>
            <label></label><textarea name="remedyy" rows="7" cols="30" placeholder="Remedy"></textarea><br><br>
            <label></label><textarea name="resourcess" rows="7" cols="30" placeholder="Resources used"></textarea><br><br>
            <label></label><textarea name="detailss" rows="7" cols="30" placeholder="Contact details"></textarea><br><br>
            <input type="submit" value="Done" class="btn btn-success">
        </form>
        </div>
    </body>
</html>
