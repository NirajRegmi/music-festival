/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Niraj Regmi
 */

    
    public class NewClass
{
        public static void main(String[]args)throws Exception
    
         {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String name= "username";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/music_info","root","");
            JOptionPane.showMessageDialog(null,"Database connected","Database info",-1);
            String sql = "SELECT * FROM USERINFO";
            st = con.createStatement();
            rs= st.executeQuery(sql);
            
            
            con.close();
            st.close();
            rs.close();
            
            }
        }
            catch (ClassNotFoundException e)
                    {JOptionPane.showMessageDialog(null,"connection failure");}
            
        
         }
    }
    

