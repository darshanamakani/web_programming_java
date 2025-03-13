
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

class connection1 {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "DARSHIL", "darshil");
            if (con != null) {
                System.out.println("connection success");
            }

        
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}