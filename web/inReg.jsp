<%--
    Document   : inReg
    Created on : 10-Dec-2019, 10:53:53
    Author     : Ekpokpobe Davidson
--%>




<%@page import="java.lang.System"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%

            String fname=request.getParameter("firstname");
            String lname=request.getParameter("lstname");
            String uname=request.getParameter("usename");
            String pass=request.getParameter("pastxt");
            String cpass=request.getParameter("conpass");
            String email=request.getParameter("email");
            String pnum=request.getParameter("phnumb");
            String regtype=request.getParameter("regtype");
           try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience","root","");
                Statement st = (Statement) con.createStatement();
                String insert= "insert into registration values ('"+fname+"','"+lname+"','"+uname+"','"+pass+"','"+email+"','"+pnum+"','"+regtype+"')";
                st.executeUpdate(insert);
                session.setAttribute("mail",email);
                response.sendRedirect("index.jsp");
                //out.println("Successfully inserted");
                //out.println("God-WIN");
                con.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    
        %>
    </body>
</html>
