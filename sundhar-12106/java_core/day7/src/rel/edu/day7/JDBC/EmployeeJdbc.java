package rel.edu.day7.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeJdbc {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {

		boolean b = true;

		String ins = "insert into school.employee values(?,?,?)";
		String del = "delete from school.employee where eid=?";
		String up = "update school.employee set ename=? where eid=? ";
		String tru = "truncate table school.employee";
		String getAll = "select * from school.employee";

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		
//		String table[] = {"TABLE"};
//		ResultSet rs = c.getMetaData().getTables(null, null, null,table );
//		
//		while (rs.next()) {
//			System.out.println(rs.getString(1));
//		}

		System.out.println("\t\t\tWelcome to school databse");
		while (b) {
			System.out.println("1.Insert\n2.Update name\n3.Delete by id\n4.get all\n5.get by id\n6.Exit");
			int us_sel = sc.nextInt();
			switch (us_sel) {
			case 1: {
				//Insert
				int i = insert(c, ins);
				if (i == 1)
					System.out.println("data inserted successfully...!");
				else
					System.out.println("Technical issue occured ...!");
				break;
			}
			case 2: {
				int i = updateName(c,up);
				if(i == 1)
					System.out.println("\tdata updated successfully...!"+(char)3);
				else
					System.out.println("\t\t Technical error");
				break;}
			case 3:{
				//delete By Id
				int i = deleteByID(c, del);
				if (i == 1)
					System.out.println("data deleted successfully...!");
				else
					System.out.println("Technical issue occured ...!");
				break;}
			case 4: {
				//Fetch All
				ResultSet s = getAll(c, getAll);
				ResultSetMetaData md = s.getMetaData();
				System.out.println("no.of.columns is :"+md.getColumnCount());
				System.out.println(md.getColumnName(1)+" : "+md.getColumnName(2)+" : "+md.getColumnName(3));
				if (s == null)
					System.out.println("Sorry no data present in the database");
				else {
					System.out.println("\t\t data's are");
					while (s.next()) {
						System.out.println("Employee id " + s.getInt(1) + "\nEmployee name : " + s.getString(2)
								+ "\nEmployee salaray : " + s.getDouble(3));
					System.out.println("--------------------------------------");
					}
				}

				break;}
			case 5:{
				//Fetch by ID
				ResultSet s = getByID(c, getAll);
				if (s == null)
					System.out.println("Sorry no data present in the database");
				else {
					System.out.println("\t\t data's are");
					while (s.next())
						System.out.println("Employee id " + s.getInt(1) + "\nEmployee name : " + s.getString(2)
								+ "\nEmployee salaray : " + s.getDouble(3));
				}
				break;}
			case 6:
				b=false;
				break;

			default:
				System.out.println("Enter valid Input " + (char) 3);
				break;
			}
		}
	}

	public static int insert(Connection c, String q) throws SQLException {

		PreparedStatement ps = c.prepareStatement(q);
		System.out.println("enter the id value ");
		ps.setInt(1, sc.nextInt());
		sc.nextLine();
		System.out.println("enter the name of the employee");
		ps.setString(2, sc.nextLine());
		System.out.println("enter the employee salary");
		ps.setDouble(3, sc.nextDouble());

		return ps.executeUpdate();
	}

	public static int deleteByID(Connection c, String q) throws SQLException {

		PreparedStatement ps = c.prepareStatement(q);
		System.out.println("Please enter the ID");
		ps.setInt(1, sc.nextInt());
		return ps.executeUpdate();

	}

	public static ResultSet getAll(Connection c, String q) throws SQLException {
		PreparedStatement ps = c.prepareStatement(q);

		return ps.executeQuery();

	}
	
	public static ResultSet getByID(Connection c, String q) throws SQLException {
		PreparedStatement ps = c.prepareStatement(q);
		System.out.println("Please enter the ID");
		ps.setInt(1, sc.nextInt());
		return ps.executeQuery();
		
	}
	
	public static int updateName(Connection c, String q) throws SQLException {
		PreparedStatement ps = c.prepareStatement(q);
		
		System.out.println("enter the id of the employee");
		ps.setInt(2, sc.nextInt());
		sc.nextLine();
		System.out.println("enter the correct name of the employee");
		ps.setString(1, sc.nextLine());
		
		return ps.executeUpdate();
	}

}
