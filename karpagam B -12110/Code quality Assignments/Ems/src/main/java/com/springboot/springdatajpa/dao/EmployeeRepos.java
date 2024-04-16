package com.springboot.springdatajpa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRepos {
	Connection con;
	PreparedStatement ps;
	String password = "password@12345" ;
	public void connectusingjdbc() throws SQLException
	{
		try 
		 {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?enabledTLSProtocols=TLSv1.2","root",password);
				ps=con.prepareStatement("insert into Tab values(?,?)");
				ps.setString(1,"Aha");
				ps.setString(2, "Oho");
				ps.executeUpdate();
				con.close();

			} 
		 	catch (ClassNotFoundException  | SQLException e ) 
		 	{
				e.printStackTrace();

			} 
		 finally {
			con.close();
			ps.close();
		}
	}

}
