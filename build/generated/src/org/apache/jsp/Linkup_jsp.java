package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Linkup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Link Up</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            ");

            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            
      out.write("\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                 background: url(\"Cons/Right.jpg\") no-repeat center center fixed;\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .myform h1\n");
      out.write("            {\n");
      out.write("                 font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                color: #CFB53B;\n");
      out.write("            }\n");
      out.write("            .myform\n");
      out.write("            {\n");
      out.write("                 padding: 100px;\n");
      out.write("                width: 500px;\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                //overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .btn-group-justified\n");
      out.write("            {\n");
      out.write("                background: #CFB53B;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .btn-group-justified:hover\n");
      out.write("            {\n");
      out.write("                //background: #ffd700;\n");
      out.write("                color:black;\n");
      out.write("                 transition: all 0.5s ease-in-out;\n");
      out.write("            }\n");
      out.write("            h2,label,p\n");
      out.write("            {\n");
      out.write("                color: #CFB53B;\n");
      out.write("                font-size: 20px\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"myform\">\n");
      out.write("             <form name=\"TheForm\" method=\"POST\" action=\"HomePage.jsp\">\n");
      out.write("            <center><h1>Search Result</h1></center>\n");
      out.write("            <h2>Hello ");
      out.print(session.getAttribute("Uname"));
      out.write("</h2><br><br>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td>\n");
      out.write("                        <label>Remedy</label>\n");
      out.write("                             ");
      out.print(session.getAttribute("res"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label>Description</label>\n");
      out.write("                             ");
      out.print(session.getAttribute("des"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <label>Contact Details</label>\n");
      out.write("                             ");
      out.print(session.getAttribute("det"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("                    <br><br>\n");
      out.write("                    <p>The Above are the Contact details of a Manager who has faced a similar Challenge and proffered solution to it</p>\n");
      out.write("            <input type=\"submit\" value=\"Home\" class=\"btn btn-group-justified\">\n");
      out.write("        </form>\n");
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
