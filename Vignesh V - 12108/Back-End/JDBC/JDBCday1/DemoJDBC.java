package JDBCday1;


import java.sql.*;

public class DemoJDBC {
	
	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","Password@12345");
		
		Statement s= c.createStatement();
		
		String query = "insert into stu values (3,'Sathya')";
		String query2 = "select * from stu";
		boolean  a=s.execute(query);
		System.out.println(a);
		
		if(a==false) {
			System.out.println("1 row updated");
		}
		
		ResultSet rs=s.executeQuery(query2);
		
		while(rs.next())
			System.out.println("id :"+rs.getInt(1)+ "\tname : "+rs.getString(2));
	}
}

