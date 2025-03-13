import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
class update_prepared_stmt
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        PreparedStatement stmt=con.prepareStatement("update student set sname=? where sno=?");
        stmt.setString(1,"harshvi");//1 specifies the first parameter in the query i.e. name
        stmt.setInt(2,1);
        
        int i=stmt.executeUpdate();
        System.out.println(i+" records updated");
       
        con.close();
     }
     catch(Exception e){ System.out.println(e);}

    }       
}