import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx2 {
public static void main(String[] args) throws SQLException {
	
	Connection c=DriverManager.getConnection("JDBC:mysql://localhost:3306/user_details", "root", "Password@12345");
	
	String s="insert into customer values(?,?)";
	String s1="delete from customer Where cus_id=?";
	
	
	PreparedStatement p=c.prepareStatement(s);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id :");
	int id=sc.nextInt();
	
	System.out.println("Enter Name :");
	String n=sc.next();
	
	p.setInt(1, id);
	p.setString(2, n);
	
	int m=p.executeUpdate();
	if(m==1) {
		System.out.println("1 Row Affected");
	}
	
	ResultSet r=p.executeQuery("select *from customer");
    System.out.println(p);
		
}
}

