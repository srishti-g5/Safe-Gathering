<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane" %>

<%
  
  String password=request.getParameter("pass");
  String id=request.getParameter("uId");  
  
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");
PreparedStatement ps = con.prepareStatement("select * from employeetable where emp_id=? and password=?");



ps.setString(1,id);

ps.setString(2, password);
ResultSet rs = ps.executeQuery();
if(rs.next())
{
    session.setAttribute("CALL",id);
   String design=rs.getString(3);
   if(design.equalsIgnoreCase("shop manager"))
   { PreparedStatement ps1 = con.prepareStatement("select * from shoptable where eid=?");
    ps1.setString(1,id);
    ResultSet rs1 = ps1.executeQuery();
    if(rs1.next())
    {
        
        response.sendRedirect("ShopManager.jsp");
        
    }
    else{
        
        response.sendRedirect("ShopRegister.jsp");
        
    }
   }
   else{
       response.sendRedirect("Complain.jsp");
   }
}
    else{
    JOptionPane.showMessageDialog(null,"Wrond id or Password!");
    response.sendRedirect("MallEmplogin");
    }
%>