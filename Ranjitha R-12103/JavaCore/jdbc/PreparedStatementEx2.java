package jdbc;
//Batch Execution
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class PreparedStatementEx2 {

	public static void main(String[] args) throws SQLException {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC_db", "root", "Password@12345");

		String Query = "insert into Students values (?,?)";

		PreparedStatement pst = c.prepareStatement(Query);

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			System.out.println("Enter the user id :");

			int id = sc.nextInt();

			System.out.println("Enter the User name :");
			sc.nextLine();
			String name = sc.nextLine();

			pst.setInt(1, id);
			pst.setString(2, name);
			pst.addBatch();
		}

		int[] a = pst.executeBatch();

		System.out.println(Arrays.toString(a));
	}

}
