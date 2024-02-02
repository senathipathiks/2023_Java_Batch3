package Day9Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBatch {

	public static void main(String[] args) throws SQLException {
		  final String URl = "jdbc:mysql://localhost:3306/student1";
	        final String User = "root";
	        final String pass = "root";
	        
//	        Class.forName("com.mysql.jdbc.Driver");
	        
	        Connection con=DriverManager.getConnection(URl,User,pass);
	        Statement stmt = con.createStatement();
	        stmt.addBatch("insert into student values(6,'lee',56)");
	        stmt.addBatch("insert into student values(7,'akash',67)");
	        stmt.executeBatch();
	        con.close();
	}

}
