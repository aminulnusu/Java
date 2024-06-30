package dbcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBcrud {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";
    static DbUtil db = new DbUtil();

    public static void main(String[] args) {
        saveData("nusu", "nusu@ybf.com", "0171781365");
        System.out.println("after insert");
        showData();
        editData("Aminul", "aminul@gmail.com", "123456789", 2);
        System.out.println("After edit");
        showData();

        deleteData(1);
        System.out.println("\"\\n After Edit Data \\n\"");
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
            Logger.getLogger(DBcrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select * from employee";
        try {
            ps = db.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("name");

                String cell = rs.getString("cell");
                String id = rs.getString("id");

                System.out.println("id: " + id + "\tName: " + name + "\tEmail: " + email + "\tCell: " + cell);
            }

            ps.close();
            rs.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBcrud.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DBcrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(String name, String email, String cell, int id) {
        sql = "update employee set name=?, email=?, cell=? where id=?";
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
            Logger.getLogger(DBcrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
