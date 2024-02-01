package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Password@12345");
				
				String q="insert into employee values(?,?);";
				String Q3="delect from employee where sid=?";
				String Q4="UPDATE employee SET sname=? WHERE (sid=?)";
				
				PreparedStatement p=c.prepareStatement(q);
				
				Scanner sc=new Scanner(System.in);
				
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
		
				
				
	}

}
