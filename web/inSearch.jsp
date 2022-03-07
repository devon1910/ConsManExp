<%-- 
    Document   : inSearch
    Created on : 22-Dec-2019, 22:56:41
    Author     : Ekpokpobe Davidson
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Searching...</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
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
                String themeEntered=request.getParameter("search").trim().toLowerCase();
                
                String sql= "SELECT * FROM `managerexperience` WHERE(Theme ='"+themeEntered+"')";
                boolean verify=false;
                con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience","root","");
                st=con.prepareStatement(sql);      
                res=st.executeQuery();
                while(res.next())
                { 
                    session.setAttribute("rem",res.getString("Remedy"));
                    session.setAttribute("res",res.getString("Resources"));
                    session.setAttribute("det",res.getString("Details"));  
                    
                }
                boolean recordExists=res.absolute(1);
                if(recordExists==true)
                {
                    verify=true;
                    response.sendRedirect("Linkup.jsp");
                }
                 else
                   out.println("No search result(s) found");
                con.close();
            }
            catch(SQLException ex){
                out.write("" +ex.getMessage());
                out.write(" I TOLD YOU");
            }
            %>
           
    </body>
</html>
