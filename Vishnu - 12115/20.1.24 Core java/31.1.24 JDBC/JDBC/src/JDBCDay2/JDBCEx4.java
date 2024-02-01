package JDBCDay2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class JDBCEx4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		final String URL="jdbc:mysql://localhost:3306/jdbc";
		final String User="root";
		final String pass="Password@12345";
		
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		String City;
		char ch;
		
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL,User,pass);
			
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			do {
				id=sc.nextInt();
				name=sc.next();
				City=sc.next();
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, City);
				ps.addBatch();
				
				System.out.println("Do you wish to continue : (Y/N)");
				ch=sc.next().charAt(0);
			}
			while(ch=='Y'||ch=='y');
			int[] rs=ps.executeBatch();
			System.out.print(Arrays.toString(rs));
		
	}

}
