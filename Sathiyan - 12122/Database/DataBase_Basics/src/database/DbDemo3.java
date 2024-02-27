package database;

import java.sql.*;

public class DbDemo3 {

	public static void main(String[] args) throws Exception {
		
		final String URL="jdbc:mysql://localhost:3306/employee";
	    final String User="root";
	    final String pass="root";
	    
	    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(URL,User,pass);
        
        Statement stmt=con.createStatement();
        
        stmt.addBatch("insert into user values (32,'Dhinesh')");
        stmt.addBatch("insert into user values (89,'Gokul')");
        stmt.executeBatch();
        
        con.close();

	}

}
