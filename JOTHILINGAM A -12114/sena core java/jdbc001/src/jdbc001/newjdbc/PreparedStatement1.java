package jdbc001.newjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement1 {

	public static void main(String[] args) throws SQLException {
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","root");
		
		
		String q="insert into student values(?,?);";
		
		String Q3 = "delete from student where sid =?";
		
		String Q4 = "UPDATE student SET sname = ? WHERE (sid = ?)";        // id deleted
		

		
		PreparedStatement p = c.prepareStatement(q);
				
		Scanner sc=new Scanner(System.in);
		// add details
		System.out.println("Enter the id");
		
		int id=sc.nextInt();
		
		System.out.println("Enter the name");
		
		String name=sc.next();
		
		p.setInt(1, id);
		p.setString(2, name);
		
		int a=p.executeUpdate();
		if(a==1) {
			System.out.println("1 Row Affected");
		}
	
		
		
		// view tables
		
		String Q2 ="select*from student";
		ResultSet rs= p.executeQuery(Q2);
		
		while (rs.next()) {
			System.out.println("id   :"+rs.getInt(1)+ "\nname :"+rs.getString(2));
					
		}
		
//		
//		delete records
//		
//		System.out.println("Enter the id you want to delete");
//		int id=sc.nextInt();
//		p.setInt(1, id);
//		int a= p.executeUpdate();
//		if(a==1) {
//			System.out.println("1 row deleted");
//			}
//		
		
		
		
		// update table
//		
//		System.out.println("Enter the name you want to update:");
//		
//		String s =sc.nextLine();
//		p.setString(1, s);
//		
//		System.out.println("Enter exisiting id");
//		
//		int idd=sc.nextInt();
//		
//		p.setInt(2, idd);
//		
//		int a=p.executeUpdate();
//		
//		if (a==1) {
//			System.out.println("1 row updated");
//		}
//		
		
				
		
		
		
		
		
		
		
	}

}
