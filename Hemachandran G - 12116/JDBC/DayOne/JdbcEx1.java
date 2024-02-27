package DayOne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx1 {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement s = c.createStatement();
		
		boolean b = s.execute("insert into empdetails values (5,'Abii', 20000.00, 'Avadi', '9876785643')");
		
		System.out.println(b);
		
		if(b==false) {
			System.out.println("1 row affected");
		}
		
//		ResultSet rs = s.executeQuery("select * from student");
//		
//		while (rs.next()) {
//			System.out.println("id : "+rs.getInt(1) + "\nname : "+rs.getString(2));
//		}

	}

}
