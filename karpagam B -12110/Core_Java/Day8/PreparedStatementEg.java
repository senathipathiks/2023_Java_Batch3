package Com.Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//dynamic 
public class PreparedStatementEg {

	public static void main(String[] args) throws SQLException {
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu_db","root","Password@12345"); // to create a connection

		String Q1="insert into student_details values(?,?,?)";
		
		String Q2="SELECT * FROM student_details";
		
		String Q3="delete from student_details where StuId=?";
		
		String Q4 = "UPDATE student_details SET StuName = ? WHERE (StuId = ?)";  
		
		PreparedStatement p=c.prepareStatement(Q4); //create prepare statement and connect it with the table values
		
		Scanner sc=new Scanner(System.in);// get input from user
		
		//*****add details into table
		
//		System.out.println("Enter the Id:");
//		int id=sc.nextInt();

//		System.out.println("Enter the name:");
//		String name=sc.next();
//		
//		System.out.println("Enter the Initial:");
//		String Initial=sc.next();
//		
//		p.setInt(1, id); //set with their attributes
//		p.setString(2,name);
//		p.setString(3,Initial);
//		
//		int a=p.executeUpdate();
//		if(a==1) {
//			System.out.println("1 row affected");
//		}
		
		
		

//		//*****view table details

//		ResultSet rs=p.executeQuery(Q2);
//		while(rs.next()) {
//        	System.out.println("StuId:"+rs.getInt(1)+"\nStuName:"+rs.getString(2)+"\nStuInitial:"+rs.getString(3));
//        }
		
		
		
        //*****delete records
		
//		 System.out.println("Enter the id you want to delete");
//	        int id=sc.nextInt();
//	        p.setInt(1, id);
//	        int a= p.executeUpdate();
//	        if(a==1) {
//	            System.out.println("1 row deleted");
//	            }
		
		//*****Update the table details
		
		System.out.println("Enter the name you want to update:");
    
        String s =sc.nextLine();
        p.setString(1, s);
    
        System.out.println("Enter exisiting id");
        int id=sc.nextInt();
    
        p.setInt(2, id);      
        int a=p.executeUpdate();
      
        if (a==1) {
          System.out.println("1 row updated");
        }
    
      
  }

}
