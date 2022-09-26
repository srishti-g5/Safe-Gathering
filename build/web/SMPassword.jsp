<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane" %>

<%
    String uID=(String)session.getAttribute("CALL");
  String oldPass=request.getParameter("pass");
  String newPass=request.getParameter("newPass");
  String conPass=request.getParameter("conPass");
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");
PreparedStatement ps1=con.prepareStatement("select * from employeetable where emp_id=? and password=?");
ps1.setString(1,uID);
ps1.setString(2,oldPass);
ResultSet rs=ps1.executeQuery();
if(rs.next()){
    if(newPass.equals(conPass)){
PreparedStatement ps = con.prepareStatement("update employeetable set password=? where emp_id=?");




ps.setString(1,newPass);
ps.setString(2,uID);
ps.executeUpdate();
JOptionPane.showMessageDialog(null, "Password Changed");
response.sendRedirect("MallEmpLogin.jsp");
    }
    else{
        JOptionPane.showMessageDialog(null, "Confirm password doesn't match!!!");
response.sendRedirect("ShopManagerAcc.jsp");
        
    }
}
else{
    JOptionPane.showMessageDialog(null, "Password doesn't match!!!");

response.sendRedirect("ShopManagerAcc.jsp");
}
%>
