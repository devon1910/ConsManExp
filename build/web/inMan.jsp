<%-- 
    Document   : inMan
    Created on : 19-Dec-2019, 22:51:23
    Author     : Ekpokpobe Davidson
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Experience</title>
    </head>
    <body>
       <%

            String location=request.getParameter("locationn");
            String theme=request.getParameter("themee");
            String description=request.getParameter("descriptionn");
            String remedy=request.getParameter("remedyy");
            String resource=request.getParameter("resourcess");
            String details=request.getParameter("detailss");
            
           try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience","root","");
                Statement st = (Statement) con.createStatement();
                String insert= "insert into managerexperience values ('"+location+"','"+theme+"','"+description+"','"+remedy+"','"+resource+"','"+details+"')";
                st.executeUpdate(insert);
                session.setAttribute("ConDetails", details);
                response.sendRedirect("HomePage.jsp");
                out.println("Successfully NOTED");
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
