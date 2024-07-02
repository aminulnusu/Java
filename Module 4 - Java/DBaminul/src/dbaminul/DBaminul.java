package dbaminul;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DButil;

public class DBaminul {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";
    static DButil db = new DButil();

    public static void main(String[] args) {
//        saveData("nusu", "snusu@gmail.comql", "01717947670");
//        showData();
        
//        editData(1, "aminul", "aminul@gmail.com", "01713252630");
//        showData();
        
        deleteData(2);
        showData();
    }

    public static void saveData(String name, String email, String cell) {
        sql = "insert into employee (name, email, cell) values(?,?,?)";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);

            ps.executeUpdate();
            ps.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBaminul.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select * from employee";
        try {
               ps = db.getConnection().prepareStatement(sql);
               rs = ps.executeQuery();
                while (rs.next()) {

                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");

                System.out.println("Id no:" +id + "\tName:" + name + "\tEmail:" +email + "\tCell:" +cell);

                ps.close();
                rs.close();
                db.getConnection().close();

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBaminul.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        sql = "delete from employee where id=?";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            db.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DBaminul.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void editData(int id, String name, String email, String cell) {
        sql = "update employee where id=? set name=?, email=?, cell=? ";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, cell);
        } catch (SQLException ex) {
            Logger.getLogger(DBaminul.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
