package JDBC;

import java.sql.*;

public class JDBCDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		


		
				
				final String URL="jdbc:mysql://localhost:3306/jdbc";
				final String User="root";
				final String pass="Password@12345";
				
				//Scanner sc=new Scanner(System.in);
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(URL,User,pass);
					
					DatabaseMetaData dbmd=con.getMetaData();
					
					String table[]= {"TABLE"};
					ResultSet rs=dbmd.getTables(null, null, null, table);
					
					while(rs.next()) {
						System.out.println(rs.getString(3));
					}
					con.close();
				}
				catch(Exception e)
				{System.out.println(e);}
			}

		

	}


