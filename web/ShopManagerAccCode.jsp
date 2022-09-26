<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane" %>

<%
  String uID=(String)session.getAttribute("CALL");
  String sName=request.getParameter("sName");
  int sNo=Integer.parseInt(request.getParameter("sNo"));
  int floorNo=Integer.parseInt(request.getParameter("floorNo"));
  float area=Float.parseFloat(request.getParameter("area"));
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");
PreparedStatement ps = con.prepareStatement("update shoptable set shopno=?,shopname=?,floorno=?,area=? where eid=?");




ps.setInt(1,sNo);
ps.setString(2,sName);
ps.setInt(3,floorNo);
ps.setFloat(4,area);
ps.setString(5,uID);
ps.executeUpdate();
response.sendRedirect("ShopManagerAcc.jsp");
%>
