package jdbcDay_2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		final String URL="jdbc:mysql://localhost:3306/jdbc_db1";
		final String user="root";
		final String pwd="Admin@123";
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection(URL, user, pwd);	//getting connection
			DatabaseMetaData db=c.getMetaData();	
			
			String table[]= {"table"};
			ResultSet rs=db.getTables(null, null, null, table);
			
			while (rs.next()) {
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

}
