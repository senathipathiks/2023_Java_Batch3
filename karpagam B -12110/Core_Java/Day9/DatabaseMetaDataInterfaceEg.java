package Com.Day2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class DatabaseMetaDataInterfaceEg {

	public static void main(String[] args) {
		final String url="jdbc:mysql://localhost:3306/stu_db";
		final String User="root";
		final String pass="Password@12345";
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,User,pass);
			DatabaseMetaData dbmd=con.getMetaData(); //to know the data of other data	
			
			String table[]= {"TABLE"};
			ResultSet rs=dbmd.getTables(null,null,null,table);// DB name of the database,The table schema name.,The table name,table type either table or view
			while(rs.next()) {
				System.out.println(rs.getString(3));
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
}

}
