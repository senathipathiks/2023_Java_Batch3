package JDBCday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement1 {

	public static void main(String[] args) throws SQLException {

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "Password@12345");

		String q = "insert into stu values(?,?)";
		String Q3 = "delete from   stu where stu_id= ?";
		String Q4 = "UPDATE stu SET  stu_name=? WHERE (stu_id=?)";

		PreparedStatement p = c.prepareStatement(Q4);

		String Q2 = "select*from stu";
		ResultSet rs = p.executeQuery(Q2);

		while (rs.next()) {
			System.out.println("id   :" + rs.getInt(1) + "\nname :" + rs.getString(2));

		}

		Scanner sc = new Scanner(System.in);
		// delete records

		System.out.println("Enter the id you want to delete");
		int id = sc.nextInt();
		p.setInt(1, id);
		int a = p.executeUpdate();
		if (a == 1) {
			System.out.println("1 row deleted");

			// update table
//	        
//	        System.out.println("Enter the name you want to update:");
//	        
//	        String s =sc.nextLine();
//	        p.setString(1, s);
//	        
//	        System.out.println("Enter exisiting id");
//	        
//	        int idd=sc.nextInt();
//	        
//	        p.setInt(2, idd);
//	        
//	        int a=p.executeUpdate();
//	        
//	        if (a==1) {
//	            System.out.println("1 row updated");
//	        }

			// add details
//	        System.out.println("Enter the id");
//	        
//	        int id=sc.nextInt();
//	        
//	        System.out.println("Enter the name");
//	        
//	        String name=sc.next();
//	        
//	        p.setInt(1, id);
//	        p.setString(2, name);
//	        
//	        int a=p.executeUpdate();
//	        if(a==1) {
//	            System.out.println("1 Row Affected");
//	        }

			// view tables

			String Q21 = "select*from student";
			ResultSet rs1 = p.executeQuery(Q21);

			while (rs1.next()) {
				System.out.println("id   :" + rs1.getInt(1) + "\nname :" + rs1.getString(2));

			}

//	        

		}

	}

}
