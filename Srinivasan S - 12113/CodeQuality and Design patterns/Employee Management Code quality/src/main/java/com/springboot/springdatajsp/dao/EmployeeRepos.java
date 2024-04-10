package com.springboot.springdatajsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRepos {

	Connection con;
	PreparedStatement ps;
	String password=System.getenv("1234");

	public void connectusingjdbc() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?enabledTLSProtocols=TLSv1.2", "root",
					password);
			ps = con.prepareStatement("insert into Tab values(?,?)");
			ps.setString(1, "Aha");
			ps.setString(2, "Oho");
			ps.executeUpdate();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			con.close();
			ps.close();
		}

	}
}
