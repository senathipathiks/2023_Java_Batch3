package com.day29;

import java.sql.*;

public class JDBCBatchExample1 {
	
	private final static String url = "jdbc:mysql://localhost:3306/sms_db";
	private final static String user = "root";
	private final static String password = "sam@6383587926";

	public static void main(String[] args)throws Exception {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			Statement st = con.createStatement();
			
			st.addBatch("insert into tbl_student value(9,'Vignesh','Male',24,1)");
			st.addBatch("insert into tbl_student value(10,'Lokesh','Male',24,2)");
			
			int a[] = st.executeBatch();
			
			if(a.length == 2)
				System.out.println("2 row inserted");
			
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
