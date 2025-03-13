package com.javatpoint.dao;  
import com.javatpoint.beans.*; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            //DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
            Class.forName("com.mysql.jdbc.Driver");  
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");    

            //    System.out.println("connection success");
            }
         catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static List<Emp> getRecords(int start, int total) {
        List<Emp> list = new ArrayList<Emp>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "select * from emp_jsp limit " + (start - 1) + "," + total);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Emp e = new Emp();
                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getInt(3));
                list.add(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
