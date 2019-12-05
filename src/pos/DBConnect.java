/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DBConnect {
    
     public static Connection connect ()
    {
        Connection conn = null;
         
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pos","root","");
           return conn;
        }
        catch (Exception e){
              JOptionPane.showMessageDialog(null, e);
              return null;
    }
    }
    
}
