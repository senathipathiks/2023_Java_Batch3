package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcf {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
		Statement s=c.createStatement();
		
		boolean a = s.execute("insert into user values (2,'Tamizh')");
		
		System.out.println(a);
		
		if (a==false) {
			System.out.println("1 row affected");
			
		}
		
//		ResultSet rs= s.executeQuery("select * from employee");
//		
//		while (rs.next()) {
//			System.out.println("id : "+rs.getInt(1)+"\nName : "+rs.getString(2));
//			
//		}

	}

}
