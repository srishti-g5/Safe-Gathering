<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane" %>

<%
  String status=request.getParameter("status");
    String uId=(String)session.getAttribute("CALL1");
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");
PreparedStatement ps = con.prepareStatement("update complain set Status=? where Uid=?");




ps.setString(1,status);
ps.setString(2,uId);
ps.executeUpdate();
response.sendRedirect("Complain.jsp");
%>
