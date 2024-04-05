package com.springdatajpa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRepos {
	
	private static final String url = "jdbc:mysql://localhost:3306/project";
	private static final String user = "root";
	private static final String password = "root";

	public void connectUsingJDBC() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement("insert into tbl_tab values(?,?)");
			ps.setString(1, "Aha");
			ps.setString(2, "Oho");
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		} finally {
			ps.close();
			con.close();
		}
	}

}
