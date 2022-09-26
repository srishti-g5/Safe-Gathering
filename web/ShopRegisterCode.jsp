<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<% 
    String id=request.getParameter("uId");
String shopName=request.getParameter("sName");

String sNo=request.getParameter("sNo");
int floor=Integer.parseInt(request.getParameter("floorNo"));
float area=Float.parseFloat(request.getParameter("area"));
int vacancy=(int)area;

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","srishti");

PreparedStatement ps=con.prepareStatement("insert into shoptable values(?,?,?,?,?,?)");
ps.setString(1,sNo);

ps.setString(2,shopName);
ps.setInt(3,floor);
ps.setFloat(4,area);
ps.setInt(5,vacancy);
ps.setString(6,id);
ps.executeUpdate();

response.sendRedirect("ShopManager.jsp");

%>