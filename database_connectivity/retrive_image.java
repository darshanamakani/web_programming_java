import java.sql.*;
import java.io.*;

class retrive_image {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
            if (con != null) {
                System.out.println("connection success");
            } else {
                System.out.println("fail");
            }

            PreparedStatement ps = con.prepareStatement("select * from imagetable");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {// now on 1st row

                Blob b = rs.getBlob(2);// 2 means 2nd column data
                byte barr[] = b.getBytes(1, (int) b.length());// 1 means first image

                FileOutputStream fout = new FileOutputStream("G:\\r1.jpg");
                fout.write(barr);

                fout.close();
            } // end of if
            System.out.println("ok");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}