package DayTwo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

//import com.mysql.cj.jdbc.DatabaseMetaData;

//import com.mysql.cj.jdbc.DatabaseMetaData;

public class JdbcEx1 {

	public static void main(String[] args) {

		final String URL = "jdbc:mysql://localhost:3306/employee";
		final String User="root";
		final String Pass = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,User,Pass);
			DatabaseMetaData db = con.getMetaData();
			
			
			String table[]= {"Table"};
			
			ResultSet rs = db.getTables(null, null, null, table);
			
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e);
		}

	}

}
