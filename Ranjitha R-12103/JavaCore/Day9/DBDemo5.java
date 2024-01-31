package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class DBDemo5 {

	public static void main(String[] args) throws Exception {
		final String URL = "jdbc:mysql://localhost:3306/JDBC_db";
		final String User = "root";
		final String pass = "Password@12345";
		Scanner sc = new Scanner(System.in);
		int no;
		String name;
		char ch;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, User, pass);
		PreparedStatement ps = con.prepareStatement("insert into Students values(?,?)");

		do {
			System.out.println("Enter the no:");
			no = sc.nextInt();
			System.out.println("Enter the name:");
			name = sc.next();
			ps.setInt(1, no);
			ps.setString(2, name);
			ps.addBatch();
			System.out.println("Do you wish to continue(Y/N)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		int[] rs = ps.executeBatch();
		System.out.println(Arrays.toString(rs));

	}

}
