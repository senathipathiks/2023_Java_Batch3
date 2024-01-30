package Day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db","root","Password@12345");
      
		
		Statement s=c.createStatement();
		
//		boolean a=s.execute("insert into student values(123,'sowmi')");
//		System.out.println(a);
//		if(a==false) {
//			System.out.println("1 row updated");
//		}
		
		ResultSet rs=s.executeQuery("select* from student");
		
		while(rs.next()) {
			System.out.println("id:"+rs.getInt(1)+"\nname:"+rs.getString(2));
			
		}
		
	}

}
