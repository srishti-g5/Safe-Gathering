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
                    <td class="tdtheme">Home </td>
                    <td class="tdtheme"> About</td>
                    <td class="tdtheme"> <a href="mailTo:" >Contact </a></td>
                    <td class="tdtheme"> <a href="ShopManagerAcc.jsp" >Account</a></td>
                    <td class="tdtheme"> <a href="home.jsp" >Logout </a></td>
                </tr>
            </table>
        </div>
        <br>
        <br>
        <br>
        <br>
        <div style="width:60%;height:260px;background:rgba(255,255,255,0.6);margin-left:450px">
           
           <form action="ShopRegisterCode.jsp">
             <table width="50%"align="left"border="0"cellspacing="5"cellpadding="3">
                 <tr bgcolor="white">
                    <td align="center"colspan="2"><h4>Shop Registration</h4></td>
                    
                </tr>
<tr align="center">
                    <td><font color="black">USER ID</td>
                   
               
                    <td><input type="text" name="uId" class="inputtheme"value="<%=session.getAttribute("CALL")%>"></td>
                   
                </tr>
                                <tr align="center"colspace="2">
                                    
                    <td><font color="black">SHOP NAME</td>
                   
               
                    <td><input type="text" name="sName"class="inputtheme"placeholder="enter shop name here"></td>
                   
                </tr>
                <tr align="center">
                    <td><font color="black">SHOP NUMBER</td>
                   
               
                    <td><input type="text" name="sNo" class="inputtheme"placeholder="enter shop number here"></td>
                   
                </tr>
                <tr align="center">
                    <td><font color="black">FLOOR NUMBER</td>
                   
               
                    <td><input type="integer" name="floorNo" class="inputtheme"placeholder="enter floor no here"></td>
                   
                </tr>
                <tr align="center">
                    <td><font color="black">AREA OF SHOP</td>
                   
               
                    <td><input type="float" name="area" class="inputtheme"placeholder="enter area here"></td>
                   
                </tr>


                                


            
               <tr align="center">
                   <td><input type="submit" value="SUBMIT"class="buttontheme"></td>
                   <td><input type="reset"value="CLEAR"class="buttontheme"></td>
                </tr>
           </table> 
               </form>

        
            </body>
</html>
