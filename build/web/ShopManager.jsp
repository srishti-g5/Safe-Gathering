<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager,static java.lang.System.out"%>
<% 
 %>
<html>
    <style>
        .tdtheme
        {
            width:20px;
            height:15px;
            
            background-color: F0785C ;
            font-weight:bold;
            font-family:fantasy;
            font-size:33px;
            align:center;
        }
        .tdtheme:hover{
            background-color:white;
        }
        .highlight
        {
             width:20px;
            height:50px;
            border-radius:20px;
            
            font-weight:bold;
            font-family:default;
        }
        .sitetitle{
            font-size:70px;
            font-weight:bold;
            font-family:cursive;
            text-transform:uppercase;
            color:black;
        }
        a{text-decoration:none;
        Color:black}
    </style>
    <body bgcolor="white">
       
        
        <div style="width:100%;height:100px;background-color:blue">
            <table width="80%">
                <tr colspace="2">
                    
                    <td align="right">
                        <h2 class="sitetitle"><font color="F0785C">S<->A<->F<->E GATHERING </h2>
                    </td>
                    
                </tr>
            </table>
        </div>
        <div style="width:100%;height:50px;background-color:black;">
            
            <table width="100%"align="right"height="30px">
                <tr align="middle">
                    <td class="tdtheme"><a href="home1.jsp" >Home</a> </td>
                    <td class="tdtheme"> About</td>
                    <td class="tdtheme"> <a href="mailTo:" >Contact </a></td>
                    <td class="tdtheme"> <a href="ShopManagerAcc.jsp" >Account</a></td>
                    <td class="tdtheme"> <a href="MallEmpLogin.jsp" >Logout </a></td>
                </tr>
            </table>
        </div>
        <br>
        <br>
        <br>
        <br>
        <div style="width:60%;height:260px;background:rgba(255,255,255,0.6);margin-left:450px">
           
          <%
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

          %>

          <table width="100%" cellspacing="20"  cellpadding="20" style="text-indent: inherit;z-index: -1;text-orientation: mixed;text-decoration:none;line-height: 25px;background-color:lightgray;font-size: 15px" align="center"  border="1">
              <tr bgcolor="lightgray">
                  <th>Employee Id</th>
                  <td bgcolor="white"><%=eId%></td>
                  <th>Shop No</th>
                  <td bgcolor="white"><%=shopNo %></td>
              </tr>              
              <tr>
                  <th colspan="3" align="left">Shop Name</th>
                  <td bgcolor="white"><%=shopName %></td>
              </tr>
              <tr>
                  <th colspan="3" align="left">Floor No</th>
                  <td bgcolor="white"><%=floorNo %></td>
              </tr>
              <tr>
                  <th align=left colspan="3">Area</th>
                  <td bgcolor="white"><%=area %></td>
              </tr>
              
          </table>
          
          
          
        </div>
        
            </body>
</html>
