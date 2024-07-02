package dbbabuu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DButil;

public class DBbabuu {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";
    static DButil db = new DButil();

    public static void main(String[] args) {
//        System.out.println("Insert Data : ");
//
//        saveData("nusu", "nusu11@gmail.com", "017179470", "Mohammadpur,Dhaka");
//        showData();

//        System.out.println("After Delete Data");
//        deleteData(1);
//        showData();
        System.out.println("After Edit Data");
        editData(22, "aminul", "aminul12@gmail.com", "017173252630", "Bogura");
        showData();

    }

    public static void saveData(String name, String email, String cell, String address) {
        sql = "insert into student (name, email,cell, address) values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            ps.setString(4, address);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBbabuu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select * from student";

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");

                System.out.println("ID No: " + id + "\tName: " + name + "\tEmail: " + email + "\tCell: " + cell + "\tAddess: " + address);
            }
            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBbabuu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        sql = "delete from student where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBbabuu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(int id, String name, String email, String cell, String address) {
        sql = "update student set  name=?, email=?, cell=?, address=? where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);
            ps.setString(4, address);
            ps.setInt(5, id);

            ps.executeLargeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBbabuu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
