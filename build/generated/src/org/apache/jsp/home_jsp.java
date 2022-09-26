package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <style>\n");
      out.write("        .headingtheme\n");
      out.write("        {\n");
      out.write("          font-family:Copperplate Gothic Light;\n");
      out.write("          font-size: 20;\n");
      out.write("          color:  darkblue;\n");
      out.write("        }\n");
      out.write("        .icontheme\n");
      out.write("        {\n");
      out.write("          font-family:Copperplate Gothic Light;\n");
      out.write("          font-size: 15;\n");
      out.write("          color:  darkblue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body background=\"people-network-connections-d-illustration-white-background1-78186502.jpg\" opacity=\"0.7\">\n");
      out.write("        <div style=\"width:100%;height:70px;background-color:white;\"> \n");
      out.write("            <table width=\"50%\" height=\"70px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"heading\">SAFE GATHERING</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table style=\"width:50%;height:70px;margin-top:-60px;margin-left:50%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"icon\">home</td>\n");
      out.write("                    <td class=\"icon\">contact us</td>\n");
      out.write("                    <td class=\"icon\">about us</td>\n");
      out.write("                    <td class=\"icon\">help</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width:100%;height:190px;\"> \n");
      out.write("        <img src=\"covid-welcome-header_gif.gif\" width=\"100%\" height=\"190px\">\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width:40%;height:470px;margin-left:5%;background:rgba(0,0,0,0.5);margin-top:60px\">\n");
      out.write("        <form action=\"signupcode.jsp\">\n");
      out.write("            <table width=\"100%\" height=\"470px\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\">sign up</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>Full name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"fname\" placeholder=\" enter full name\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>User ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"userid\"placeholder=\" enter user ID\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\" placeholder=\" enter password\"> </td>\n");
      out.write("                </tr>                \n");
      out.write("                 <tr align=\"center\">\n");
      out.write("                    <td>Email</td>\n");
      out.write("                     <td><input type=\"text\" name=\"email\" placeholder=\"email\"> </td>                   \n");
      out.write("                </tr>  \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                       <td><input type=\"submit\" value=\"sign up\" name=\"btn1\"> </td>                      \n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                       <td><input type=\"Reset\" value=\"Clear\" name=\"btn2\"> </td>                      \n");
      out.write("                    </td>                 \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"width:40%;height:470px;margin-left:54%;background:rgba(0,0,0,0.5);margin-top:-470px;\">\n");
      out.write("            <form action=\"logincode.jsp\">\n");
      out.write("              <table width=\"100%\" height=\"470px\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\">login</td>\n");
      out.write("                </tr>  \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>User ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"userid\" placeholder=\"enter user ID\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"pass\" placeholder=\" enter password\"> </td>\n");
      out.write("                </tr>                 \n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                       <td><input type=\"submit\" value=\"login\" name=\"btn3\"> </td>                      \n");
      out.write("                    </td>\n");
      out.write("                     <td colspan=\"2\">\n");
      out.write("                       <td><input type=\"Reset\" value=\"Clear\" name=\"btn4\"> </td>                      \n");
      out.write("                    </td>                   \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        \n");
      out.write("        </div>       \n");
      out.write("    </body>\n");
      out.write("</html>");
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
