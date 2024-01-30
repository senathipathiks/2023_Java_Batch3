package exampleDay_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws SQLException{
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/userref","root","Admin@123");
		
		Statement s=c.createStatement();
		
//		boolean a=s.execute("insert into new_table values(102,'Viya')");
//		
//		System.out.println(a);
//		
//		if(a==false) {
//			System.out.println("1 row affected");
//		}
//		
//		ResultSet rs=s.executeQuery("SELECT * FROM userref.new_table;");
//		
//		while (rs.next()) {
//			System.out.println("Id : "+rs.getInt(1)+"\nName : "+rs.getString(2));
//		}
		
		boolean b=s.execute("delete from new_table where id=102");
		System.out.println(b);
		if(b==false) {
			System.out.println("1row affected");
		}
		
		
		
	}

}
