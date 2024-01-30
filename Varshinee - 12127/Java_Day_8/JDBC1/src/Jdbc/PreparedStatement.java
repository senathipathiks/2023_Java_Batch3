package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement {

	public static void main(String[] args) throws SQLException{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db","root","Password@12345");
		
		String q="insert into Student values(?,?);";
		String Q3="delete from student where studid=?";
		String Q4="UPDATE student SET studname=? WHERE (studid=?)";
		java.sql.PreparedStatement p=c.prepareStatement(Q4);
		
		Scanner sc=new Scanner(System.in);
		
		//Add details
//		System.out.println("Enter the id");
//		int id=sc.nextInt();
//		System.out.println("Enter the name");
//		String name=sc.next();
//		
//		p.setInt(1,id);
//		p.setString(2, name);
//		
//		int a=p.executeUpdate();
//		if(a==1) {
//			System.out.println("1 row affected");
//		}
//		
//		//view table
//		 String Q2 ="select*from student";
//	        ResultSet rs= p.executeQuery(Q2);
//	        
//	        while (rs.next()) {
//	            System.out.println("id   :"+rs.getInt(1)+ "\nname :"+rs.getString(2));
//	                    
//	        }
	        
	        //delete records
//	        System.out.println("Enter the id you want to delete");
//	        int id01=sc.nextInt();
//	        p.setInt(1, id01);
//	        int a01= p.executeUpdate();
//	        if(a01==1) {
//	            System.out.println("1 row deleted");
//	            }
//		
		//update table
System.out.println("Enter the name you want to update:");
        
        String s =sc.nextLine();
        p.setString(1, s);
        
        System.out.println("Enter exisiting id");
        
        int idd=sc.nextInt();
        
        p.setInt(2, idd);
        
        int a=p.executeUpdate();
        
        if (a==1) {
            System.out.println("1 row updated");
        }

	}

}
