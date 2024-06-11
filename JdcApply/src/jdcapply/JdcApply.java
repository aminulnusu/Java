
package jdcapply;

import java.lang.System.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdcApply {
   static PreparedStatement ps;
   static ResultSet rs;
   static DdUtil du=new DdUtil();
    public static void main(String[] args) {
       
    }
    
    public static void saveData(){
     
      String sql = "Insert into student(name,email,address,cell)valuse(?,?,?,?)";
        try {
            ps = du.getConnection().prepareStatement(sql);
            ps.setString(1, "aminul");
            ps.setString(2, "nusunusu111@gmail.com");
            ps.setString(3, "sherpur bogura");
            ps.setString(4, "01717947670");
            ps.executeUpdate();
            ps.close();
            du.getConnection().close();
        } catch (SQLException e) {
        }
     
     
    
    }
    
    
    
    
    
    
}
