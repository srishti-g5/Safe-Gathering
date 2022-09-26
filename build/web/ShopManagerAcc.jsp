
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager,static java.lang.System.out"%>
<html>
     <style>
        .buttontheme{
            font-size: 20px;
        }
        .tdtheme
        {
            width:20px;
            height:15px;
            
            background-color: F0785C ;
            font-weight:bold;
            font-family: sans-serif;
            font-size:33px;
            align:center;
        }
        .tdtheme:hover{
            background-color:white;
        }
        a{
            text-decoration: none;
            color:blue;
        }

    </style>
    <body bgcolor="lightblue">
        <div style="width:100%;height:50px;background-color:black;">
            
            <table width="100%"align="right"height="30px">
                <tr align="middle">
                    <td class="tdtheme">Home </td>
                    <td class="tdtheme"> About</td>
                    <td class="tdtheme"> <a href="mailTo:" >Contact </a></td>
                    <td class="tdtheme"> <a href="ShopManager.jsp" >Shop Information</a></td>
                    <td class="tdtheme"> <a href="MallEmpLogin.jsp" >Logout </a></td>
                </tr>
            </table>
        </div>
        <div style="width: 100%; height: 20%; background: rgba(0,0,0,0.5)">
           
        </div>
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
        <div>
            <form action="ShopManagerAccCode.jsp">
                <table align="center" width="80%" cellspacing="15px" cellpadding="5px">
                <tr align="center" bgcolor="white">
                    <td colspan="2"><font size="6px">ACCOUNT INFORMATION </td>
                </tr>
                <tr align="center">
                    <td>ID</td>
              
                
                    <td><p style="color: #000000; background-color: white"><%out.println(eId);%></p></td>
                </tr>
                <tr align="center"colspace="2">
                                    
                    <td><font color="black">SHOP NAME</td>
                   
               
                    <td><input type="text" name="sName"class="inputtheme"value="<%out.println(shopName);%>"></td>
                   
                </tr>
                <tr align="center">
                    <td><font color="black">SHOP NUMBER</td>
                   
               
                    <td><input type="text" name="sNo" class="inputtheme"value="<%out.println(shopNo);%>"></td>
                   
                </tr>
                <tr align="center">
                    <td><font color="black">FLOOR NUMBER</td>
                   
               
                    <td><input type="integer" name="floorNo" class="inputtheme"value="<%out.println(floorNo);%>"></td>
                   
                </tr>
                <tr align="center">
                    <td><font color="black">AREA OF SHOP</td>
                   
               
                    <td><input type="float" name="area" class="inputtheme" value="<%out.println(area);%>"></td>
                   
                </tr>
                <tr align="center">
                    <td><input type="submit" value="Submit" class="buttontheme"><td>
                        <td><input type="reset" value="Reset" class="buttontheme"><td>
                </tr>

            </table>
            </form>
                    <form action="SMPassword.jsp">
                    <table align="center" width="80%" cellspacing="15px" cellpadding="5px">
                        <tr align="center" bgcolor="white">
                    <td colspan="2"><font size="6px">Change Password </td>
                </tr>
                <tr align="center">
                    <td>ID</td>
              
                
                    <td><p style="color: #000000; background-color: white"><%out.println(eId);%></p></td>
                </tr>

                        <tr align="center">
                    <td>ENTER OLD PASSWORD</td>
                
                    <td><input type="password" placeholder="enter password here" name="pass"></td>
                </tr>
                <tr align="center">
                    <td>ENTER NEW PASSWORD</td>
                
                    <td><input type="password" placeholder="enter password here" name="newPass"></td>
                </tr>
                <tr align="center">
                    <td>ENTER CONFIRM PASSWORD</td>
                
                    <td><input type="password" placeholder="enter password here" name="conPass"></td>
                </tr>
                <tr align="center">
                    <td><input type="submit" value="Change Password" class="buttontheme"><td>
                        <td><input type="reset" value="Reset" class="buttontheme"><td>
                </tr>
                    </table>
                
            </form>
        </div>
        <br>
</html>
