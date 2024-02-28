package Day8;

import java.sql.*;

public class JdbcDemo1 {

	public static void main(String[] args) throws Exception {
		// readRecords();
		// insertRecords();
		// insertVar();
		insertUsingPst();
	}
	  // callable statement
     // prepared statement 
	 // batch processing

	public static void readRecords() throws Exception {
		String url = "jdbc:mysql://localhost:3306/c_db";
		String userName = "root";
		String password = "Prem@1234";
		String query = "Select * from employee";
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();// static
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.println("Id is " + rs.getInt(1));
			System.out.println("Name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getInt(3));
		}
		con.close();
	}

	// directly run throw hardcode
	public static void insertRecords() throws Exception {
		String url = "jdbc:mysql://localhost:3306/c_db";
		String userName = "root";
		String password = "Prem@1234";
		String query = "insert into employee values(4,'Gokul',500000)";

		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);

		System.out.println("Number of rows affected: " + rows);
		con.close();
	}

	// insert without hardcode by variables
	public static void insertVar() throws Exception {
		String url = "jdbc:mysql://localhost:3306/c_db";
		String userName = "root";
		String password = "Prem@1234";

		int id = 5;
		String name = "Navii";
		int salary = 70000;

		// String query = "insert into employee values(4,'Gokul',500000)";
		String query = "insert into employee values(" + id + ",'" + name + "'," + salary + ");";

		Connection con = DriverManager.getConnection(url, userName, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);

		System.out.println("Number of rows affected: " + rows);
		con.close();
	}

	// preparedstatement

	public static void insertUsingPst() throws Exception {
		String url = "jdbc:mysql://localhost:3306/c_db";
		String userName = "root";
		String password = "Prem@1234";

		int id = 7;
		String name = "Neela";
		int salary = 700000;

		// String query = "insert into employee values(4,'Gokul',500000)";
		String query = "insert into employee values(?,?,?)";

		Connection con = DriverManager.getConnection(url, userName, password);

		PreparedStatement pst = con.prepareStatement(query);

		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, salary);
		int rows = pst.executeUpdate();

		System.out.println("NUmber of Rows Affected:" + rows);

		con.close();
	}

}
