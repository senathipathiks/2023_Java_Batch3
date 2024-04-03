package SpringBoot.SpringDataJPA.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeRepos {
	
	public void connectusingjdbc()
	{
		 try 
		 {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?enabledTLSProtocols=TLSv1.2","111","1111");
				PreparedStatement ps=con.prepareStatement("insert into Tab values(?,?)");
				ps.setString(1,"Aha");
				ps.setString(2, "Oho");
				ps.executeUpdate();
				System.out.println("Data Inserted");
			} 
		 	catch (ClassNotFoundException e) 
		 	{
				System.out.print(e.getMessage());
			} catch (SQLException e) 
		 	{
				e.printStackTrace();
			}
	}

}
