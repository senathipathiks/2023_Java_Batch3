package dummyjdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbcFile1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");
		Statement s=c.createStatement();
		boolean a=s.execute("insert into emp values(1214,'hemz')");
		System.out.println(a);
		if(a==false) {
			System.out.println("1 row updated");
		}
		ResultSet rs=s.executeQuery("select * from emp");

		while(rs.next()) {
			System.out.println("id :"+rs.getInt(1)+"  name :"+rs.getString(2));
		}

	}

}
