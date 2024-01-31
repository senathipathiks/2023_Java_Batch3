package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DBDemo3 {

	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/JDBC_db";
		final String User = "root";
		final String pass = "Password@12345";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, User, pass);

			PreparedStatement st = con.prepareStatement("Select*from Students");
			;
			ResultSet rs = st.executeQuery();
			ResultSetMetaData rms = st.getMetaData();
			System.out.println("No of Columns:" + rms.getColumnCount());
			System.out.println(rms.getColumnName(1) + " " + rms.getColumnName(2));
			;

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
