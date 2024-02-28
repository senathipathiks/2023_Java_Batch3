package Day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class JdbcDemo4 {
	 
		public static void main(String[] args) throws SQLException {
			String url = "jdbc:mysql://localhost:3306/c_db";
			String userName = "root";
			String password = "Prem@1234";
			
			Connection con=DriverManager.getConnection(url,userName,password);
			
			PreparedStatement st=con.prepareStatement("select * from employee");
			
			ResultSet rs=st.executeQuery();
			
			System.out.println("No of rows afffected:"+rs);
			
		    ResultSetMetaData rsm=st.getMetaData();
			System.out.println("No.of Columns:"+ rsm.getColumnCount());
			System.out.println(rsm.getColumnClassName(1)+""+rsm.getColumnName(2)+""+rsm.getColumnName(3));
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3)+"");
			}
			
	}

}
