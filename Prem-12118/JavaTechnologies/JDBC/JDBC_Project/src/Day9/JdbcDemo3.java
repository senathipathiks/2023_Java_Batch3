package Day9;

import java.sql.*;
public class JdbcDemo3 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/c_db";
		String userName = "root";
		String password = "Prem@1234";
		
		Connection con= DriverManager.getConnection(url,userName,password);
		DatabaseMetaData dbmd=con.getMetaData();
		
		String table[]= {"VIEW"};
		ResultSet rs=dbmd.getTables(null,null,null, table);
		
	  while (rs.next()) {
		  System.out.println(rs.getString(3));
	  }
		con.close();
		
	}

}
