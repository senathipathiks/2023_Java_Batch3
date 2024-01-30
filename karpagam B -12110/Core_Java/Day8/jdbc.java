package Com.Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc {


	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu_db","root","Password@12345"); // to create a connection
		
        Statement s=c.createStatement();//call the createStatement() method on the Connection object you have retrieved using one of the DriverManager.
        
        boolean a=s.execute("insert into student_details values(128,'Nithish','S') ");// to execute we insert values into the specific table
        
        System.out.println(a);
        
        if(a==false) {// default value is true(Because resultset is not available) if the value are inserted boolean returns value
        	System.out.println("1 row updated");
        }
        
        ResultSet rs=s.executeQuery("SELECT * FROM stu_db.student_details");// to print that value in our console
        
        while(rs.next()) { //to print the next next statement using loop
        	System.out.println("StuId:"+rs.getInt(1)+"\nStuName:"+rs.getString(2)+"\nStuInitial:"+rs.getString(3));
        }
       
        }

}
