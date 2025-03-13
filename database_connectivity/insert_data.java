import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

class insert_data {
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

            String q1 = "insert into student(sno,sname)values(5,'darshana')";
            stmt.executeUpdate(q1);

            System.out.println("record inserted suceesfully");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}