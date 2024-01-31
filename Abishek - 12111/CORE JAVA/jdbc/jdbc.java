package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/abishek","root","Password@12345");
		Statement s = c.createStatement();
		boolean a = s.execute("insert into the tbl_3 values(5, 'k1ng', 'M')");
		System.out.println(a);
		if(a==false)
		{
			System.out.println("1 row updated");
			
			
		}
		ResultSet rs = s.executeQuery("select  * from tbl_3");
		
		while(rs.next())
		{
			System.out.println("tbl_Id : " +rs.getInt(1) + "\nUname :) " +rs.getString(2));
		}
		
	}

}
