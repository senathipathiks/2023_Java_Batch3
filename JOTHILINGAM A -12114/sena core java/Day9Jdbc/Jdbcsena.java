package Day9Jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Jdbcsena {
		final static String url="jdbc:mysql://localhost:3306/student1";
		final static String uname="root";
		final static String pass="root";
		
	public static void main(String[] args)  {
		
		
		
		try {
			Connection c= DriverManager.getConnection(url,uname,pass);
			DatabaseMetaData dbdm= c.getMetaData();
			
			String table[] = {"TABLE"};
			
			ResultSet rs=dbdm.getTables(null, null, null, table);
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
		

	}

}
