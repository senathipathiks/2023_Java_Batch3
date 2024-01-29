package rel.edu.JDBC.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) throws SQLException {

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

		Statement s = c.createStatement();
//		
//		s.execute("INSERT INTO `school`.`student` (`id`, `name`, `age`, `class`) VALUES ('2', 'Srinivasan', '22', '12')");
//		System.out.println("Inserted Successfully...!");
//		s.close();

//		PreparedStatement ps = c.prepareStatement("insert into student values (?,?,?,?)");
//		ps.setInt(1, 3);
//		ps.setString(2, "Jothi");
//		ps.setInt(3, 23);
//		ps.setInt(4, 12);
//		
//		boolean b = ps.execute();
//		
//		if(b)
//			System.out.println("Data not inserted...@");
//		else
//			System.out.println("data inserted successfully..!");

//		ResultSet rs = s.executeQuery("select * from school.student");

//		System.out.println(rs.toString());

//	 	rs.next();

//		while (rs.next()) {
//			System.out.println("id :" + rs.getInt(1) + "\nname : " + rs.getString(2) + "\nage: " + rs.getInt(3)
//					+ "\nclass : " + rs.getInt(4));
//			System.out.println("---------------------------");
//		}
		
		int b = s.executeUpdate("update school.student set name ='jothiLingam' where id = 3");
		
		if(b == 1)
			System.out.println("update successfully...!");

	}

}
