import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

class p_stmt {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
          

            PreparedStatement stmt = con.prepareStatement("insert into student values(?,?)");
            stmt.setInt(1, 9);// 1 specifies the first parameter in the query
            stmt.setString(2, "yash");

            int i = stmt.executeUpdate();
            System.out.println(i + " records inserted");

            ResultSet rs = stmt.executeQuery("select *from student");
            while (rs.next()) {
                System.out.println(rs.getInt("sno") + "  " + rs.getString("sname"));

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}