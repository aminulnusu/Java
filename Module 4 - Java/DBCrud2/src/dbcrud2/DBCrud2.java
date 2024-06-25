package dbcrud2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import util.DBUtil;

public class DBCrud2 {

    static DBUtil db = new DBUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        
//        saveData("Aminul", "aminul@gmail.com", "Dhanmondi", "123456789");
//        System.out.println("After Insert Data \n");
//        showData();

//        deleteData(1);
//        System.out.println("\n After Delete Data \n");
//        showData();
        
        editData("Aminul Nusu", "aminulnusu@gmail.com", "Dhanmondi", "987654321", 4);
        System.out.println("\n After Edit Data \n");
        showData();
        
        

    }

    public static void saveData(String name, String email, String address, String cell) {
        sql = "insert into student (name, email, address, cell) values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select * from student";

        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("name");
                String address = rs.getString("address");
                String cell = rs.getString("cell");
                String id = rs.getString("id");

                System.out.println("ID No: " + id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tCell: " + cell);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(String name, String email, String address, String cell, int id) {
        sql = "update student set name=?, email=?, address=?, cell=? where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);
            ps.setInt(5, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
