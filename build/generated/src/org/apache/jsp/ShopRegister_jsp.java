package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShopRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            height:15px;\n");
      out.write("            \n");
      out.write("            background-color: F0785C ;\n");
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
      out.write("    <body bgcolor=\"white\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div style=\"width:100%;height:100px;background-color:blue\">\n");
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
      out.write("        <div style=\"width:100%;height:50px;background-color:black;\">\n");
      out.write("            \n");
      out.write("            <table width=\"100%\"align=\"right\"height=\"30px\">\n");
      out.write("                <tr align=\"middle\">\n");
      out.write("                    <td class=\"tdtheme\">Home </td>\n");
      out.write("                    <td class=\"tdtheme\"> About</td>\n");
      out.write("                    <td class=\"tdtheme\"> <a href=\"mailTo:\" >Contact </a></td>\n");
      out.write("                    <td class=\"tdtheme\"> <a href=\"ShopManagerAcc.jsp\" >Account</a></td>\n");
      out.write("                    <td class=\"tdtheme\"> <a href=\"home.jsp\" >Logout </a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"width:60%;height:260px;background:rgba(255,255,255,0.6);margin-left:450px\">\n");
      out.write("           \n");
      out.write("           <form action=\"ShopRegisterCode.jsp\">\n");
      out.write("             <table width=\"50%\"align=\"left\"border=\"0\"cellspacing=\"5\"cellpadding=\"3\">\n");
      out.write("                 <tr bgcolor=\"white\">\n");
      out.write("                    <td align=\"center\"colspan=\"2\"><h4>Shop Registration</h4></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("<tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">USER ID</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" name=\"uId\" class=\"inputtheme\"value=\"");
      out.print(session.getAttribute("CALL"));
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                                <tr align=\"center\"colspace=\"2\">\n");
      out.write("                                    \n");
      out.write("                    <td><font color=\"black\">SHOP NAME</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" name=\"sName\"class=\"inputtheme\"placeholder=\"enter shop name here\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">SHOP NUMBER</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" name=\"sNo\" class=\"inputtheme\"placeholder=\"enter shop number here\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">FLOOR NUMBER</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"integer\" name=\"floorNo\" class=\"inputtheme\"placeholder=\"enter floor no here\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">AREA OF SHOP</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"float\" name=\"area\" class=\"inputtheme\"placeholder=\"enter area here\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("               <tr align=\"center\">\n");
      out.write("                   <td><input type=\"submit\" value=\"SUBMIT\"class=\"buttontheme\"></td>\n");
      out.write("                   <td><input type=\"reset\"value=\"CLEAR\"class=\"buttontheme\"></td>\n");
      out.write("                </tr>\n");
      out.write("           </table> \n");
      out.write("               </form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("            </body>\n");
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
