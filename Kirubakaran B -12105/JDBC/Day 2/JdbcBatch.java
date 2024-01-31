package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
		
		Statement st=c.createStatement();
		
		st.addBatch("insert into emp values(99,'srini')");
		st.addBatch("insert into emp values(199,'kavi')");
		
		st.executeBatch();
		c.close();
		
	}

}
