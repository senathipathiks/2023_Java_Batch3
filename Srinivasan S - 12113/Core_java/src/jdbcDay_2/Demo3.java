package jdbcDay_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) throws SQLException {
		
		final String URL="jdbc:mysql://localhost:3306/jdbc_db1";
		final String user="root";
		final String pwd="Admin@123";
		
		Scanner sc=new Scanner(System.in);
		int id;
		String name,city;
		char ch;
		
		Connection c=DriverManager.getConnection(URL, user, pwd);
		
		String query="insert into demo1 values(?,?,?);";
		
		PreparedStatement prs=c.prepareStatement(query);
		
		do {
			id=sc.nextInt();
			name=sc.next();
			city=sc.next();
			prs.setInt(1,id);
			prs.setString(2, name);
			prs.setString(3, city);
			prs.addBatch();
			System.out.println("Do you wish to continue :(Y/N)");
			ch=sc.next().charAt(0);
		} while (ch=='Y'||ch=='y');
		
		int[]rs=prs.executeBatch();
		System.out.println(Arrays.toString(rs));
		
	}
}
