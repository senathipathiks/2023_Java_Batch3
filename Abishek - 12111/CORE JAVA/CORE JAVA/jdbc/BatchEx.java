package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class BatchEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final String URl = "jdbc:mysql://localhost:3306/abishek";
		final String User = "root";
		final String pass = "Password@12345";
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(URl,User,pass);
		Statement stmt = con.createStatement();
		
		stmt.addBatch("insert into tbl_3 values(6,'lee','M')");
		stmt.addBatch("insert into tbl_3 values(7,'akash','M')");
		
		stmt.executeBatch();
		
		System.out.println("Inserted");
		con.close();
		
	}

}
