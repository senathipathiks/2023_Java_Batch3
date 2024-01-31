package day2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcMetaDataCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c;
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo1","root","root");

			PreparedStatement st=c.prepareStatement("select * from emp");



			ResultSet rs=st.executeQuery();
			ResultSetMetaData rsm=st.getMetaData();
			System.out.println("No of columns: "+rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1)+" "+rsm.getColumnName(2));

			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
