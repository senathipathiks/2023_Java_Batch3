package com.day11jdbc.tsms.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TicketUtility {

	public static Connection getConnection() {

		Connection c = null;
		final String URL = "jdbc:mysql://localhost:3306/ticketms";
		final String User = "root";
		final String Pass = "root";
		try {
			c = DriverManager.getConnection(URL, User, Pass);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return c;

	}

}
