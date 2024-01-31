package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class BPUsingPrepareStatement {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		final String URL="jdbc:mysql://localhost:3306/JDBC_db";
		final String User="root";
		final String pass="Password@12345";
		Scanner sc=new Scanner(System.in);
		int studid;
		String studname;
//		String city;
		char ch;
//		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(URL,User,pass);
		
		PreparedStatement ps=con.prepareStatement("insert into Student values(?,?)");
		do {
			System.out.println("Enter the value");
			studid=sc.nextInt();
			studname=sc.next();
//			city=sc.next();
			ps.setInt(1,studid);
			ps.setString(2,studname);
//			ps.setString(3,city);
			ps.addBatch();
			System.out.println("Do you wish to to continue:(Y/N)");
		ch=sc.next().charAt(0);
		}
		while(ch=='Y'||ch=='y');
		
		int[] rs=ps.executeBatch();
		
		System.out.println(Arrays.toString(rs));
	}

}
