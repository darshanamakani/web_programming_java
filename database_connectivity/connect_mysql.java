import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class connect_mysql {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            if (con != null) {
                System.out.println("connection success");
            } else {
                System.out.println("fail");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}