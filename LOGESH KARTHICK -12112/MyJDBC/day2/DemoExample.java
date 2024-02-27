package practicejdbc.day2;

import java.sql.*;



public class DemoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String URL = "jdbc:mysql://localhost:3306/sms_db";
		final String user ="root";
		final String pass = "Password@12345";
		try
		{
			Connection c=DriverManager.getConnection(URL,user,pass);
			DatabaseMetaData db= c.getMetaData();
			 String table[]= {"TABLE"};
			 ResultSet rs =db.getTables(null, null, null, table);
			 while(rs.next())
			 {
				 System.out.println(rs.getString(1)+" : "+rs.getString(3));
			 }
			c.close();
		}
		catch(Exception e)
		{System.out.println(e);
			
		}
		}

	}

