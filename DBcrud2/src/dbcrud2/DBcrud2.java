package dbcrud2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBcrud2 {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();
    static String sql = "";

    public static void main(String[] args) {
//        saveDate("nusu", "nusu@gmail.com", "01717947670");
       showData();
       
        editData("aminul", "aminul@gmail.com", "017179", 1);
        showData();
        deleteData(2);
        showData();
    }

    public static void saveDate(String name, String email, String cell) {
        sql = "insert into employee2 (name, email, cell) values(?,?,?)";
        try {
            ps = db.getConnection().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);

            ps.executeUpdate();
            ps.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBcrud2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showData() {
        sql = "select * from employee2";
        try {
            ps = db.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");

                String cell = rs.getString("cell");
                String id = rs.getString("id");

                System.out.println("id"+id+" \tname "+name+"\temail "+email+" \tcell "+cell);

            }
            ps.close();
            rs.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBcrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        sql = "delete from employee2 where id=?";
        try {
            ps = db.getConnection().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            db.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBcrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(String name, String email, String cell, int id) {
        sql = "update employee2 set name=?, email=?, cell=? where id=?";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            db.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBcrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
