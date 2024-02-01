package JDBCDay2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCEx2_ResultInMatadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String URL="jdbc:mysql://localhost:3306/jdbc";
		final String User="root";
		final String pass="Password@12345";
		
		//Scanner sc=new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(URL,User,pass);
			
			PreparedStatement st=con.prepareStatement("Select * from employee");
			
			ResultSet rs=st.executeQuery();
			
			ResultSetMetaData rsm=st.getMetaData();
			System.out.println("No. of Columns:"+rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1)+" "+rsm.getColumnName(2));
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		
	}
catch(Exception e) {
	System.out.println(e);
}
	}}
