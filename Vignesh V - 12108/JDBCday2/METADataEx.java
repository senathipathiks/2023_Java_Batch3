package JDBCday2;

import java.sql.*;

public class METADataEx {
	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/sms";
		final String users = "root";
		final String pass = "Password@12345";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, users, pass);
			DatabaseMetaData dbms = con.getMetaData();

			String table[] = { "TABLE" };

			ResultSet rs = dbms.getTables("sms", null, null, table);
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
