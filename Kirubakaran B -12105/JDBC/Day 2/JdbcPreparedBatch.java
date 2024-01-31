package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class JdbcPreparedBatch {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
	        int id;
	        String name;
	        char ch;
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
			PreparedStatement prs=c.prepareStatement("insert into emp values(?,?)");
			 do {
		            id=sc.nextInt();
		            name=sc.next();
		           
		            prs.setInt(1,id);
		            prs.setString(2, name);
		           
		            prs.addBatch();
		            System.out.println("Do you wish to continue :(Y/N)");
		            ch=sc.next().charAt(0);
		        } while (ch=='Y'||ch=='y');
		        
		        int[]rs=prs.executeBatch();
		        System.out.println(Arrays.toString(rs));
		        
		    }
			
		
	}


