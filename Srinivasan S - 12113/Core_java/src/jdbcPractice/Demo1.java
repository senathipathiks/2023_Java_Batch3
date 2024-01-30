package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Demo{
	Scanner sc=new Scanner(System.in);
	public void insert() throws SQLException {
		Connection c1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db1","root","Admin@123");
		
		String q1="insert into user values(?,?)"; //insert query
		
		PreparedStatement prs =c1.prepareStatement(q1); // prepared statement
		System.out.println("Enter id");
		int id=sc.nextInt();
		prs.setInt(1, id);
		System.out.println("Enter name");
		String name=sc.next();
		prs.setString(2,name);
		int a=prs.executeUpdate(); //executing the query using executeUpdate() method
		if(a==1) {
			System.out.println("1 row affected");
		}
	}
				
	
	
	public void update()throws SQLException{
		Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db1","root","Admin@123");
		
		String q2="UPDATE user SET uname= ? where (uid = ?)";
		
		PreparedStatement prs1=c2.prepareStatement(q2);
		System.out.println("Enter name");
		String name=sc.next();
		prs1.setString(1,name);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		prs1.setInt(2, id);
		
		
		int b=prs1.executeUpdate();
		if(b==1) {
			System.out.println("1 row affected");
		}
	}
	
	public void view()throws SQLException{
		Connection c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db1","root","Admin@123");
		
		String q3="SELECT * FROM jdbc_db1.user";
		PreparedStatement prs2=c3.prepareStatement(q3);
		
		ResultSet rs=prs2.executeQuery();
		while(rs.next()) {
			System.out.println("Id: "+rs.getInt(1)+" Name: "+rs.getString(2));
		}
	}
	
	public void delete() throws SQLException{
		Connection c4=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db1","root","Admin@123");
		
		String q4="DELETE FROM `jdbc_db1`.`user` WHERE (uid = ?)";
		PreparedStatement prs3=c4.prepareStatement(q4);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		prs3.setInt(1, id);
		
		int c=prs3.executeUpdate();
		
		if(c==1) {
			System.out.println("1 row affected");
		}
		
		
		
	}
}

public class Demo1 {
	
	public static void main(String[] args) throws SQLException {
		boolean flag=true;
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db1","root","Admin@123");
		Scanner sc=new Scanner(System.in);
		while(flag) {
			
		Demo d=new Demo();
		System.out.println("1.Add data\n2.Update data\n3.Read data\n4.Delete data");
		int val=sc.nextInt();
		
		switch (val) {
		case 1:
			d.insert();
			break;
		case 2:
			d.update();
			break;
		case 3:
			d.view();
			break;
		case 4:
			d.delete();
			break;
		default:
			System.err.println("Enter valid input");
			break;
		}
		System.out.println("Are you want to continue");
		System.out.println("1.Yes\n2.No");
		int opt=sc.nextInt();
		if(opt==1) {
			flag=true;
		}
		else
			flag=false;
		}
	}
	
}
