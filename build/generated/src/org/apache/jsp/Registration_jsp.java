package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background: url(\"Cons/Right.jpg\") no-repeat center center fixed; \n");
      out.write("                 -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .btn-success\n");
      out.write("            {\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .login-card {\n");
      out.write("                padding: 40px;\n");
      out.write("                width: 400px;\n");
      out.write("                background-color: black;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card h1 {\n");
      out.write("                font-weight: 100;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 2.3em;\n");
      out.write("                color:  #CFB53B;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=submit] {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-card input[type=text], input[type=password] {\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                -webkit-appearance: none;\n");
      out.write("                background: #fff;\n");
      out.write("                border: 1px solid #d9d9d9;\n");
      out.write("                border-top: 1px solid #c0c0c0;\n");
      out.write("                border-radius: 7px; \n");
      out.write("                padding: 0 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .login-card input[placeholder=firstname]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("             .login-card input[placeholder=lastname]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("             .login-card input[placeholder=username]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("             .login-card input[placeholder=password]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("             .login-card input[placeholder=confirmPassword]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("             .login-card input[placeholder=email]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("             .login-card input[placeholder=phoneNo]\n");
      out.write("            {\n");
      out.write("                color: gray;  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("             .login-card select[type=text], input[type=password] {\n");
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
      out.write("\n");
      out.write("            .login-card input[type=text]:hover, input[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .login-card select[type=text]:hover, select[type=password]:hover {\n");
      out.write("                border: 1px solid #b9b9b9;\n");
      out.write("                border-top: 1px solid #a0a0a0;\n");
      out.write("                -moz-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                -webkit-box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("                box-shadow: inset 0 1px 2px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("             .login {\n");
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
      out.write("            .login-submit {\n");
      out.write("                /* border: 1px solid #3079ed; */\n");
      out.write("                border: 0px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("                background-color:  #CFB53B;\n");
      out.write("                \n");
      out.write("                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#4787ed)); */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login-submit:hover {\n");
      out.write("                /* border: 1px solid #2f5bb7; */\n");
      out.write("                border: 0px;\n");
      out.write("                color: black;\n");
      out.write("               // text-shadow: 0 1px rgba(0,0,0,0.3);\n");
      out.write("                //background-color: #357ae8;\n");
      out.write("                /* background-image: -webkit-gradient(linear, 0 0, 0 100%,   from(#4d90fe), to(#357ae8)); */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <div class=\"login-card\">\n");
      out.write("           \n");
      out.write("        <h1>Sign Up</h1>\n");
      out.write("        <br><br>\n");
      out.write("        <form action=\"inReg.jsp\" method=\"POST\" name=\"form\" class=\"form-inline\">\n");
      out.write("                \n");
      out.write("                   <input type=\"text\" name=\"firstname\" placeholder=\"firstname\"/>\n");
      out.write("                   <input type=\"text\" name=\"lstname\" placeholder=\"lastname\"/>\n");
      out.write("                   <input type=\"text\" name=\"usename\" placeholder=\"username\"/>\n");
      out.write("                   <input type=\"password\" name=\"pastxt\" placeholder=\"password\"/>\n");
      out.write("                   <input type=\"password\" name=\"conpass\" placeholder=\"confirmPassword\"/>\n");
      out.write("                   <input type=\"text\" name=\"email\" placeholder=\"email\"/>\n");
      out.write("                   <input type=\"text\" name=\"phnumb\" placeholder=\"phoneNo\"/>\n");
      out.write("                    Register As:\n");
      out.write("                    <select name=\"regtype\">\n");
      out.write("                            <option>Manager</option>\n");
      out.write("                            <option >Student</option>    \n");
      out.write("                            <option>Administrator</option>\n");
      out.write("                    </select>\n");
      out.write("                        <br><br>\n");
      out.write("                        <input type=\"submit\" value=\"Sign up\" class=\"login login-submit\">\n");
      out.write("                        \n");
      out.write("        </form><br><br>\n");
      out.write("                 \n");
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
