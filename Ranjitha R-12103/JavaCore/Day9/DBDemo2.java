package Day9;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBDemo2 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/JDBC_db";
		final String User = "root";
		final String pass = "Password@12345";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, User, pass);
			DatabaseMetaData dbmd = con.getMetaData();

			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null,null,null, table);

			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
