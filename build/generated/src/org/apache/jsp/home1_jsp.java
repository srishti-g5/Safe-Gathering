package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        .tdtheme\n");
      out.write("        {\n");
      out.write("            width:20px;\n");
      out.write("            height:20px;\n");
      out.write("            border-radius:20px;\n");
      out.write("            background-color: grey ;\n");
      out.write("            font-weight:bold;\n");
      out.write("            font-family:fantasy;\n");
      out.write("            font-size:33px;\n");
      out.write("            align:center;\n");
      out.write("        }\n");
      out.write("        .tdtheme:hover{\n");
      out.write("            background-color:white;\n");
      out.write("        }\n");
      out.write("        .highlight\n");
      out.write("        {\n");
      out.write("             width:20px;\n");
      out.write("            height:50px;\n");
      out.write("            border-radius:20px;\n");
      out.write("            \n");
      out.write("            font-weight:bold;\n");
      out.write("            font-family:default;\n");
      out.write("        }\n");
      out.write("        .sitetitle{\n");
      out.write("            font-size:70px;\n");
      out.write("            font-weight:bold;\n");
      out.write("            font-family:cursive;\n");
      out.write("            text-transform:uppercase;\n");
      out.write("            color:black;\n");
      out.write("        }\n");
      out.write("        a{text-decoration:none;\n");
      out.write("        Color:black}\n");
      out.write("    </style>\n");
      out.write("    <body bgcolor=\"00004A\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div style=\"width:100%;height:100px;background-color:white\">\n");
      out.write("            <table width=\"80%\">\n");
      out.write("                <tr colspace=\"2\">\n");
      out.write("                    \n");
      out.write("                    <td align=\"right\">\n");
      out.write("                        <h2 class=\"sitetitle\"><font color=\"F0785C\">S<->A<->F<->E GATHERING </h2>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div style=\"width:33%;height:350px;background-color:F0785C;margin-left:33%\">\n");
      out.write("            <img src=\"ae.png\" align=\"center\">\n");
      out.write("            <table width=\"34%\"height=\"150px\" style=\"margin-top:-230px;margin-left:170px\">\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                <td align=\"center\"class=\"tdtheme\">\n");
      out.write("                    <a href=\"MallEmpLogin.jsp\">Mall Employee</a>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                <td align=\"center\"class=\"tdtheme\">\n");
      out.write("                    <a href=\"Visitor.jsp\">Visitor</a>\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
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
