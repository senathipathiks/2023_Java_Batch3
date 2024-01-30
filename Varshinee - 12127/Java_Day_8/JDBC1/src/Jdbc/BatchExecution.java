package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BatchExecution {

    static String url = "jdbc:mysql://localhost:3306/JDBC_db";
    static String user = "root";
    static String Pass = "Password@12345";
    
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(url, user, Pass);
        
        
        String Query = "insert into Student values (?,?)";
        
        PreparedStatement pst = con.prepareStatement(Query);
        
      Scanner sc = new Scanner (System.in);
      
          for (int i = 0; i < 2; i++) {
              
              System.out.println("Enter the user id :");
              
              int id = sc.nextInt();
              
              System.out.println("Enter the User name :");
               sc.nextLine();
               String name = sc.nextLine();
              
              pst.setInt(1, id);
              pst.setString(2, name);
              pst.addBatch();
        }
          
         int[] a = pst.executeBatch();
         
          System.out.println(Arrays.toString(a)); 
    }
    
}