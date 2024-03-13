package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;

public class DBDemo {

	public static void main(String[] args) {
		final String URL ="jdbc:mysql://localhost:3306/customer_deatails";
		final String User="root";
		final String pass="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(URL,User,pass);
			DatabaseMetaData dbmd= con.getMetaData();
			String table[]= {"TABLE"};
			ResultSet rs =dbmd.getTables(null, null, null,table);
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			con.close();
		}
     catch(Exception e) {
    	 System.out.println(e);
     }
	}

}
