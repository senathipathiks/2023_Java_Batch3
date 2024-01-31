package JDBCday2;

import java.sql.*;

public class BatchExample {

	public static void main(String[] args)throws Exception {
		final String URL = "jdbc:mysql://localhost:3306/sms";
		final String users = "root";
		final String pass = "Password@12345";

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, users, pass);

		Statement stmt = con.createStatement();

		stmt.addBatch("insert into Students values(3,'vicky','karur',8)");
		stmt.addBatch("insert into Students values(4,'Sanjai','chennai',89)");
		stmt.executeBatch();

		con.close();

	}

}
