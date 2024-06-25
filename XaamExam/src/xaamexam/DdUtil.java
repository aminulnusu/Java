
package xaamexam;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DdUtil {
    private Connection con=null;
    private String url="jdbc:mysql://localhost:3307/dbcrud";
    private String user="root";
    private String password="";
    private String Driver ="com.mysql.cj.jdbc.Driver";
    
    public Connection getConnection(){
        try {
            
            
            Class.forName(Driver);
            con=DriverManager.getConnection(url, user, password);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DdUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DdUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    return con;
    
    }

}
