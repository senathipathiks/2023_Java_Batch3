package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demojdbc {
	public void update() throws SQLException {

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "root");


		String q4="update user set uname= ? where uid= ?";
		PreparedStatement pst= c.prepareStatement(q4);

		pst.setString(1,"Kiruba");
		pst.setInt(2,104);

		int c1 = pst.executeUpdate();

		if(c1==1) {

			System.out.println("1 row deleted");
		}


	}
	//	public void delete() throws SQLException {
	//		
	//		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "root");
	//		
	//		
	//		String q3="delete from user where uid=?";
	//		PreparedStatement pst= c.prepareStatement(q3);
	//		
	//		pst.setInt(1, 102);
	//		
	//		int b = pst.executeUpdate();
	//		
	//		if(b==1) {
	//			
	//			System.out.println("1 row deleted");
	//		}
	//		
	//		
	//		
	//	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "root");

		String q="insert into user values(?,?)";

		PreparedStatement pst	= c.prepareStatement(q);
		pst.setInt(1, 19);
		pst.setString(2, "dur");
		int a = pst.executeUpdate();

		if(a==1) {
			System.out.println("1 row value updated");
		}


		String q2 ="select*from user";
		ResultSet rs	= pst.executeQuery(q2);

		while(rs.next()) {
			System.out.println("User id :"+rs.getInt(1)+"\nUser Name :"+rs.getString(2));
		}

		Demojdbc r = new Demojdbc ();
		//    r.delete();
		r.update();
	}




}
