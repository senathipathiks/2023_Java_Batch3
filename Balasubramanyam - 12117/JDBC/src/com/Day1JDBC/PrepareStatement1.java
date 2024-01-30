package com.Day1JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

public class PrepareStatement1 {

	static String url = "jdbc:mysql://localhost:3306/user";
	static String userid = "root";
	static String pass = "root";

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(url, userid, pass);

		String query = "insert into user values (?, ?, ?, ?, ?)";

		PreparedStatement pst = con.prepareStatement(query);

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the user id: ");
			int id = sc.nextInt();

			System.out.println("Enter the user name: ");
			sc.nextLine();
			String names = sc.nextLine();

			System.out.println("Enter the phone number: ");
			String phoneNumber = sc.nextLine();

			System.out.println("Enter the address: ");
			String address = sc.nextLine();

			System.out.println("Enter the salary: ");
			double salary = sc.nextDouble();

			pst.setInt(1, id);
			pst.setString(2, names);
			pst.setString(3, phoneNumber);
			pst.setString(4, address);
			pst.setDouble(5, salary);
			pst.addBatch();
		}

		int[] result = pst.executeBatch();

		System.out.println(Arrays.toString(result));
	}

}
