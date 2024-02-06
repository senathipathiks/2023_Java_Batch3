package com.day29;

import java.sql.*;


public class JDBCResultSetMetaDataEx1 {
	private final static String url = "jdbc:mysql://localhost:3306/sms_db";
	private final static String user = "root";
	private final static String password = "sam@6383587926";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			PreparedStatement ps = con.prepareStatement("select * from tbl_student");
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("No of Column : "+rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1)+"\t\t"+rsmd.getColumnName(2)+"\t\t"+rsmd.getColumnName(3)+"\t\t"+rsmd.getColumnName(4)+"\t\t"+rsmd.getColumnName(5));
			
			while(rs.next())
				System.out.println("Id : "+rs.getInt(1)+"\t\tName : "+rs.getString(2)+"\t\tGender : "+rs.getString(3)+"\t\tAge : "+rs.getInt(4)+"\t\tDepartment Id : "+rs.getInt(5));	
			
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
