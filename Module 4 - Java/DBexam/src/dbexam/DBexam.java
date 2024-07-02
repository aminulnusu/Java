package dbexam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DButil;

public class DBexam {

    static DButil db = new DButil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
//        saveData("Moshaidul", "moshaidul@gmail.com", "Dhanmondi");
//        System.out.println("After Insert Data \n");
//        showData();
//
//        editData(2, "Abid", "abid@gmail.com", "bogra");
//        System.out.println("\n After Edit Data \n");
//        showData();
//
//        deleteData(12);
//        System.out.println("\n After Delete Data \n");
//        showData();
    }

    public static void saveData(String name, String email, String address) {
        sql = "insert into student (name, email, address) values(?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBexam.class.getName()).log(Level.SEVERE, null, ex);
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
                String address = rs.getString("address");

                System.out.println("Id No: " + id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBexam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(int id, String name, String email, String address) {
        sql = "update student set  name=?, email=?, address=? where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBexam.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DBexam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
