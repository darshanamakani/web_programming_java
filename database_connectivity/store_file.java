/*CREATE TABLE  "FILETABLE"   
   (    "ID" NUMBER,   
    "NAME" CLOB  
   )   */


import java.io.*;
import java.sql.*;

public class store_file {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DARSHIL", "darshil");
            if (con != null) {
                System.out.println("connection success");
            }

            PreparedStatement ps = con.prepareStatement("insert into FILETABLE values(?,?)");

            File f = new File("g:\\java_prog\\myfile1.txt");
            FileReader fr = new FileReader(f);

            ps.setInt(1, 101);
            ps.setCharacterStream(2, fr, (int) f.length());
            int i = ps.executeUpdate();
            System.out.println(i + " records affected");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}