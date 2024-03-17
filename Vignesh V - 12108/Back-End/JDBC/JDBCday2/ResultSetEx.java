package JDBCday2;

import java.sql.*;

public class ResultSetEx {
	public static void main(String[] args) {
		final String URL = "jdbc:mysql://localhost:3306/sms";
		final String users = "root";
		final String pass = "Password@12345";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, users, pass);
			PreparedStatement st = con.prepareStatement("Select * from course");

			ResultSet rs = st.executeQuery();
			
			ResultSetMetaData rsm = rs.getMetaData();
					
			System.out.println("No. of Columns:" + rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1) + " " + rsm.getColumnName(2));

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
