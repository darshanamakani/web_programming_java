import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class database_metadata {
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
           if (con != null) {
                System.out.println("connection success");
            }

            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}