package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentExperience_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Student Stuffs</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background: url(\"Cons/Right.jpg\") no-repeat center center fixed; \n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .btn-primary\n");
      out.write("            {\n");
      out.write("                border-radius: 6px;\n");
      out.write("                background: #CFB53B;\n");
      out.write("            }\n");
      out.write("            .myform input[type=text]\n");
      out.write("            {\n");
      out.write("                border-radius: 6px;\n");
      out.write("                 height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                 border-radius: 20x; \n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .myform h1\n");
      out.write("            {\n");
      out.write("                 font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                color:#CFB53B;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h2{color:#CFB53B;}\n");
      out.write("            .myform\n");
      out.write("            {\n");
      out.write("               \n");
      out.write("                 padding: 100px;\n");
      out.write("                width: 500px;\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                margin: 20px auto;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                //overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .btn-primary\n");
      out.write("            {\n");
      out.write("                border: 0px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("                background-color:#CFB53B;;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"myform\">\n");
      out.write("             <form name=\"TheForm\" method=\"POST\" action=\"inSearch.jsp\">\n");
      out.write("           \n");
      out.write("                 <center><h1>Welcome to the Student Experience</h1></center><br>\n");
      out.write("            <h2>Hello ");
      out.print(session.getAttribute("Uname"));
      out.write("</h2><br><br>\n");
      out.write("            <input type=\"text\" name=\"search\" placeholder=\"Search for themes\">\n");
      out.write("            <input type=\"submit\" value=\"Search\" class=\"btn btn-primary\">\n");
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
