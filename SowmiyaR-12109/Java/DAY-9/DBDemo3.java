package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       final String URl="jdbc:mysql://localhost:3306/JDBC_db";
       final String User="root";
       final String pass="Password@12345";
       
       Class.forName("com.mysql.jdbc.Driver");
       
       Connection con=DriverManager.getConnection(URl,User,pass);
       
       Statement stmt=con.createStatement();
	
       stmt.addBatch("insert into Student values(1,'abi')");
       stmt.addBatch("insert into Student values(2,'Kiran')");
        stmt.executeBatch();
        
        con.close();
	}

}
