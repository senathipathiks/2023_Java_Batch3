package com.Day1JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcIntro {
	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_deatails", "root","root");
		Statement s = c.createStatement();
		boolean a=s.execute("insert into user values(5,'Balu',12345,'Pune',543456)");
//		System.out.println(a);
		if(a==false) {
			System.out.println("1 row updated");
		}
		ResultSet rs = s.executeQuery("select * from user");
		while(rs.next()) {
			System.out.println("ID: "+rs.getInt(1)+"\n NAMES: "+rs.getString(2)+"\n PHONENO: "+rs.getInt(3)+"\n Address: "+rs.getString(4)+"\n Salary: "+rs.getInt(5));
//			System.out.println();
		}
	}
	
}

