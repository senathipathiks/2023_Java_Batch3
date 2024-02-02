package com.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class BatchExecution {
	  
	public static void main(String[] args) throws SQLException {
		Connection n = DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy_db","root","root");
		
        String a = "insert into quantity values (?,?);";
        
        PreparedStatement pst = n.prepareStatement(a);
        
      Scanner sc = new Scanner (System.in);
      
          for (int i = 0; i < 1; i++) {
              
              System.out.println("Enter the book id :");         
              int id = sc.nextInt();
              
              System.out.println("Enter the no.of book in this ID :");
               sc.nextLine();
               int q = sc.nextInt();
               

              
              pst.setInt(1, id);
              pst.setInt(2, q);
              pst.addBatch();
        }
          
         int[] v = pst.executeBatch();
         
//          System.out.println(Arrays.toString(v)); 
    }
    

		  
	

}


