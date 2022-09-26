package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Complain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        a{\n");
      out.write("            text-decoration:none;\n");
      out.write("            color:black;\n");
      out.write("        }\n");
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
      out.write("                    <td class=\"tdtheme\"> <a href=\"ComplainManagerAcc.jsp\" >Account</a></td>\n");
      out.write("                    <td class=\"tdtheme\"> <a href=\"MallEmpLogin.jsp\" >Logout </a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div style=\"width:100%;height:260px;background:rgba(255,255,255,0.6)\">\n");
      out.write("           \n");
      out.write("          ");

String eId=(String)session.getAttribute("CALL");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");
ArrayList list1 = new ArrayList();
ArrayList list2 = new ArrayList();
ArrayList list3 = new ArrayList();
ArrayList list4 = new ArrayList();
ArrayList list5 = new ArrayList();

PreparedStatement ps=con.prepareStatement("select * from complain");
ResultSet rs = ps.executeQuery();

String id=null;
if(rs.next())
{
 list1.add(rs.getString(1));
    list2.add(rs.getInt(2));
    list3.add(rs.getString(3));
    list4.add(rs.getString(4));
    list5.add(rs.getString(5));
}

          
      out.write("\n");
      out.write("\n");
      out.write("          <form action=\"UpdateStatus.jsp\">\n");
      out.write("              <table width=\"100%\"border=\"1\">\n");
      out.write("                <tr align=\"center\"bgcolor=\"white\">\n");
      out.write("                    <th>Complain Id</th>\n");
      out.write("                    <th>User Id</th>\n");
      out.write("                    \n");
      out.write("                    <th>Date Of Complain</th>\n");
      out.write("                    <th>Complain Description</th>\n");
      out.write("\n");
      out.write("                    <th>Complain Status</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                ");

                    for(int i=0;i<list1.size();i++)
                    {
                    
      out.write("\n");
      out.write("                    <tr align=\"center\">\n");
      out.write("                        <td>\n");
      out.write("                            \n");
      out.write("                           ");
      out.print(list1.get(i));
      out.write("\n");
      out.write("                            ");
session.setAttribute("CALL1",list1.get(i));
      out.write("\n");
      out.write("                             \n");
      out.write("                          \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(list2.get(i));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(list3.get(i));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            ");
      out.print(list4.get(i));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    \n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\"name=\"status\"value=");
      out.print(list5.get(i));
      out.write("></input>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"submit\" value=\"Save\">\n");
      out.write("                        </td>                    \n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("              \n");
      out.write("          </form>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
