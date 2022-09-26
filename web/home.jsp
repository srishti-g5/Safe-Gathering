<%-- 
    Document   : home
    Created on : 27 Dec, 2021, 4:10:01 PM
    Author     : sgsri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        .headingtheme
        {
          font-family:Copperplate Gothic Light;
          font-size: 20;
          color:  darkblue;
        }
        .icontheme
        {
          font-family:Copperplate Gothic Light;
          font-size: 15;
          color:  darkblue;
        }
    </style>
    <body background="people-network-connections-d-illustration-white-background1-78186502.jpg" opacity="0.7">
        <div style="width:100%;height:70px;background-color:white;"> 
            <table width="50%" height="70px">
                <tr>
                    <td class="heading">SAFE GATHERING</td>
                </tr>
            </table>
            <table style="width:50%;height:70px;margin-top:-60px;margin-left:50%">
                <tr>
                    <td class="icon">home</td>
                    <td class="icon">contact us</td>
                    <td class="icon">about us</td>
                    <td class="icon">help</td>
                </tr>
            </table>
        </div>
        <div style="width:100%;height:190px;"> 
        <img src="covid-welcome-header_gif.gif" width="100%" height="190px">
        </div>
        <div style="width:40%;height:470px;margin-left:5%;background:rgba(0,0,0,0.5);margin-top:60px">
        <form action="signupcode.jsp">
            <table width="100%" height="470px">
                <tr align="center">
                    <td colspan="2">sign up</td>
                </tr>
                <tr align="center">
                    <td>Full name</td>
                    <td><input type="text" name="fname" placeholder=" enter full name"> </td>
                </tr>
                <tr align="center">
                    <td>User ID</td>
                    <td><input type="text" name="userid"placeholder=" enter user ID"> </td>
                </tr>
                <tr align="center">
                    <td>password</td>
                    <td><input type="password" name="pass" placeholder=" enter password"> </td>
                </tr>                
                 <tr align="center">
                    <td>Email</td>
                     <td><input type="text" name="email" placeholder="email"> </td>                   
                </tr>  
                <tr align="center">
                    <td colspan="2">
                       <td><input type="submit" value="sign up" name="btn1"> </td>                      
                    
                     
                       <td><input type="Reset" value="Clear" name="btn2"> </td>                      
                    </td>                 
                </tr>
            </table>
            </form>
        </div>
        <div style="width:40%;height:470px;margin-left:54%;background:rgba(0,0,0,0.5);margin-top:-470px;">
            <form action="logincode.jsp">
              <table width="100%" height="470px">
                <tr align="center">
                    <td colspan="2">login</td>
                </tr>  
                <tr align="center">
                    <td>User ID</td>
                    <td><input type="text" name="userid" placeholder="enter user ID"> </td>
                </tr>
                <tr align="center">
                    <td>password</td>
                    <td><input type="password" name="pass" placeholder=" enter password"> </td>
                </tr>                 
                <tr align="center">
                    <td colspan="2">
                       <td><input type="submit" value="login" name="btn3"> </td>                      
                    </td>
                     <td colspan="2">
                       <td><input type="Reset" value="Clear" name="btn4"> </td>                      
                    </td>                   
                </tr>
            </table>
        
        </div>       
    </body>
</html>