import java.io.*;
import java.sql.*;

class retrive_file {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DARSHIL", "darshil");
            if (con != null) {
                System.out.println("connection success");
            }
            PreparedStatement ps = con.prepareStatement("select * from filetable");
            ResultSet rs = ps.executeQuery();
            rs.next();// now on 1st row

            Clob c = rs.getClob(2);
            Reader r = c.getCharacterStream();

            FileWriter fw = new FileWriter("g:\\java_prog\\mark1.txt");

            int i;
            while ((i = r.read()) != -1)
                fw.write((char) i);

            fw.close();
            con.close();

            System.out.println("success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}