package Com.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class BatchUsingPreparedStatement {

	public static void main(String[] args) throws SQLException {
		
		final String url="jdbc:mysql://localhost:3306/stu_db";
		final String User="root";
		final String pass="Password@12345";

		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		char ch;
		
		Connection con=DriverManager.getConnection(url,User,pass);
		PreparedStatement p = con.prepareStatement("Insert into user_tbl values(?,?)");
		
		do {
			System.out.println("Enter Id:");
			id=sc.nextInt();
			System.out.println("Enter UserName:");
			name=sc.next();
			
			p.setInt(1, id);
			p.setString(2, name);
			
			p.addBatch();
			
			System.out.println("Do you want to Continue:(y/N)");
			ch=sc.next().charAt(0);			
		}
		while(ch=='Y'||ch=='y');
		
		int[]rs=p.executeBatch();
		
		System.out.println(Arrays.toString(rs)); //FALSE Condition

		}

}
