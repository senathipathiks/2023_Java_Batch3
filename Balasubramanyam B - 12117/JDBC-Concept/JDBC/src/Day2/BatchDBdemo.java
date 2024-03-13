package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDBdemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		final String URL = "jdbc:mysql://localhost:3306/customer_deatails";
		final String User = "root";
		final String pass = "root";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, User, pass);
		Statement stmt = con.createStatement();
		stmt.addBatch("insert into user values(16,'abhi',23456,'chennai',3456543)");
		stmt.executeBatch();
        con.close();
	}

}
