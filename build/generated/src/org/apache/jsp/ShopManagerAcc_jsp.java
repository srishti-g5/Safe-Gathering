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

public final class ShopManagerAcc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("     <style>\n");
      out.write("        .buttontheme{\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .tdtheme\n");
      out.write("        {\n");
      out.write("            width:20px;\n");
      out.write("            height:15px;\n");
      out.write("            \n");
      out.write("            background-color: F0785C ;\n");
      out.write("            font-weight:bold;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            font-size:33px;\n");
      out.write("            align:center;\n");
      out.write("        }\n");
      out.write("        .tdtheme:hover{\n");
      out.write("            background-color:white;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:blue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <body bgcolor=\"lightblue\">\n");
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
      out.write("        <div style=\"width: 100%; height: 20%; background: rgba(0,0,0,0.5)\">\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        ");

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
      out.write("        <div>\n");
      out.write("            <form action=\"ShopManagerAccCode.jsp\">\n");
      out.write("                <table align=\"center\" width=\"80%\" cellspacing=\"15px\" cellpadding=\"5px\">\n");
      out.write("                <tr align=\"center\" bgcolor=\"white\">\n");
      out.write("                    <td colspan=\"2\"><font size=\"6px\">ACCOUNT INFORMATION </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>ID</td>\n");
      out.write("              \n");
      out.write("                \n");
      out.write("                    <td><input type=\"text\" value=\"");
out.println(eId);
      out.write("\" name=\"uId\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\"colspace=\"2\">\n");
      out.write("                                    \n");
      out.write("                    <td><font color=\"black\">SHOP NAME</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" name=\"sName\"class=\"inputtheme\"value=\"");
out.println(shopName);
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">SHOP NUMBER</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" name=\"sNo\" class=\"inputtheme\"value=\"");
out.println(shopNo);
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">FLOOR NUMBER</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"integer\" name=\"floorNo\" class=\"inputtheme\"value=\"");
out.println(floorNo);
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><font color=\"black\">AREA OF SHOP</td>\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    <td><input type=\"float\" name=\"area\" class=\"inputtheme\" value=\"");
out.println(area);
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><input type=\"submit\" value=\"Submit\" class=\"buttontheme\"><td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\" class=\"buttontheme\"><td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("                    <form action=\"SMPassword.jsp\">\n");
      out.write("                    <table align=\"center\" width=\"80%\" cellspacing=\"15px\" cellpadding=\"5px\">\n");
      out.write("                        <tr align=\"center\" bgcolor=\"white\">\n");
      out.write("                    <td colspan=\"2\"><font size=\"6px\">Change Password </td>\n");
      out.write("                </tr>\n");
      out.write("                        <tr align=\"center\">\n");
      out.write("                    <td>ENTER OLD PASSWORD</td>\n");
      out.write("                \n");
      out.write("                    <td><input type=\"password\" placeholder=\"enter password here\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>ENTER NEW PASSWORD</td>\n");
      out.write("                \n");
      out.write("                    <td><input type=\"password\" placeholder=\"enter password here\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td>ENTER CONFIRM PASSWORD</td>\n");
      out.write("                \n");
      out.write("                    <td><input type=\"password\" placeholder=\"enter password here\" name=\"pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td><input type=\"submit\" value=\"Change Password\" class=\"buttontheme\"><td>\n");
      out.write("                        <td><input type=\"reset\" value=\"Reset\" class=\"buttontheme\"><td>\n");
      out.write("                </tr>\n");
      out.write("                    </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
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
