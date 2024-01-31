package Com.Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//retreving bunch of records

public class JdbcBatchEg {

	public static void main(String[] args)throws Exception {
		
		final String url="jdbc:mysql://localhost:3306/stu_db";
		final String User="root";
		final String pass="Password@12345";
		
		Connection con=DriverManager.getConnection(url,User,pass);
		
		Statement stmt=con.createStatement();
		
//		stmt.addBatch("insert into student_details values(131,'Revathi','A')");
//		stmt.addBatch("insert into student_details values(132,'Anu','Y')");
		stmt.addBatch("insert into student_details values(134,'Anushiya','L')");
		
		stmt.executeBatch();
		
//        ResultSet rs=stmt.executeQuery("SELECT * FROM stu_db.student_details");
//        while(rs.next()) {
//        	System.out.println("1 row inserted");
//        }
       System.out.println("Inserted");
		con.close();



	}

}
