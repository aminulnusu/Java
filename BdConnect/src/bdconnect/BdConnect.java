package bdconnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BdConnect {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();

    public static void main(String[] args) {
    Student student=new Student();
    List<Student>studentlist=getbyId(1);
        student.setName(studentlist.get(0).getName());
        student.setEmail("uyhj765tg4");
        student.setAddress(studentlist.get(0).getAddress());
        student.setCell(studentlist.get(0).getCell());
        student.setId(studentlist.get(0).getId());
        
        ediData(student);
        showData();
    }

    public static void saveData() {
        String sql = "Insert into student(name,email,address,cell)valuse(?,?,?,?)";
        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, "aminul");
            ps.setString(2, "nusunusu111@gmail.com");
            ps.setString(3, "sherpur bogura");
            ps.setString(4, "01717947670");
            ps.executeUpdate();
            ps.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(BdConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showData() {
        String sql = "select * from student";

        try {
            ps = db.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");
                System.out.println("Id is \"+id+\" name: \"+name +\" Email: \"+email\n"
                        + "                +\" Address: \"+address+ \" Cell No :\"+cell");

            }
            ps.close();
            rs.close();
            db.getConnection().close();

        } catch (SQLException ex) {
            Logger.getLogger(BdConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void ediData(Student s) {
        String sql = "update student set name=?,email=?,address=?,cell=? where id=?";

        try {
            ps = db.getConnection().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getCell());
            ps.setInt(5, s.getId());

            ps.executeUpdate();
            ps.close();
            db.getConnection().close();

            System.out.println("Edit successfully");

        } catch (SQLException ex) {
            Logger.getLogger(BdConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Student> getbyId(int id) {

        List<Student> list = new ArrayList<>();

        String sql = "select * from student where id=?";
        try {
            ps = db.getConnection().prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Student s=new Student(rs.getInt("id"),rs.getString("name"),
                        rs.getString("email"), rs.getString("address"), rs.getString("cell"));
                
    list.add(s);
            }
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(BdConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
