
package jdcapply;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DdUtil {
    
    private Connection connection=null;
    private String url="jdbc:mysql://localhost:3306/dbcrud";
    private String user="root";
    private String password="1234";
    private String drive="com.mysql.cj.jdbc.Driver";
    
    public  Connection getConnection(){
    
        try {
            Class.forName(drive);
            connection=DriverManager.getConnection("", "aminul", "1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DdUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DdUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    return connection;
       
    
    }
    
    
    
}
