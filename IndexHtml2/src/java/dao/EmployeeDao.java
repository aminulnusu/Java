package dao;

import enutil.Employee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Dbutil;

public class EmployeeDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static int saveData(Employee e) {
        int status = 0;
        sql = "insert into employee(name,email,cell)values(?,?,?)";
        try {
            ps = Dbutil.getcon().prepareStatement(sql);
            ps.executeUpdate();

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getCell());

            status = ps.executeUpdate();
            System.out.println(status);

            ps.close();
            Dbutil.getcon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}
