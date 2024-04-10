package com.springboot.springdatajpa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/************************************************* 

* Author: Sundhar Raj S

* Assignment: Code Quality

* Class: EmployeeRepos

************************************************/ 

public class EmployeeRepos {
	Connection con;
	PreparedStatement ps;
	static final String USERNAME = "root";
	static final String PASSWORD = System.getenv("root");
	static final String URL = "jdbc:mysql://localhost:3306/project?enabledTLSProtocols=TLSv1.2";

	//To make a connection to the database and inserting a static value
	public void connectUsingJDBC() {

		try {
			con = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);
			ps = con.prepareStatement("insert into Tab values(?,?)");
			ps.setString(1, "Aha");
			ps.setString(2, "Oho");
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
