package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db", "root", "Password@12345");
		Statement s = c.createStatement();
		boolean a = s.execute("Insert into Students values(1,'Ranitha')");
		System.out.println(a);
		if (a == false) {
			System.out.println("1 row updated");
		}
		ResultSet rs = s.executeQuery("Select*from Students");
		while (rs.next()) {
			System.out.println("no:" + rs.getInt(1) + "\nname:" + rs.getString(2));
		}
	}

}
