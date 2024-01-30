package Com.Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class BatchExecuteEg {
	static String url = "jdbc:mysql://localhost:3306/stu_db";
	static String user = "root";
	static String Pass = "Password@12345";

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection(url,user,Pass);
		
		String Query = "insert into user2 values (?,?)";
		
		PreparedStatement p = con.prepareStatement(Query);
	    
	    Scanner sc = new Scanner (System.in);
	    
	        for (int i = 0; i < 2; i++) {
	            
	            System.out.println("Enter the order id :");
	            
	            int id = sc.nextInt();
	            
	            System.out.println("Enter the order Type :");
	           
	            String type = sc.next();
	            sc.nextLine();
	            p.setInt(1, id);
	            p.setString(2,type);
	            p.addBatch();
	      }
	     int a[]  = p.executeBatch();//execute the batch after getting input from user
	       
	        System.out.println(Arrays.toString(a)); 
	}

	}



