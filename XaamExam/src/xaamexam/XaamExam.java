package xaamexam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XaamExam {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    static DdUtil db = new DdUtil();

    public static void main(String[] args) {
//        showSave("yhrhfy", "gbfrtbyh", "58");

        showData();
        editData("nusu", "nusu@gmail.com", "0171794767000", 1);
        showData();
        
        deleteData(2);
        showData();
        
    }

    public static void showSave(String name, String email, String cell) {
        sql = "insert into student(name,email,cell)  values(?,?,?)";
        try {

            ps = db.getConnection().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, cell);

            ps.executeUpdate();

            ps.close();
            db.getConnection().close();

            ps = db.getConnection().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(XaamExam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        sql = "select * from student";
        try {
            ps = db.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String id = rs.getString("id");
                System.out.println("ID No: " + id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + "\tCell: " + cell);
            }

            ps.close();
            rs.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(XaamExam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteData(int id) {
        sql = "delete from student where id=?";
        try {
            ps = db.getConnection().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(XaamExam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editData(String name, String email, String cell, int id) {
        sql = "update student set name=?, email=?,cell=? where id=?";

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
            Logger.getLogger(XaamExam.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
