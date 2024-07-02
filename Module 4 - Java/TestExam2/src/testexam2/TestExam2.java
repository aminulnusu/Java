package testexam2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DButil;

public class TestExam2 {

    static PreparedStatement ps;
    static ResultSet rs;
    static DButil db = new DButil();
    static String sql = "";

    public static void main(String[] args) {
        saveData("Aminul", "aminul@gmail.com", "Dhanmondi", "123456789");
        System.out.println("After Insert Data \n");
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
            Logger.getLogger(TestExam2.class.getName()).log(Level.SEVERE, null, ex);
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
                String cell = rs.getString("cell");

                System.out.println("ID No: " + id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tCell: " + cell);

                ps.close();
                rs.close();
                db.getCon().close();

            }

        } catch (SQLException ex) {
            Logger.getLogger(TestExam2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
