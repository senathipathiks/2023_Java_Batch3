package dummyjdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BatchJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");


		String Query = "insert into emp values (?,?)";

		PreparedStatement pst = con.prepareStatement(Query);

		Scanner sc = new Scanner (System.in);

		for (int i = 0; i < 2; i++) {

			System.out.println("Enter the emp id :");

			int id = sc.nextInt();

			System.out.println("Enter the emp name :");
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
