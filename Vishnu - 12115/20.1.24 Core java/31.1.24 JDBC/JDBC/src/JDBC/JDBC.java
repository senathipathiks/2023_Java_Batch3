package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Password@12345");
		
		Statement s=c.createStatement();
		
		boolean a = s.execute("Insert into employee values (13,'Vicky')");
		
		System.out.println(a);
		
		if(a==false) {
			System.out.println("1 row updated");
		}
		
		ResultSet rs=s.executeQuery("Select *from employee");
		
		while(rs.next()) {
			System.out.println("id : " +rs.getInt(1)+"\n name : "+rs.getString(2));
		}
		
	}

}
