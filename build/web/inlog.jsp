<%-- 
    Document   : inlog
    Created on : 10-Dec-2019, 10:54:16
    Author     : Ekpokpobe Davidson
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
            String userStored="";
            String passStored="";
            String regtyp="";
            Connection con;
            PreparedStatement st;
            ResultSet res;
            try{
                String usernameEntered=request.getParameter("usertxt").trim();
                String passwordEntered=request.getParameter("passtxt").trim();
               // String regtypeEntered=request.getParameter("regtyp").trim();
                String sql= "SELECT * FROM `registration` WHERE(UserName ='"+usernameEntered+"' "+"AND Password='"+passwordEntered+"')";
                boolean verify=false;
                con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience","root","");
                st=con.prepareStatement(sql);
                res=st.executeQuery();
                boolean recordExists=res.absolute(1);
                
                if(recordExists==true)
                {
                    regtyp=res.getString("RegType");
                    verify=true;
                }
                if(verify==true){                
                    if(regtyp.equals("Manager")){
                        session.setAttribute("Uname", usernameEntered);
                        response.sendRedirect("ManagerExperience.jsp");}
                    else if(regtyp.equals("Student")){
                        session.setAttribute("Uname", usernameEntered);
                        response.sendRedirect("StudentExperience.jsp");
                    }
                    else if(regtyp.equals("Administrator")){
                        session.setAttribute("Uname", usernameEntered);
                        response.sendRedirect("AdminPage.jsp");
                    }
                 }   
                else
                   out.println("Invalid login details");
                con.close();
            }
            catch(SQLException ex){
                out.write("" +ex.getMessage());
                out.write(" I TOLD YOU");
            }
                     
        %>
    </body>
</html>
