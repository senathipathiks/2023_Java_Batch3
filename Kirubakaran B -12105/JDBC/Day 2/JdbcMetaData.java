package day2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
			DatabaseMetaData dbmd=c.getMetaData();
			
			String table[]= {"TABLE"};
			ResultSet rs=dbmd.getTables(null, null, null, table);
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			c.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
