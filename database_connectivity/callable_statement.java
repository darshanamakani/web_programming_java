/*
 * create table.....
 * create table user_callable(id number(10), name varchar2(200));
 * 
 * create procedure...
 * create or replace procedure "insertR"
 * (id IN NUMBER, name IN VARCHAR2)
 * is
 * begin
 * insert into user_callable values(id,name);
 * end;
 */

import java.sql.*;

public class callable_statement {
    public static void main(String[] args) throws Exception {
        // step1 load the driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // step2 create the connection object
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DARSHIL", "darshil");
        if (con != null) {
            System.out.println("connection success");
        }

        CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
        stmt.setInt(1,101);
        stmt.setString(2,"Amit");
        stmt.executeUpdate();

        System.out.println("success");
    }
}