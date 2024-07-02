
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DButil {
    private Connection connection=null;
    private String url="jdbc:mysql://localhost:3307/aminul"; 
    private String user="root";
    private String password="";
    private String driver="com.mysql.cj.jdbc.Driver";
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            
   connection=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DButil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DButil.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return connection;
    }
    
    
    
    
    
}
