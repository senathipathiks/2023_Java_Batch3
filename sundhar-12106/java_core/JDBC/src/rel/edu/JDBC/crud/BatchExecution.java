package rel.edu.JDBC.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchExecution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
			PreparedStatement ps = c.prepareStatement("insert into student values(?,?,?,?)");
			
			
			
			System.out.println("enter number data do you want to insert");
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				System.out.println("enter ID of the student : ");
				ps.setInt(1, sc.nextInt());
				sc.nextLine();
				System.out.println("enter the name of the student");
				ps.setString(2, sc.nextLine());
				System.out.println("enter the age of the student");
				ps.setInt(3, sc.nextInt());
				System.out.println("enter the class of the student");
				ps.setInt(4, sc.nextInt());
				
				ps.addBatch();
			}
			
			ps.executeBatch();
			System.out.println("data's inserted successfully...! ");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
