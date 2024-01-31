package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDemo4 {

	public static void main(String[] args) throws Exception {
		final String URL = "jdbc:mysql://localhost:3306/JDBC_db";
		final String User = "root";
		final String pass = "Password@12345";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, User, pass);
		Statement stmt = con.createStatement();

		stmt.addBatch("insert into Students values(7,'Vino')");
		stmt.addBatch("insert into Students values(8,'vimal')");
		stmt.executeBatch();
		con.close();

	}
}
