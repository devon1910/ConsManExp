package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManagerExperience_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Manager Experience</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background: url(\"Cons/Right.jpg\") no-repeat center center fixed; \n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .btn-success\n");
      out.write("            {\n");
      out.write("                 margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .ManExpCard\n");
      out.write("            {\n");
      out.write("                padding: 40px;\n");
      out.write("                width: 400px;\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .ManExpCard h1\n");
      out.write("            {\n");
      out.write("                font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                color:  #CFB53B;\n");
      out.write("            }\n");
      out.write("            .ManExpCard input[type=submit] {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ManExpCard input[type=text]{\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                /* border-radius: 2px; */\n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("/*             .ManExpCard select[type=text]{\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                 border-radius: 2px; \n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }*/\n");
      out.write("\n");
      out.write("            .ManExpCard input[type=text]:hover{\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("/*            .ManExpCard select[type=text]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }*/\n");
      out.write("            .ManExpCard textarea:hover\n");
      out.write("            {\n");
      out.write("                 border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            .ManExpCard textarea\n");
      out.write("            {\n");
      out.write("                 height: 100px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                /* border-radius: 2px; */\n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-family: 'Arial', sans-serif;\n");
      out.write("                font-weight: 700;\n");
      out.write("                height: 36px;\n");
      out.write("                padding: 0 8px;\n");
      out.write("                /* border-radius: 3px; */\n");
      out.write("                /* -webkit-user-select: none;\n");
      out.write("                  user-select: none; */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn-success{\n");
      out.write("                /* border: 1px solid #3079ed; */\n");
      out.write("                border: 0px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("               background-color:  #CFB53B;\n");
      out.write("                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */\n");
      out.write("            }\n");
      out.write("            .btn-success:hover {\n");
      out.write("                /* border: 1px solid #2f5bb7; */\n");
      out.write("                border: 0px;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.3);\n");
      out.write("                color: black;\n");
      out.write("                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */\n");
      out.write("            }\n");
      out.write("            .ManExpCard label\n");
      out.write("            {\n");
      out.write("               font-family: sans-serif;         \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("           \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <br><br><br>\n");
      out.write("        <div class=\"ManExpCard\">\n");
      out.write("        <h1>Welcome ");
      out.print(session.getAttribute("Uname"));
      out.write("</h1><br><br>\n");
      out.write("        <form action=\"inMan.jsp\" method=\"POST\" name=\"Exp\">\n");
      out.write("     <div class=\"input-group\">\n");
      out.write("  <select class=\"custom\" id=\"inputGroupSelect04\" aria-label=\"Example select with button addon\">\n");
      out.write("    <option selected>Choose...</option>\n");
      out.write("                <option>Gwarimpa,Abuja</option>\n");
      out.write("                <option>Warri,Delta</option>\n");
      out.write("                <option>Aba,Onitsha</option>\n");
      out.write("                <option>Ota,Ogun</option>\n");
      out.write("                <option>Port-Harcourt,Rivers</option>\n");
      out.write("                <option>Benin,Edo</option>\n");
      out.write("                <option>Ogunu,Delta</option>\n");
      out.write("                <option>Bonny,Rivers</option>\n");
      out.write("                <option>Lekki,Lagos</option>\n");
      out.write("                <option>Surulere,Lagos</option>\n");
      out.write("                <option>Abeokuta,Ogun</option>\n");
      out.write("                <option>Uyo,Akwa-ibom</option>\n");
      out.write("                <option>Festac,Lagos</option>\n");
      out.write("                <option>Garki,Abuja</option>\n");
      out.write("  </select>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("            <br><br>\n");
      out.write("            <label></label><input type=\"text\" name=\"themee\" size=\"28\" placeholder=\"Theme of the problem\"><br><br>\n");
      out.write("            <label></label><textarea name=\"descriptionn\" rows=\"7\" cols=\"30\" placeholder=\"Description of Challenges\"></textarea><br><br>\n");
      out.write("            <label></label><textarea name=\"remedyy\" rows=\"7\" cols=\"30\" placeholder=\"Remedy\"></textarea><br><br>\n");
      out.write("            <label></label><textarea name=\"resourcess\" rows=\"7\" cols=\"30\" placeholder=\"Resources used\"></textarea><br><br>\n");
      out.write("            <label></label><textarea name=\"detailss\" rows=\"7\" cols=\"30\" placeholder=\"Contact details\"></textarea><br><br>\n");
      out.write("            <input type=\"submit\" value=\"Done\" class=\"btn btn-success\">\n");
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
