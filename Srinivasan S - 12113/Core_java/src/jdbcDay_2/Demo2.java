package jdbcDay_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) throws SQLException{
		final String URL="jdbc:mysql://localhost:3306/jdbc_db1";
		final String user="root";
		final String pwd="Admin@123";
		
		Connection c=DriverManager.getConnection(URL,user,pwd);	//getting connection
		
		String q="SELECT * FROM jdbc_db1.user;";
		PreparedStatement prs=c.prepareStatement(q);	//setting statement
		
		ResultSet rs=prs.executeQuery();
		
		ResultSetMetaData meta=prs.getMetaData();	//getting meta data
		
		System.out.println("No of columns :"+meta.getColumnCount());	//getting column count
		System.out.println(meta.getColumnName(1)+" "+meta.getColumnName(2)); //getting column name 
		
		while (rs.next()) {
			System.out.println("Id : "+rs.getInt(1)+" Name : "+rs.getString(2));
		}
	

	}

}
