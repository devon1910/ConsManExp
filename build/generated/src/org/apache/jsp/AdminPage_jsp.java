package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class AdminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Page</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                  background: url(\"Cons/Right.jpg\") no-repeat center center fixed; \n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #CFB53B;\n");
      out.write("            }\n");
      out.write("            h4\n");
      out.write("            {\n");
      out.write("                color: #CFB53B;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            p\n");
      out.write("            {\n");
      out.write("                color:#CFB53B;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .btn-group-justified\n");
      out.write("            {\n");
      out.write("                background: #CFB53B;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .btn-group-justified:hover\n");
      out.write("            {\n");
      out.write("                //background: #ffd700;\n");
      out.write("                color:black;\n");
      out.write("                 transition: all 0.5s ease-in-out;\n");
      out.write("            }\n");
      out.write("            .login-card {\n");
      out.write("                padding: 40px;\n");
      out.write("                width: 400px;\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.4);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            button\n");
      out.write("            {\n");
      out.write("                padding: 15px;\n");
      out.write("                width: 90px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                color:white;\n");
      out.write("                background: #CFB53B;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("        <div class=\"login-card\">\n");
      out.write("            <form action=\"HomePage.jsp\" method=\"POST\">\n");
      out.write("                <h1>Hello ");
      out.print(session.getAttribute("Uname"));
      out.write("</h1>\n");
      out.write("            <p>Welcome to your Page Logged in as an Admin... to check The Frequency of Construction Challenges click the button below.</p>\n");
      out.write("            ");

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
        
      out.write("\n");
      out.write("        <h4 align=\"center\"><font><strong>Listed below are the challenges faced by Managers</strong></font></h4>\n");
      out.write("        <table align=\"center\" cellpadding=\"15\" cellspacing=\"15\" border=0>\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"\">\n");
      out.write("                <td><b>theme</b></td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience", "root", "");
                    statement = connection.createStatement();
                    String sql = "SELECT Theme FROM `managerexperience` ";
                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            
      out.write("\n");
      out.write("            <tr bgcolor=\"\">\n");
      out.write("                <td>");
      out.print(resultSet.getString("Theme"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

             }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("            ");

                
            
      out.write(" \n");
      out.write("        </table><br><br>\n");
      out.write("         ");

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }           
        
      out.write("\n");
      out.write("<!--        <h2 align=\"center\"><font><strong>The challenges faced by Construction Managers</strong></font></h2>-->\n");
      out.write("        <table align=\"center\" cellpadding=\"15\" cellspacing=\"15\" border=0>\n");
      out.write("            <tr>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"#F7F7F7\">\n");
      out.write("<!--                <td><b>theme</b></td>               -->\n");
      out.write("            </tr>            \n");
      out.write("            ");

                try {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/constructionexperience", "root", "");
                    statement = connection.createStatement();
                    String sql = "SELECT COUNT(Theme) AS 'res' FROM managerexperience WHERE Theme='food Shortage'";
                    resultSet = statement.executeQuery(sql);
                  while (resultSet.next()) {
            
      out.write("\n");
      out.write("            <tr bgcolor=\"#F7F7F7\">\n");
      out.write("\n");
      out.write("                <td><h4>Food Shortage is the most sought after challenge with a frequency of ");
      out.print(resultSet.getString("res"));
      out.write(".</h4></td> \n");
      out.write("            </tr>\n");
      out.write("            ");

                  }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("          \n");
      out.write("</table>   \n");
      out.write("<button>Home</button>\n");
      out.write("<!--<a href=\"HomePage.jsp\" class=\"label-default\">Home</a>-->\n");
      out.write("            </form>  \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
