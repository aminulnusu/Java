package dbcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBUtil;

public class DBCrud {

    static DBUtil db = new DBUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {

//        insertStd("Aminul", "123456789");
//        System.out.println("After Insert Data \n");
//        showStd();
        deleteStd(1);
        System.out.println("\n After Delete Data \n");
        showStd();
        editStd("Aminul Haque", "9875650654", 3);
        System.out.println("\n After Edit Data \n");
        showStd();
        
        
    }

    public static void insertStd(String name, String cell) {
        sql = "insert into student (name, cell) values(?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, cell);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static void showStd() {
        sql = "select * from student";

        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String id = rs.getString("id");

                System.out.println("ID No: " + id + "\tName: " + name + "\tCell: " + cell);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static void deleteStd(int id) {
        sql = "delete from student where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static void editStd(String name, String cell, int id) {
        sql = "update student set name=?, cell=? where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setInt(3, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

}
