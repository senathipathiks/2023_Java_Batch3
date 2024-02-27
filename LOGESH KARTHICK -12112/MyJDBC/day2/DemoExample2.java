package practicejdbc.day2;
import java.sql.*;
public class DemoExample2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		final String URL = "jdbc:mysql://localhost:3306/sms_db";
		final String user ="root";
		final String pass = "Password@12345";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL,user,pass);
			
			PreparedStatement st = con.prepareStatement("Select * from emp");
			
			ResultSet rs = st.executeQuery();
			
			ResultSetMetaData rsm = st.getMetaData();
			
			System.out.println("no of columns :"+ rsm.getColumnCount());
			System.out.println(rsm.getColumnName(1)+""+rsm.getColumnName(2)+" "+rsm.getColumnName(3)+ " " + rsm.getColumnName(4));
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ " "+rs.getString(2)+ " "+rs.getInt(3)+" "+ rs.getString(4));
				
			}	
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}

}
