package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            .bod\n");
      out.write("            {\n");
      out.write("                width:60%;\n");
      out.write("                //margin:0 50px 0 auto;\n");
      out.write("                margin-left: 65px;\n");
      out.write("                /*                margin-left: 50px;\n");
      out.write("                                margin-right: 50px*/\n");
      out.write("            }\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                background: black;\n");
      out.write("                opacity: 0.65;\n");
      out.write("                width:100%;\n");
      out.write("              // position: fixed;\n");
      out.write("               margin-top: 0px;\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            .logo{\n");
      out.write("                width:200px;\n");
      out.write("                height:70px;\n");
      out.write("                float:left;\n");
      out.write("                color:#CFB53B;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                padding:10px 0 0 50px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            nav{\n");
      out.write("                width:70%;\n");
      out.write("                height:70px;\n");
      out.write("                float:right;\n");
      out.write("                text-align: right;\n");
      out.write("               // background: #fff;\n");
      out.write("                padding: 0 40px 0 0;\n");
      out.write("            }\n");
      out.write("            nav ul{\n");
      out.write("                padding-top: 23px;/*to change the position of the font/text*/\n");
      out.write("            }\n");
      out.write("            nav ul li{\n");
      out.write("                list-style: none;\n");
      out.write("                display: inline;\n");
      out.write("                padding: 20px 0px;\n");
      out.write("            }\n");
      out.write("            nav li a{\n");
      out.write("                color:#CFB53B;\n");
      out.write("                font-size: 19px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding:23px 15px;\n");
      out.write("            }\n");
      out.write("            nav li a:hover{\n");
      out.write("                background: #000;\n");
      out.write("                color:white;\n");
      out.write("                transition: all 0.5s ease-in-out;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                margin: 0px;\n");
      out.write("                 background: black;\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                background-size: cover;\n");
      out.write("               // font-family: 'Roboto', sans-serif;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .btn-primary\n");
      out.write("            {\n");
      out.write("                border-radius: 6px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .btn-primary\n");
      out.write("            {\n");
      out.write("                border: 0px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-shadow: 0 1px rgba(0,0,0,0.1); \n");
      out.write("                background-color: #4d90fe;\n");
      out.write("            }\n");
      out.write("            p,h2,h4\n");
      out.write("            {\n");
      out.write("                text-align: left;\n");
      out.write("                color:  white;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                text-justify: inter-word;\n");
      out.write("                margin: 0 0 0 0;\n");
      out.write("                font-size: 20px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h6\n");
      out.write("            {\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 130px 10px 0 0;\n");
      out.write("                font-size: 15px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .header\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("               // background: black;\n");
      out.write("               background: url(\"Cons/flex.jpg\") no-repeat center center fixed;\n");
      out.write("            }\n");
      out.write("            #lower\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: auto;\n");
      out.write("                background: black;\n");
      out.write("                height: 300px;    \n");
      out.write("            }\n");
      out.write("            #lower p\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            #lowerr\n");
      out.write("            {\n");
      out.write("                width: 90%;\n");
      out.write("                margin: 40px auto;\n");
      out.write("                font-weight: 100px;\n");
      out.write("            }\n");
      out.write("            .bod h1\n");
      out.write("            {\n");
      out.write("                font-weight: 900;\n");
      out.write("                font-size: 400%;\n");
      out.write("                text-align: left;\n");
      out.write("                color:  white;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                text-justify: inter-word;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .btn-lg\n");
      out.write("            {\n");
      out.write("                background:#CFB53B;\n");
      out.write("                margin:20px 50px 20px 70px;\n");
      out.write("                width: 150px;\n");
      out.write("                height:70px;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .con input[type=button]\n");
      out.write("            {\n");
      out.write("                border: 5px solid white;\n");
      out.write("            }\n");
      out.write("            .con input[type=button]\n");
      out.write("            {\n");
      out.write("               // background: white;\n");
      out.write("                //color:grey;\n");
      out.write("                //transition: all 0.5s ease-in-out;\n");
      out.write("            }\n");
      out.write("            .container2\n");
      out.write("            {\n");
      out.write("                width:100%;\n");
      out.write("                max-width: 1200px;\n");
      out.write("                height:auto;\n");
      out.write("                overflow: auto;\n");
      out.write("                margin:0 auto 0 auto;\n");
      out.write("                background: black;\n");
      out.write("            }\n");
      out.write("            .box1{\n");
      out.write("                width:30%;\n");
      out.write("                height: 200px;\n");
      out.write("                background: #CFB53B;\n");
      out.write("                float: left;\n");
      out.write("                margin: 25px  1% 0 1%;\n");
      out.write("               // background-image: url(\"Cons/You.jpg\");\n");
      out.write("            }\n");
      out.write("            .box2{\n");
      out.write("                width:30%;\n");
      out.write("                height: 200px;\n");
      out.write("                background:#CFB53B;\n");
      out.write("                float: left;\n");
      out.write("                margin: 25px  1% 0 1%;\n");
      out.write("            }\n");
      out.write("            .box3{\n");
      out.write("                width:30%;\n");
      out.write("                height: 200px;\n");
      out.write("               background: #CFB53B;\n");
      out.write("                float: left;\n");
      out.write("                margin: 25px  1% 0 1%;\n");
      out.write("            }\n");
      out.write("         \n");
      out.write("            #pic1\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("             #pic2\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("             #pic3\n");
      out.write("            {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
 Date dt = new Date();
        
      out.write("\n");
      out.write("        <div class =\"header\">\n");
      out.write("\t\t<div class =\"container\">\n");
      out.write("\t\t\t<div class =\"logo\">ZIPPERZ <br>Construction</div>\n");
      out.write("\t\t\t<nav>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li> <a href =\"HomePage.jsp\" class=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li> <a href =\"index.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li> <a href =\"HomePage.jsp\">Services</a></li>\n");
      out.write("\t\t\t\t\t<li> <a href =\"HomePage.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("                        </nav>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("            <div class=\"con\">\n");
      out.write("             \n");
      out.write("             <div class=\"bod\">\n");
      out.write("                 <center><h1>Construction Manager Experience</h1></center><br>\n");
      out.write("            \n");
      out.write("            <h2>Welcome,<b>Guest</b>:Join our Great Team of solution providers to Frequently encountered Construction challenges</h2><br><br>\n");
      out.write("            <h4><label>Stats:</label> 200 members,500 challenges and solutions.</h4>\n");
      out.write("            <h4><label>Date:</label> ");
      out.print(dt);
      out.write("</h4><br><br>\n");
      out.write("            <p> This software enables members to either register as Manager who can share their encounters in a construction site and proffer solutions to them\n");
      out.write("            or to Sign up as a student to search for the themes of different problems encountered in a construction site,the solutions to such problems and to\n");
      out.write("            Contact such people who can proffer solution to such problems</p><br><br>\n");
      out.write("               \n");
      out.write("             </div>\n");
      out.write("            <input type=\"button\" value=\"About us\" class=\"btn btn-lg\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            <div class =\"container2\">\n");
      out.write("                <div class =\"box1\">\n");
      out.write("                    <img style =\"max-width:120%; max-height:100%; \" src=\"Cons/p1.jpg\" id=\"pic1\">\n");
      out.write("                </div>\n");
      out.write("                <div class =\"box2\">\n");
      out.write("                    <img style =\"max-width:100%; max-height:100%; \" src=\"Cons/p2.jpg\" id=\"pic2\">\n");
      out.write("                </div>\n");
      out.write("                <div class =\"box3\">\n");
      out.write("                    <img style =\"max-width:100%; max-height:100%; \" src=\"Cons/p3.jpg\" id=\"pic3\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"lower\">\n");
      out.write("                <div id=\"lowerr\"><p>  We are a Building and Civil. Engineering Company incorporated in Nigeria in the year 2010. We build on a culture of excellence, created and sustained by experience acquired tithe promoters over the years in Building, General Civil works, property development., telecommunication site construction, maintenance and management. </p></div>\n");
      out.write("                <br><br><br><br><br><br><h6>&copy2020 EkpokpobeDavidson</h6>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            \n");
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
