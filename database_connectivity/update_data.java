
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

class update_data {
    public static void main(String args[]) {
        try {
            // step1 load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            if (con != null) {
                System.out.println("connection success");
            }
            // step3 create the statement object
            Statement stmt = con.createStatement();

             // String q1 = "UPDATE student SET sname='darshil' WHERE sno=5";
            stmt.executeUpdate("UPDATE student SET sname='princy' WHERE sno=5");

            System.out.println("record updated suceesfully");

            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt("sno") + "  " + rs.getString("sname"));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}