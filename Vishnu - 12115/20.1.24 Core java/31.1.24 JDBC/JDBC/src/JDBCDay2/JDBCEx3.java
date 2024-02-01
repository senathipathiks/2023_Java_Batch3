package JDBCDay2;

import java.sql.*;

//Run multiple query in silgle short itself

public class JDBCEx3 {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		// TODO Auto-generated method stub
		
		
		final String URL="jdbc:mysql://localhost:3306/jdbc";
		final String User="root";
		final String pass="Password@12345";
		
		//Scanner sc=new Scanner(System.in);
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(URL,User,pass);
			
			Statement stmt=con.createStatement();
			
			stmt.addBatch("insert into employee values(3,'Deva')");
			stmt.addBatch("insert into employee values(4,'Sri')");
			stmt.executeBatch();
			
			con.close();
	}

}
