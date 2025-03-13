import java.sql.*;
import java.io.*;

public class insert_image {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            if (con != null) {
                System.out.println("connection success");
            } else {
                System.out.println("fail");
            }
    PreparedStatement ps = con.prepareStatement("insert into imagetable values(?,?)");
    ps.setString(1, "flower");

    FileInputStream fin = new FileInputStream("G:\\i1.jpg");
    ps.setBinaryStream(2, fin, fin.available());
    int i = ps.executeUpdate();
    System.out.println(i + " records affected");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}