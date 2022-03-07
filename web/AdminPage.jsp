<%-- 
    Document   : AdminPage
    Created on : 06-Jan-2020, 11:46:40
    Author     : Inyere Matthew
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Page</title>
        <style>
            body
            {
                  background: url("Cons/Right.jpg") no-repeat center center fixed; 
            }
            h1
            {
                text-align: center;
                color: #CFB53B;
            }
            h4
            {
                color: #CFB53B;
                font-weight: bold;
            }
            p
            {
                color:#CFB53B;
                font-size: 20px;
            }
            .btn-group-justified
            {
                background: #CFB53B;
                color:white;
            }
            .btn-group-justified:hover
            {
                //background: #ffd700;
                color:black;
                 transition: all 0.5s ease-in-out;
            }
            .login-card {
                padding: 40px;
                width: 400px;
                background-color: #F7F7F7;
                margin: 0 auto 10px;
                border-radius: 2px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.4);
                overflow: hidden;
            }
            button
            {
                padding: 15px;
                width: 90px;
                margin-top: 20px;
                color:white;
                background: #CFB53B;
                
            }
        </style>
    </head>
    <body>
        <br><br><br><br><br>
        <div class="login-card">
            <form action="HomePage.jsp" method="POST">
                <h1>Hello <%=session.getAttribute("Uname")%></h1>
            <p>Welcome to your Page Logged in as an Admin... to check The Frequency of Construction Challenges click the button below.</p>
            <%
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        %>
        <h4 align="center"><font><strong>Listed below are the challenges faced by Managers</strong></font></h4>
        <table align="center" cellpadding="15" cellspacing="15" border=0>
            <tr>

            </tr>
            <tr bgcolor="">
                <td><b>theme</b></td>
               
            </tr>
            
            <%
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience", "root", "");
                    statement = connection.createStatement();
                    String sql = "SELECT Theme FROM `managerexperience` ";
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>
            <tr bgcolor="">
                <td><%=resultSet.getString("Theme")%></td>
            </tr>
            <%
             }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>
            <%
                
            %> 
        </table><br><br>
         <%
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }           
        %>
<!--        <h2 align="center"><font><strong>The challenges faced by Construction Managers</strong></font></h2>-->
        <table align="center" cellpadding="15" cellspacing="15" border=0>
            <tr>
            </tr>
            <tr bgcolor="#F7F7F7">
<!--                <td><b>theme</b></td>               -->
            </tr>            
            <%
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience", "root", "");
                    statement = connection.createStatement();
                    String sql = "SELECT COUNT(Theme) AS 'res' FROM managerexperience WHERE Theme='food Shortage'";
                    resultSet = statement.executeQuery(sql);
                  while (resultSet.next()) {
            %>
            <tr bgcolor="#F7F7F7">

                <td><h4>Food Shortage is the most sought after challenge with a frequency of <%=resultSet.getString("res")%>.</h4></td> 
            </tr>
            <%
                  }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            %>          
</table>   
<button>Home</button>
<!--<a href="HomePage.jsp" class="label-default">Home</a>-->
            </form>  
        </div>
    </body>
</html>
