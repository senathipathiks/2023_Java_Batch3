package Day9Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCDemo2 {

	public static void main(String[] args) {
		
		final String url="jdbc:mysql://localhost:3306/student1";
		final String uname="root";
		final String pass="root";
		

		try {
			Connection c= DriverManager.getConnection(url,uname,pass);
			
			PreparedStatement p=c.prepareStatement("select * from student");
			
			ResultSet rs=p.executeQuery();
			
			ResultSetMetaData rsm=p.getMetaData();
			
			System.out.println("No of columns :" + rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1)+" "+rsm.getColumnName(2)+" "+rsm.getColumnName(3));
			
			while(rs.next()) {
				System.out.println("id   :"+rs.getInt(1)+ "\nname :"+rs.getString(2) + " "+ rs.getInt(2));
			}
		}
			catch (Exception e) {
				System.out.println(e);
			}
		
	}

}
