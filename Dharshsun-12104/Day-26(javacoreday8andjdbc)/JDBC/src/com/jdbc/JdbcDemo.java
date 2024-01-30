package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws SQLException {

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dharshsun_db", "root",
				"Password@12345");

		Statement s = c.createStatement();

		boolean a = s
				.execute("insert into tbl_students values(123,'jothi','jothi@gmail.com',23591988,'Chennai',234789)");
		System.out.println(a);
		
		

		if (a == false) {
			System.out.println("1 row updated");
		}
		ResultSet rs = s.executeQuery("select * from tbl_students");
		
		System.out.println(rs);
		// boolean is true here so only in previous if it is set as false
		while (rs.next()) {
			System.out.println("id " + rs.getInt(1) + "name " + rs.getString(2) + "Email " + rs.getString(3) + "phone "
					+ rs.getInt(4) + "city " + rs.getString(5) + "pincode " + rs.getInt(6));
			System.out.println();
		}

	}

}
