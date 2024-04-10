package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;


public class DbDemo2 {
public static void main(String[] args) {
    final String URL="jdbc:mysql://localhost:3306/employee";
    final String User="root";
    final String pass="root";
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(URL,User,pass);
        DatabaseMetaData dbmd=con.getMetaData();
        
        
        String table[]= {"Table"};
        
        ResultSet rs=dbmd.getTables(null, null, null,table);
        
        while(rs.next()) {
            System.out.println(rs.getString(3));
        }
        con.close();
        
    }
    catch(Exception e){
        System.out.println(e);}
    
    }
}
