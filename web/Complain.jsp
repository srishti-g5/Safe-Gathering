<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
        a{
            text-decoration:none;
            color:black;
        }
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
                    <td class="tdtheme">Home </td>
                    <td class="tdtheme"> About</td>
                    <td class="tdtheme"> <a href="mailTo:" >Contact </a></td>
                    <td class="tdtheme"> <a href="ComplainManagerAcc.jsp" >Account</a></td>
                    <td class="tdtheme"> <a href="MallEmpLogin.jsp" >Logout </a></td>
                </tr>
            </table>
        </div>
        <br>
        <br>
        <br>
        <br>
        <div style="width:100%;height:260px;background:rgba(255,255,255,0.6)">
           
          <%
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

          %>

          <form action="UpdateStatus.jsp">
              <table width="100%"border="1">
                <tr align="center"bgcolor="white">
                    <th>Complain Id</th>
                    <th>User Id</th>
                    
                    <th>Date Of Complain</th>
                    <th>Complain Description</th>

                    <th>Complain Status</th>
                    
                </tr>
                <%
                    for(int i=0;i<list1.size();i++)
                    {
                    %>
                    <tr align="center">
                        <td>
                            
                          <%=list2.get(i)%> 
                             
                          
                        </td>
                        <td>
                            
                            <%=list1.get(i)%>
                            <%session.setAttribute("CALL1",list1.get(i));%>
                        </td>
                        <td>
                            <%=list3.get(i)%>
                        </td>
                        <td>
                            <%=list4.get(i)%>
                        </td>
                    
                        <td>
                            <input type="text"name="status"value=<%=list5.get(i)%>></input>
                        </td>
                        <td>
                            <input type="submit" value="Save">
                        </td>                    

                        
                        

                    </tr>
                                        <%}%>
            </table>
              
          </form>
          
          
          
        </div>
        
            </body>
</html>

