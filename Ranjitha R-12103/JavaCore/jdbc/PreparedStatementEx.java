package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db", "root", "Password@12345");

		String q = "insert into Students values(?,?)";
		String Q3 = "delete from Students where no=?";
		String Q4 = "UPDATE Students SET name=? WHERE(no=?)";

		PreparedStatement p = c.prepareStatement(Q4);
		Scanner sc = new Scanner(System.in);
		// add details
//		System.out.println("Enter the no");
//		int no = sc.nextInt();
//		System.out.println("Enter the name");
//		String name = sc.next();
//
//		p.setInt(1, no);
//		p.setString(2, name);
//
//		int a = p.executeUpdate();
//		if (a == 1) {
//			System.out.println("1 Row affected");
//		}

		// view tables
//		String Q2 = "select*from Students";
//		ResultSet rs = p.executeQuery(Q2);
//		while (rs.next()) {
//			System.out.println("no:" + rs.getInt(1) + "\nname:" + rs.getString(2));
//		}
//
//		// delete record
//		System.out.println("Enter the no you want to delete");
//		int no = sc.nextInt();
//		p.setInt(1, no);
//		int a = p.executeUpdate();
//		if (a == 1) {
//			System.out.println("1 row deleted");
//		}

		// update record
		System.out.println("Enter the name you want to update:");

		String s = sc.nextLine();
		p.setString(1, s);

		System.out.println("Enter exisiting id");

		int id = sc.nextInt();

		p.setInt(2, id);

		int a = p.executeUpdate();

		if (a == 1) {
			System.out.println("1 row updated");
		}
	}

}
