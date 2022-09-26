package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.lang.System.out;

public final class ShopManager_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
 
      out.write("\n");
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
      out.write("          ");

String eId=(String)session.getAttribute("CALL");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");
PreparedStatement ps=con.prepareStatement("select * from shoptable where eid=?");
ps.setString(1,eId);
ResultSet rs = ps.executeQuery();

int shopNo=0;
String shopName="";
int floorNo=0;
float area=0.0f;
if(rs.next())
{
shopNo=  rs.getInt(1);
shopName=rs.getString(2);
floorNo=rs.getInt(3);
area=rs.getFloat(4);
}

          
      out.write("\n");
      out.write("\n");
      out.write("          <table width=\"100%\" cellspacing=\"20\"  cellpadding=\"20\" style=\"text-indent: inherit;z-index: -1;text-orientation: mixed;text-decoration:none;line-height: 25px;background-color:lightgray;font-size: 15px\" align=\"center\"  border=\"1\">\n");
      out.write("              <tr bgcolor=\"lightgray\">\n");
      out.write("                  <th>Employee Id</th>\n");
      out.write("                  <td bgcolor=\"white\">");
      out.print(eId);
      out.write("</td>\n");
      out.write("                  <th>Shop No</th>\n");
      out.write("                  <td bgcolor=\"white\">");
      out.print(shopNo );
      out.write("</td>\n");
      out.write("              </tr>              \n");
      out.write("              <tr>\n");
      out.write("                  <th colspan=\"3\" align=\"left\">Shop Name</th>\n");
      out.write("                  <td bgcolor=\"white\">");
      out.print(shopName );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <th colspan=\"3\" align=\"left\">Floor No</th>\n");
      out.write("                  <td bgcolor=\"white\">");
      out.print(floorNo );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                  <th align=left colspan=\"3\">Area</th>\n");
      out.write("                  <td bgcolor=\"white\">");
      out.print(area );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              \n");
      out.write("          </table>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
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
