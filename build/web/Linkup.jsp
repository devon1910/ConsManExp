<%-- 
    Document   : Linkup
    Created on : 22-Dec-2019, 23:33:22
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Link Up</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <style>
            <%
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            %>
            body
            {
                 background: url("Cons/Right.jpg") no-repeat center center fixed;
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                font-family: 'Roboto', sans-serif;
            }
            .myform h1
            {
                 font-weight: 100;
                text-align: center;
                font-size: 2.3em;
                font-family: sans-serif;
                color: #CFB53B;
            }
            .myform
            {
                 padding: 100px;
                width: 500px;
                background-color: #F7F7F7;
                margin: 0 auto 10px;
                border-radius: 2px;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                //overflow: hidden;
            }
            .btn-group-justified
            {
                background: #CFB53B;
                color: black;
            }
            .btn-group-justified:hover
            {
                //background: #ffd700;
                color:black;
                 transition: all 0.5s ease-in-out;
            }
            h2,label,p
            {
                color: #CFB53B;
                font-size: 20px
            }
            
        </style>
    </head>
    <body>
         <div class="myform">
             <form name="TheForm" method="POST" action="HomePage.jsp">
            <center><h1>Search Result</h1></center>
            <h2>Hello <%=session.getAttribute("Uname")%></h2><br><br>
            <table>
                <tr>
                
                    <td>
                        <label>Remedy</label>
                             <%=session.getAttribute("rem")%>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Resources</label>
                             <%=session.getAttribute("res")%>
                    </td>
                </tr>
                  <tr>
                    <td>
                        <label>Contact Details</label>
                             <%=session.getAttribute("det")%>
                    </td>
                </tr>
                
            </table>
                    <br><br>
                    <p>The Above are the Contact details of a Manager who has faced a similar Challenge and proffered solution to it</p>
            <input type="submit" value="Home" class="btn btn-group-justified">
        </form>
        </div>
    </body>
</html>
