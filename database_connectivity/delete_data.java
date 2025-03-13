
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

class delete_data {
    public static void main(String args[]) {
        try {
           // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE", "darshil", "darshil");
            if (con != null) {
                System.out.println("connection success");
            }
            // step3 create the statement object
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM student WHERE sno=1";
            stmt.executeUpdate(sql);
            System.out.println("record deleted");
            
            ResultSet rs = stmt.executeQuery("select *from student");
            while (rs.next()) {
                System.out.println(rs.getInt("sno") + "  " + rs.getString("sname")+" "+rs.getInt("sal"));

            } 
         rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}